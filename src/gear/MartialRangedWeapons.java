/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import damage.Damage;
import damage.Damage.DamageType;
import domain.Coin;
import domain.Coin.CoinType;
import enums.Dice;
import gear.ConcreteWeapon.WeaponProperty;

public enum MartialRangedWeapons implements IWeapon {

    BLOWGUN(new ConcreteWeapon(new Coin(10, CoinType.GP), new Damage(1, DamageType.PIERCING), 1.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(25, 100), WeaponProperty.LOADING})),
    HAND_CROSSBOW(new ConcreteWeapon(new Coin(75, CoinType.GP), new Damage(new Dice(Dice.DiceType.D6), DamageType.PIERCING), 3.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(30, 120), WeaponProperty.LIGHT, WeaponProperty.LOADING})),
    HEAVY_CROSSBOW(new ConcreteWeapon(new Coin(50, CoinType.GP), new Damage(new Dice(Dice.DiceType.D10), DamageType.PIERCING), 18.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(100, 400), WeaponProperty.HEAVY, WeaponProperty.LOADING, WeaponProperty.TWOHANDED})),
    LONGBOW(new ConcreteWeapon(new Coin(50, CoinType.GP), new Damage(new Dice(Dice.DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(150, 600), WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
    NET(new ConcreteWeapon(new Coin(1, CoinType.GP), new Damage(), 3.0, new WeaponProperty[]{WeaponProperty.SPECIAL, WeaponProperty.THROWN.setRange(5, 15)}));

    private ConcreteWeapon weapon;
    private Integer amount;

    private MartialRangedWeapons(ConcreteWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public Coin coin() {
        return weapon.coin;
    }

    @Override
    public Damage damage() {
        return weapon.damage;
    }

    @Override
    public Double weight() {
        return weapon.weight;
    }

    @Override
    public WeaponProperty[] weaponProperties() {
        return weapon.weaponProperties;
    }

    @Override
    public String description() {
        return weapon.description;
    }

    @Override
    public Gear setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

}
