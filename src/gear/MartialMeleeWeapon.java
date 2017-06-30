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

public enum MartialMeleeWeapon implements IWeapon {

    BATTLEAXE(new ConcreteWeapon(new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.SLASHING), 4.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
    FLAIL(new ConcreteWeapon(new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{})),
    GLAIVE(new ConcreteWeapon(new Coin(20, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
    GREATAXE(new ConcreteWeapon(new Coin(30, CoinType.GP), new Damage(new Dice(DiceType.D12), DamageType.SLASHING), 7.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
    GREATSWORD(new ConcreteWeapon(new Coin(50, CoinType.GP), new Damage(new Dice(DiceType.D6, 2), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
    HALBERD(new ConcreteWeapon(new Coin(20, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
    LANCE(new ConcreteWeapon(new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D12), DamageType.PIERCING), 6.0, new WeaponProperty[]{WeaponProperty.REACH, WeaponProperty.SPECIAL.setSpecial("You have disadvantage when you use a lance to attack a target within 5 feet of you. Also, a lance requires two hands to wield when you aren't mounted.")})),
    LONGSWORD(new ConcreteWeapon(new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
    MAUL(new ConcreteWeapon(new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D6, 2), DamageType.BLUDGEONING), 10.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
    MORNINGSTAR(new ConcreteWeapon(new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 4.0, new WeaponProperty[]{})),
    PIKE(new ConcreteWeapon(new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.PIERCING), 18.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
    RAPIER(new ConcreteWeapon(new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.FINESSE})),
    SCIMITAR(new ConcreteWeapon(new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT})),
    SHORTSWORD(new ConcreteWeapon(new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT})),
    TRIDENT(new ConcreteWeapon(new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 4.0, new WeaponProperty[]{WeaponProperty.THROWN.setRange(20, 60), WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))})),
    WAR_PICK(new ConcreteWeapon(new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{})),
    WARHAMMER(new ConcreteWeapon(new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
    WHIP(new ConcreteWeapon(new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.REACH}));

    private ConcreteWeapon weapon;
    private Integer amount;

    private MartialMeleeWeapon(ConcreteWeapon weapon) {
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
