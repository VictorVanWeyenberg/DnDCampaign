/**
 *
 * @date Aug 19, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.weapon;

import gear.weapon.Weapon;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Damage;
import enums.Dice;
import gear.Coin;

@XStreamAlias("MartialMeleeWeapon")
public class MartialMeleeWeapon extends Weapon {

    public MartialMeleeWeapon(String name, Coin coin, Damage damage, Double weight, WeaponProperty[] weaponProperties, Range range, Dice dice, String special) {
        super(name, coin, damage, weight, weaponProperties, range, dice, special);
    }

}
