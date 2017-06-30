/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;

public enum Kit implements Gear {

    HERBALISM_KIT(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(5, Coin.CoinType.GP)).setWeight(3.0).setDescription("This kit contains a variety of instruments such as clippers, mortar and pestle, and pouches and vials used by herbalists to create remedies and potions. Proficiency with this kit lets you add your proficiency bonus to any ability checks you make to identify or apply herbs. Also, proficiency with this kit is required to create antitoxin and potions of healing.").build()),
    DISGUISE_KIT(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(25, Coin.CoinType.GP)).setWeight(3.0).setDescription("This pouch of cosmetics, hair dye, and small props lets you create disguises that change your physical appearance. Proficiency with this kit lets you add your proficiency bonus to any ability checks you make to create a visual disguise.").build()),
    FORGERY_KIT(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(15, Coin.CoinType.GP)).setWeight(5.0).setDescription("This small box contains a variety of papers and parchments, pens and inks, seals and sealing wax, gold and silver leaf, and other supplies necessary to create convincing forgeries of physical documents. Proficiency with this kit lets you add your proficiency bonus to any ability checks you make to create a physical forgery of a document.").build()),
    POISONER$S_KIT(new ConcreteGear.ConcreteGearBuilder().setCoin(new Coin(50, Coin.CoinType.GP)).setWeight(2.0).setDescription("A poisoner’s kit includes the vials, chemicals, and other equipment necessary for the creation of poisons. Proficiency with this kit lets you add your proficiency bonus to any ability checks you make to craft or use poisons.").build());

    private ConcreteGear gear;
    private Integer amount;

    Kit(ConcreteGear gear) {
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
