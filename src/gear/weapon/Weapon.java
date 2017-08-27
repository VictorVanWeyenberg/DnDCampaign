/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear.weapon;

import damage.Damage;
import enums.Dice;
import gear.Coin;
import gear.Item;

public abstract class Weapon extends ConcreteWeapon implements Item {
    
    private String name;

    public Weapon(String name, Coin coin, Damage damage, Double weight, WeaponProperty[] weaponProperties, Range range, Dice dice, String special) {
        super(coin, damage, weight, weaponProperties, range, dice, special);
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

}
