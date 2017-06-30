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

public enum SimpleMeleeWeapon implements IWeapon{

    CLUB(new ConcreteWeapon(new Coin(1, CoinType.SP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT})),
    DAGGER(new ConcreteWeapon(new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.PIERCING), 1.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
    GREATCLUB(new ConcreteWeapon(new Coin(2, CoinType.SP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 10.0, new WeaponProperty[]{WeaponProperty.TWOHANDED})),
    HANDAXE(new ConcreteWeapon(new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.SLASHING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
    JAVELIN(new ConcreteWeapon(new Coin(5, CoinType.SP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(30, 120)})),
    LIGHT_HAMMER(new ConcreteWeapon(new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
    MACE(new ConcreteWeapon(new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.BLUDGEONING), 4.0, new WeaponProperty[]{})),
    QUARTERSTAFF(new ConcreteWeapon(new Coin(2, CoinType.SP), new Damage(new Dice(DiceType.D6), DamageType.BLUDGEONING), 4.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))})),
    SICKLE(new ConcreteWeapon(new Coin(1, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.SLASHING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT})),
    SPEAR(new ConcreteWeapon(new Coin(1, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 3.0, new WeaponProperty[]{WeaponProperty.THROWN.setRange(20, 60), WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))}));
    
    private ConcreteWeapon weapon;
    private Integer amount;

    private SimpleMeleeWeapon(ConcreteWeapon weapon) {
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
