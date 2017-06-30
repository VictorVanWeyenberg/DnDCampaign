/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import domain.Coin.CoinType;
import gear.ConcreteGear.ConcreteGearBuilder;

public enum Container implements Gear {

    BACKPACK(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(5.0).setDescription("1 cubic foot / 30 pounds of gear").build()),
    BARREL(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(70.0).setDescription("40 gallons liquid, 4 cubic feet solid").build()),
    BASKET(new ConcreteGearBuilder().setCoin(new Coin(4, CoinType.SP)).setWeight(2.0).setDescription("2 cubic feet / 40 pounds of gear").build()),
    BUCKET(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.CP)).setWeight(2.0).setDescription("3 gallons liquid, 1/2 cubic foot solid").build()),
    CHEST(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(25.0).setDescription("12 cubic feet / 300 pounds of gear").build()),
    FLASK_OR_TANKARD(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.CP)).setWeight(1.0).setDescription("1 pint liquid").build()),
    JUG_OR_PITCHER(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.CP)).setWeight(4.0).setDescription("1 gallon liquid").build()),
    IRON_POT(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(10.0).setDescription("1 gallon liquid").build()),
    POUCH(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).setWeight(1.0).setDescription("A cloth or leather pouch can hold up to 20 sling bullets or 50 blowgun needles, among other things. A compartmentalized pouch for holding spell components is called a component pouch (described earlier in this section).").build()),
    SACK(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.CP)).setWeight(0.5).setDescription("1 cubic foot / 30 pounds of gear").build()),
    VIAL(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setDescription("4 ounces liquid").build()),
    WATERSKIN(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.SP)).setWeight(5.0).setDescription("4 pints liquid").build());

    private ConcreteGear gear;
    private Integer amount;

    Container(ConcreteGear gear) {
        this.gear = gear;
    }

    @Override
    public Coin coin() {
        return gear.coin;
    }

    @Override
    public Double weight() {
        return gear.weight;
    }

    @Override
    public String description() {
        return gear.description;
    }

    @Override
    public Gear setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        String name = this.toString().replace('$', '\'').replace('_', ' ').toLowerCase();
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

}
