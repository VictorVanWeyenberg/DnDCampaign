/**
 *
 * @date Jun 25, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import ability.Ability.DexteritySkills;
import ability.AbilityPrequisite;
import ability.AbilityScore;
import damage.Disadvantage;
import domain.Coin;
import gear.ConcreteArmor.ConcreteArmorBuilder;

public enum LightArmor implements IArmor {
    
    PADDED(new ConcreteArmorBuilder().setCoin(new Coin(5, Coin.CoinType.GP)).setBaseArmorClass(11).setStealthDisadvantage(new Disadvantage(DexteritySkills.STEALTH)).setWeight(8.0).build());
    //LEATHER(new ConcreteArmorBuilder())
    
    private ConcreteArmor armor;

    LightArmor(ConcreteArmor armor) {
this.armor = armor;
}

    @Override
    public AbilityPrequisite strengthPrequisite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Disadvantage stealthDisadvantage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer calculateArmorClass(AbilityScore as) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Coin coin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double weight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String description() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Gear setAmount(Integer amount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
