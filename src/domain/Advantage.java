/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package domain;

import domain.Damage.DamageType;
import enums.Ability;

public class Advantage extends Resistance {

    public enum CheckType {
        CHECK, SAVING_THROW;
    }

    private Ability ability;
    private CheckType type;

    public Advantage(Ability ability, CheckType type) {
        super(null);
        this.ability = ability;
        this.type = type;
    }

    public Advantage(DamageType damageType, CheckType type) {
        super(damageType);
        this.damageType = damageType;
        this.type = type;
    }

    public Ability ability() {
        return ability;
    }

    public CheckType type() {
        return type;
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
        return null;
    }

}
