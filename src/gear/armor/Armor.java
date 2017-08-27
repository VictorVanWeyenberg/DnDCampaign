/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear.armor;

import ability.AbilityPrequisite;
import damage.Disadvantage;
import gear.Coin;
import gear.Item;

public class Armor extends ConcreteArmor implements Item {
    
    private String name;

    public Armor(String name, Coin coin, Integer baseArmorClass, boolean dexModMax2, AbilityPrequisite strengthPrequisite, Disadvantage stealthDisadvantage, Double weight) {
        super(coin, baseArmorClass, dexModMax2, strengthPrequisite, stealthDisadvantage, weight);
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }

}
