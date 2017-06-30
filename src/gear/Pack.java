/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import static gear.AdventuringGear.*;
import static gear.Container.*;
import static gear.Kit.*;
import gear.ConcreteGear.ConcreteGearBuilder;

public enum Pack implements Gear {

    //   Packs
    BURGLAR$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, BALL_BEARING, BELL, CANDLE.setAmount(5), CROWBAR, HAMMER, PITON.setAmount(10), HOODED_LANTERN, OIL.setAmount(2), RATIONS.setAmount(5), TINDERBOX, WATERSKIN, HEMPEN_ROPE).setCoin(new Coin(16, Coin.CoinType.GP)).build()),
    DIPLOMAT$S_PACK(new ConcreteGearBuilder().addSubGear(CHEST, MAP_OR_SCROLL_CASE.setAmount(2), FINE_CLOTHES, INK, INK_PEN, LAMP, OIL.setAmount(2), PAPER.setAmount(5), PERFUME, SEALING_WAX, SOAP).setCoin(new Coin(39, Coin.CoinType.GP)).build()),
    DUNGEONEER$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, CROWBAR, HAMMER, PITON.setAmount(10), TORCH.setAmount(10), TINDERBOX, RATIONS.setAmount(10), WATERSKIN, HEMPEN_ROPE).setCoin(new Coin(12, Coin.CoinType.GP)).build()),
    ENTERTAINER$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, BEDROLL, COSTUME_CLOTHES.setAmount(2), CANDLE.setAmount(5), RATIONS.setAmount(5), WATERSKIN, DISGUISE_KIT).setCoin(new Coin(40, Coin.CoinType.GP)).build()),
    EXPLORER$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, BEDROLL, MESS_KIT, TINDERBOX, TORCH.setAmount(10), RATIONS.setAmount(10), WATERSKIN, HEMPEN_ROPE).setCoin(new Coin(10, Coin.CoinType.GP)).build()),
    PRIEST$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, BLANKET, CANDLE.setAmount(10), TINDERBOX, RATIONS.setAmount(2), WATERSKIN).setCoin(new Coin(19, Coin.CoinType.GP)).build()),
    SCHOLAR$S_PACK(new ConcreteGearBuilder().addSubGear(BACKPACK, BOOK, INK, INK_PEN, PARCHMENT.setAmount(10)).setCoin(new Coin(40, Coin.CoinType.GP)).build());

    private ConcreteGear gear;
    private Integer amount;

    Pack(ConcreteGear gear) {
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
