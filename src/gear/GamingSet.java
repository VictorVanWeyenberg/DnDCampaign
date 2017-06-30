/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;

public enum GamingSet implements Gear {

    DICE_SET(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(1, Coin.CoinType.SP)).build()),
    DRAGONCHESS_SET(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(1, Coin.CoinType.GP)).setWeight(0.5).build()),
    PLAYING_CARD_SET(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(5, Coin.CoinType.SP)).build()),
    THREE_DRAGON_ANTE_SET(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(1, Coin.CoinType.GP)).build()),
    GAMING_SET(new ConcreteGear.ConcreteGearBuilder().addSubGear(DICE_SET, DRAGONCHESS_SET, PLAYING_CARD_SET, THREE_DRAGON_ANTE_SET).setDescription("This item encompasses a wide range of game pieces, including dice and decks of cards (for games such as Three-Dragon Ante). A few common examples appear on the Tools table, but other kinds of gaming sets exist. If you are proficient with a gaming set, you can add your proficiency bonus to ability checks you make to play a game with that set. Each type of gaming set requires a separate proficiency.").build());

    private ConcreteGear gear;
    private Integer amount;

    GamingSet(ConcreteGear gear) {
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
