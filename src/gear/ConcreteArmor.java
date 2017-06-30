/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import ability.AbilityPrequisite;
import damage.Disadvantage;
import domain.Coin;
import util.Builder;

public class ConcreteArmor extends ConcreteGear {

    private Integer baseArmorClass;
    private boolean dexModMax2;
    private AbilityPrequisite strengthPrequisite;
    private Disadvantage stealthDisadvantage;

    public static class ConcreteArmorBuilder implements Builder<ConcreteArmor>{

        private Integer baseArmorClass;
        private boolean dexModMax2;
        private AbilityPrequisite strengthPrequisite;
        private Disadvantage stealthDisadvantage;
        private Coin coin;
        private Double weight;
        
        public ConcreteArmorBuilder setBaseArmorClass(Integer baseArmorClass) {
            this.baseArmorClass = baseArmorClass;
            return this;
        }
        
        public ConcreteArmorBuilder setDexModMax2(boolean dexModMax2) {
            this.dexModMax2 = dexModMax2;
            return this;
        }
        
        public ConcreteArmorBuilder setStrengthPrequisite(AbilityPrequisite strengthPrequisite) {
            this.strengthPrequisite = strengthPrequisite;
            return this;
        }
        
        public ConcreteArmorBuilder setStealthDisadvantage(Disadvantage stealthDisadvantage) {
            this.stealthDisadvantage = stealthDisadvantage;
            return this;
        }
        
        public ConcreteArmorBuilder setCoin(Coin coin) {
            this.coin = coin;
            return this;
        }
        
        public ConcreteArmorBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }
        
        public ConcreteArmor build() {
            return new ConcreteArmor(coin, baseArmorClass, dexModMax2, strengthPrequisite, stealthDisadvantage, weight);
        }

    }

    protected ConcreteArmor(Coin coin, Integer baseArmorClass, boolean dexModMax2, AbilityPrequisite strengthPrequisite, Disadvantage stealthDisadvantage, Double weight) {
        super(coin, weight);
        this.baseArmorClass = baseArmorClass;
        this.dexModMax2 = dexModMax2;
        this.strengthPrequisite = strengthPrequisite;
        this.stealthDisadvantage = stealthDisadvantage;
    }

}
