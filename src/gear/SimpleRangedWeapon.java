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
import enums.Dice.DiceType;
import gear.ConcreteWeapon.WeaponProperty;

public enum SimpleRangedWeapon implements IWeapon {

    LIGHT_CROSSBOW(new ConcreteWeapon(new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 5.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(80, 320), WeaponProperty.LOADING, WeaponProperty.TWOHANDED})),
    DART(new ConcreteWeapon(new Coin(5, CoinType.CP), new Damage(new Dice(DiceType.D4), DamageType.PIERCING), 0.25, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.THROWN.setRange(20, 60)})),
    SHORTBOW(new ConcreteWeapon(new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(80, 320), WeaponProperty.TWOHANDED})),
    SLING(new ConcreteWeapon(new Coin(1, CoinType.SP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 0.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(30, 120)}));

    private ConcreteWeapon weapon;
    private Integer amount;

    private SimpleRangedWeapon(ConcreteWeapon weapon) {
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
    public ConcreteWeapon.WeaponProperty[] weaponProperties() {
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
