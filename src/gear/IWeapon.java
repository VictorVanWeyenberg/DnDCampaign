/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import damage.Damage;
import gear.ConcreteWeapon.WeaponProperty;

public interface IWeapon extends Gear {

    WeaponProperty[] weaponProperties();

    Damage damage();

}
