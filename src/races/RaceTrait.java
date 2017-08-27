/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import ability.Ability;
import ability.Skill;
import ability.WisdomSkills;
import damage.Advantage;
import damage.Condition;
import damage.Damage.DamageType;
import domain.Proficiency;
import damage.DamageToughness;
import damage.Resistance;
import enums.CheckType;
import gear.armor.Armor;
import gear.armor.LightArmor;
import gear.armor.MediumArmor;
import gear.weapon.IWeapon;
import gear.weapon.MartialMeleeWeapon;
import gear.weapon.MartialRangedWeapon;
import gear.weapon.SimpleMeleeWeapon;
import gear.weapon.SimpleRangedWeapon;
import gear.weapon.Weapon;
import java.util.ArrayList;
import java.util.List;
import magic.Spellbook;
import xmlmapping.*;

public class RaceTrait {

    protected static WeaponMapper weaponMapper = new WeaponMapper();
    protected static ArmorMapper armorMapper = new ArmorMapper();
    protected static SpellMapper spellMapper = new SpellMapper();

    

    public enum RaceTrait2 {

        DARKVISION(),
        DWARVEN_RESILIENCE(new RaceTraitBuilder()
                .addDescription("You have advantage on saving throws against poison, and you have Resistance against poison damage.")
                .addDamageToughness(new Resistance(DamageType.POISON))
                .addAdvantages(new Advantage(DamageType.POISON, CheckType.SAVING_THROW))
                .build()),
        DWARVEN_COMBAT_TRAINING(new RaceTraitBuilder()
                .addDescription("You have proficiency with the Battleaxe, Handaxe, Light Hammer, and Warhammer.")
                .addProficiencies(new Proficiency<Weapon>(new Weapon[]{weaponMapper.selectByName("BattleAxe", MartialMeleeWeapon.class), weaponMapper.selectByName("Handaxe", SimpleMeleeWeapon.class), weaponMapper.selectByName("Light Hammer", SimpleMeleeWeapon.class), weaponMapper.selectByName("Warhammer", MartialMeleeWeapon.class)}))
                .build()),
        STONECUNNING(new RaceTraitBuilder()
                .addDescription("Whenever you make an Intelligence (History) check related to the origin of stonework, you are considered proficient in the History skill and add double your proficiency bonus to the check, instead of you normal proficiency bonus.")
                .build()),
        DWARVEN_TOUGHNESS(),
        KEEN_SENSES(),
        FEY_ANCESTRY(),
        TRANCE(),
        ELF_WEAPON_TRAINING(new RaceTraitBuilder()
                .addDescription("You have proficiency with the Longsword, Shortsword, Shortbow, and Longbow.")
                .addProficiencies(new Proficiency<Weapon>(new Weapon[]{weaponMapper.selectByName("Longsword", MartialMeleeWeapon.class), weaponMapper.selectByName("Shortsword", MartialMeleeWeapon.class), weaponMapper.selectByName("Shortbow", SimpleRangedWeapon.class), weaponMapper.selectByName("Longbow", MartialRangedWeapon.class)}))
                .build()),
        DWARVEN_ARMOR_TRAINING(),
        CANTRIP(new RaceTraitBuilder()
                .addDescription("You know one cantrip of your choice from the Wizard spell list. Intelligence is your spellcasting ability for it.")
                .addSpellbook(new Spellbook(Ability.INTELLIGENCE, new Choice<ISpell>())));

        private RaceTrait raceTrait;

        RaceTrait(RaceTrait raceTrait) {
            this.raceTrait = raceTrait;
        }

        public String fullDescription() {
            String description = "";
            if (raceTrait.description != null) {
                description += raceTrait.description;
            }
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

    private String name;
    private String description = "";
    private DamageToughness[] resistances = new DamageToughness[0];
    private Advantage[] advantages = new Advantage[0];
    private Proficiency[] proficiencies = new Proficiency[0];
    private Spellbook spellbook;

    public RaceTrait(String name, String description, DamageToughness[] resistances, Advantage[] advantages, Proficiency[] proficiencies, Spellbook spellbook) {
        this.name = name;
        this.description = description;
        this.resistances = resistances;
        this.advantages = advantages;
        this.proficiencies = proficiencies;
        this.spellbook = spellbook;
    }
    
    public List<Pro>
}
