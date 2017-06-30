/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package damage;

import damage.Damage.DamageType;

public abstract class DamageToughness {
    
    protected DamageType damageType;
    
    public DamageToughness(DamageType damageType) {
        this.damageType = damageType;
    }
    
    public DamageType damageType() {
        return damageType;
    }

}
