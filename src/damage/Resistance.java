/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package damage;

import damage.Damage.DamageType;

public class Resistance extends DamageToughness {

    public Resistance(DamageType damageType) {
        super(damageType);
    }

    @Override
    public String toString() {
        String damage = damageType.name().toLowerCase().replace('_', ' ');
        return String.format("You have resistance against %s damage.", damage);
    }

}
