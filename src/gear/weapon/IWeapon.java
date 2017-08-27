/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.weapon;

import damage.Damage;
import enums.Dice;
import gear.weapon.ConcreteWeapon.WeaponProperty;
import gear.IGear;

public interface IWeapon extends IGear {

    WeaponProperty[] weaponProperties();

    Damage damage();
    
    Range range();
    
    Dice dice();
    
    String special();

}
