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

public enum MusicalInstrument implements Gear {

    BAGPIPES(new ConcreteGearBuilder().setCoin(new Coin(30, CoinType.GP)).setWeight(6.0).build()),
    DRUM(new ConcreteGearBuilder().setCoin(new Coin(6, CoinType.GP)).setWeight(3.0).build()),
    DULCIMER(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(10.0).build()),
    FLUTE(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(1.0).build()),
    LUTE(new ConcreteGearBuilder().setCoin(new Coin(35, CoinType.GP)).setWeight(2.0).build()),
    LYRE(new ConcreteGearBuilder().setCoin(new Coin(330, CoinType.GP)).setWeight(2.0).build()),
    HORN(new ConcreteGearBuilder().setCoin(new Coin(3, CoinType.GP)).setWeight(2.0).build()),
    PAN_FLUTE(new ConcreteGearBuilder().setCoin(new Coin(12, CoinType.GP)).setWeight(2.0).build()),
    SHAWM(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(1.0).build()),
    VIOL(new ConcreteGearBuilder().setCoin(new Coin(30, CoinType.GP)).setWeight(1.0).build());

    private ConcreteGear gear;
    private Integer amount;

    MusicalInstrument(ConcreteGear gear) {
        this.gear = gear;
    }
    
    public static String musicalInstrumentDescription() {
        return "Several of the most common types of musical instruments are shown on the table as examples. If you have proficiency with a given musical instrument, you can add your proficiency bonus to any ability checks you make to play music with the instrument. A bard can use a musical instrument as a spellcasting focus, as described in chapter 10. Each type of musical instrument requires a separate proficiency.";
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
