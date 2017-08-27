/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear.armor;

import gear.armor.Armor;
import ability.AbilityPrequisite;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Disadvantage;
import gear.Coin;

@XStreamAlias("LightArmor")
public class LightArmor extends Armor {

    public LightArmor(String name, Coin coin, Integer baseArmorClass, boolean dexModMax2, AbilityPrequisite strengthPrequisite, Disadvantage stealthDisadvantage, Double weight) {
        super(name, coin, baseArmorClass, dexModMax2, strengthPrequisite, stealthDisadvantage, weight);
    }

}
