/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package damage;

import ability.Ability;
import ability.Skill;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Damage.DamageType;
import enums.CheckType;

@XStreamAlias("Disadvantage")
public class Disadvantage extends Advantage {

    public Disadvantage(Ability ability, CheckType type) {
        super(ability, type);
    }

    public Disadvantage(DamageType damageType, CheckType type) {
        super(damageType, type);
    }

    public Disadvantage(Skill skill) {
        super(skill);
    }

    @Override
    public String toString() {
        String type = this.type.name().toLowerCase().replace('_', ' ');
        if (ability != null) {
            String ability = this.ability.name().toLowerCase();
            return String.format("You have disadvantage on %s %ss.", ability, type);
        }
        if (damageType != null) {
            String damage = this.damageType.name().toLowerCase();
            return String.format("You have disadvantage on %ss against %s damage.", type, damage);
        }
        if (skill != null) {
            String damage = ((Enum) this.skill).name().toLowerCase();
            return String.format("You have disadvantage on %ss against %s damage.", type, damage);
        }
        return null;
    }

}
