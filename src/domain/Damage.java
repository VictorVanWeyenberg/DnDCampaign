/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

import enums.Dice;

public class Damage {
    
    public enum DamageType {
        BLUDGEONING, PIERCING, SLASHING,
        POISON;
    }
    
    private Number damage = 0;
    private DamageType type;
    
    public Damage(Number damage, DamageType type) {
        this.damage = damage;
        this.type = type;
    }
    
    public Damage() {
    }
    
    public Number damage() {
        return damage;
    }
    
    public DamageType type() {
        return type;
    }

}
