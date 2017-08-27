/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package damage;

import damage.Damage.DamageType;
import ability.Ability;
import ability.Skill;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import enums.CheckType;

@XStreamAlias("Advantage")
public class Advantage {

    protected Ability ability;
    protected Skill skill;
    protected CheckType type;
    protected DamageType damageType;
    protected Condition condition;

    public Advantage(Ability ability, CheckType type) {
        this.ability = ability;
        this.type = type;
    }

    public Advantage(DamageType damageType, CheckType type) {
        this.type = type;
        this.damageType = damageType;
    }

    public Advantage(Skill skill) {
        this.skill = skill;
        this.type = CheckType.CHECK;
    }
    
    public Advantage(Condition condition, CheckType type) {
        this.condition = condition;
        this.type = type;
    }

    public Ability ability() {
        return ability;
    }

    public CheckType type() {
        return type;
    }

    public DamageType damageType() {
        return damageType;
    }

    @Override
    public String toString() {
        String type = this.type.name().toLowerCase().replace('_', ' ');
        if (ability != null) {
            String ability = this.ability.name().toLowerCase();
            return String.format("You have advantage on %s %ss.", ability, type);
        }
        if (damageType != null) {
            String damage = this.damageType.name().toLowerCase();
            return String.format("You have advantage on %ss against %s damage.", type, damage);
        }
        if (skill != null) {
            String damage = ((Enum)this.skill).name().toLowerCase();
            return String.format("You have advantage on %ss against %s damage.", type, damage);
        }
        if (condition != null) {
            String condition = this.condition.toString().toLowerCase();
            return String.format("You have advantage on %ss against being %s", type, condition);
        }
        return null;
    }

}
