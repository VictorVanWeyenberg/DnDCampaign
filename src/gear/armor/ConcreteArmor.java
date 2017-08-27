/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.armor;

import ability.AbilityPrequisite;
import ability.AbilityScore;
import damage.Disadvantage;
import gear.Coin;
import gear.ConcreteGear;
import util.Builder;

public class ConcreteArmor extends ConcreteGear implements IArmor {

    private Integer baseArmorClass;
    private boolean dexModMax2;
    private AbilityPrequisite strengthPrequisite;
    private Disadvantage stealthDisadvantage;

    @Override
    public AbilityPrequisite strengthPrequisite() {
        return strengthPrequisite;
    }

    @Override
    public Disadvantage stealthDisadvantage() {
        return stealthDisadvantage;
    }

    @Override
    public Integer baseArmorClass() {
        return baseArmorClass;
    }

    @Override
    public Coin coin() {
        return coin;
    }

    @Override
    public Double weight() {
        return weight;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public boolean dexModMax2() {
        return dexModMax2;
    }

    protected ConcreteArmor(Coin coin, Integer baseArmorClass, boolean dexModMax2, AbilityPrequisite strengthPrequisite, Disadvantage stealthDisadvantage, Double weight) {
        super(coin, weight);
        this.baseArmorClass = baseArmorClass;
        this.dexModMax2 = dexModMax2;
        this.strengthPrequisite = strengthPrequisite;
        this.stealthDisadvantage = stealthDisadvantage;
    }

}
