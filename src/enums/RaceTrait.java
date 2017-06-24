/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package enums;

import domain.Advantage;
import domain.Advantage.CheckType;
import domain.Damage;
import domain.Damage.DamageType;
import domain.Proficiency;
import domain.Resistance;

public enum RaceTrait {

    DARKVISION("You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray."),
    DWARVEN_RESILIENCE(new Advantage(DamageType.POISON, CheckType.SAVING_THROW), new Resistance(DamageType.POISON));
    //DWARVEN_COMBAT_TRAINING(new Proficiency<Weapon>(new Weapon[] {}))

    private String description;
    private Resistance[] resistances;
    private Proficiency proficiency;

    RaceTrait(String description) {
        this.description = description;
    }

    RaceTrait(Resistance... resistances) {
        this.resistances = resistances;
        for (int i = 0; i < resistances.length; i++) {
            description += resistances[i].toString();
            if (i != resistances.length - 1) {
                description += "\n";
            }
        }
    }
    
    RaceTrait(Proficiency proficiency) {
        
    }

    String description() {
        return description;
    }

}
