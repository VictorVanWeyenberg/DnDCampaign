/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear.armor;

import ability.AbilityPrequisite;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Disadvantage;
import gear.Coin;

@XStreamAlias("MediumArmor")
public class MediumArmor extends Armor {

    public MediumArmor(String name, Coin coin, Integer baseArmorClass, boolean dexModMax2, AbilityPrequisite strengthPrequisite, Disadvantage stealthDisadvantage, Double weight) {
        super(name, coin, baseArmorClass, dexModMax2, strengthPrequisite, stealthDisadvantage, weight);
    }

}
