/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

import domain.Damage.DamageType;

public class Resistance {
    
    
    protected DamageType damageType;
    
    public Resistance(DamageType damageType) {
        this.damageType = damageType;
    }
    
    public DamageType damageType() {
        return damageType;
    }

    @Override
    public String toString() {
        String damage = damageType.name().toLowerCase().replace('_', ' ');
        return String.format("You have resistance against %s damage.", damage);
    }

}
