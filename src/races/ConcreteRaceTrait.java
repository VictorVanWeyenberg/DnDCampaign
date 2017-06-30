/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import damage.Advantage;
import damage.Damage.DamageType;
import domain.Proficiency;
import damage.DamageToughness;
import damage.Resistance;
import enums.CheckType;
import gear.IWeapon;
import gear.MartialMeleeWeapon;
import gear.SimpleMeleeWeapon;

public class ConcreteRaceTrait {

    private static class ConcreteRaceTraitBuilder {

        private String description;
        private DamageToughness[] damageToughness;
        private Advantage[] advantages;
        private Proficiency[] proficiencies;

        public ConcreteRaceTraitBuilder addDescription(String description) {
            this.description = description;
            return this;
        }

        public ConcreteRaceTraitBuilder addDamageToughness(DamageToughness... damageToughness) {
            this.damageToughness = damageToughness;
            return this;
        }
        
        public ConcreteRaceTraitBuilder addAdvantages(Advantage... advantages) {
            this.advantages = advantages;
            return this;
        }

        public ConcreteRaceTraitBuilder addProficiencies(Proficiency... proficiencies) {
            this.proficiencies = proficiencies;
            return this;
        }

        public ConcreteRaceTrait build() {
            return new ConcreteRaceTrait(description, damageToughness, advantages, proficiencies);
        }

    }

    public enum RaceTrait {

        DARKVISION(new ConcreteRaceTraitBuilder().addDescription("You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.").build()),
        DWARVEN_RESILIENCE(new ConcreteRaceTraitBuilder().addDamageToughness(new Resistance(DamageType.POISON)).addAdvantages(new Advantage(DamageType.POISON, CheckType.SAVING_THROW)).build()),
        DWARVEN_COMBAT_TRAINING(new ConcreteRaceTraitBuilder().addProficiencies(new Proficiency<IWeapon>(new IWeapon[] {MartialMeleeWeapon.BATTLEAXE, SimpleMeleeWeapon.HANDAXE, SimpleMeleeWeapon.LIGHT_HAMMER, MartialMeleeWeapon.WARHAMMER})).build()),
        STONECUNNING(new ConcreteRaceTraitBuilder().addDescription("Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of you normal proficiency bonus.").build()),
        DWARVEN_TOUGHNESS(new ConcreteRaceTraitBuilder().addDescription("Your hitpoint maximum increases by 1, and it increases by 1 every time you gain a level.").build());
        //DWARVEN_ARMOR_TRAINING(new ConcreteRaceTraitBuilder().addProficiencies(new Proficiency(Armor.LIGHT_ARMOR, Armor.MEDIUM_ARMOR)).build());
        
        private ConcreteRaceTrait raceTrait;

        RaceTrait(ConcreteRaceTrait raceTrait) {
            this.raceTrait = raceTrait;
        }

        public String fullDescription() {
            String description = raceTrait.description;
            if (!description.isEmpty()) {
                description += "\n";
            }
            if (raceTrait.resistances != null) {
                for (DamageToughness resistance : raceTrait.resistances) {
                    description += resistance.toString();
                }
            }
            if (!description.isEmpty()) {
                description += "\n";
            }
            if (raceTrait.proficiencies != null) {
                for (Proficiency proficiency : raceTrait.proficiencies) {
                    description += proficiency.toString();
                }
            }
            return description;
        }
        
        public Proficiency[] proficiencies() {
            return raceTrait.proficiencies;
        }
        
        public DamageToughness[] resistances() {
            return raceTrait.resistances;
        }
        
        public Advantage[] advantages() {
            return raceTrait.advantages;
        }

    }

    private String description = "";
    private DamageToughness[] resistances = new DamageToughness[0];
    private Advantage[] advantages = new Advantage[0];
    private Proficiency[] proficiencies = new Proficiency[0];

    private ConcreteRaceTrait(String description, DamageToughness[] resistances, Advantage[] advantages, Proficiency[] proficiencies) {
        this.description = description;
        this.resistances = resistances;
        this.advantages = advantages;
        this.proficiencies = proficiencies;
    }
}
