/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package domain;

import domain.Coin.CoinType;
import domain.Damage.DamageType;
import enums.Dice;
import enums.Dice.DiceType;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ConcreteWeapon extends Gear {

    public enum WeaponCategory {
        SIMPLE_MELEE_WEAPONS, 
        SIMPLE_RANGED_WEAPONS, 
        MARTIAL_MELEE_WEAPONS, 
        MARTIAL_RANGED_WEAPONS;
    }

    private static class Range {

        public Integer min, max;

        public Range(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }
    }

    private enum WeaponProperty {

        AMMUNITION("You can use a weapon that has the ammunition property to make a ranged Attack only if you have ammunition to fire from the weapon. Each time you Attack with the weapon, you expend one piece of ammunition. Drawing the ammunition from a Quiver, case, or other container is part of the Attack (you need a free hand to load a one-handed weapon). At the end of the battle, you can recover half your expended ammunition by taking a minute to Search the battlefield. If you use a weapon that has the ammunition property to make a melee Attack, you treat the weapon as an improvised weapon (see “Improvised Weapons” later in the section). A sling must be loaded to deal any damage when used in this way."),
        FINESSE("When Making an Attack with a finesse weapon, you use your choice of your Strength or Dexterity modifier for the Attack and Damage Rolls. You must use the same modifier for both rolls."),
        HEAVY("Small creatures have disadvantage on Attack rolls with heavy weapons. A heavy weapon’s size and bulk make it too large for a Small creature to use effectively."),
        LIGHT("A light weapon is small and easy to handle, making it ideal for use when fighting with two weapons."),
        LOADING("Because of the time required to load this weapon, you can fire only one piece of ammunition from it when you use an action, Bonus Action, or reaction to fire it, regardless of the number of attacks you can normally make."),
        RANGE("A weapon that can be used to make a ranged Attack has a range in parentheses after the ammunition or thrown property. The range lists two numbers. The first is the weapon’s normal range in feet, and the second indicates the weapon’s long range. When attacking a target beyond normal range, you have disadvantage on the Attack roll. You can’t Attack a target beyond the weapon’s long range."),
        REACH("This weapon adds 5 feet to your reach when you Attack with it, as well as when determining your reach for Opportunity Attacks with it."),
        SPECIAL("A weapon with the special property has unusual rules governing its use, explained in the weapon’s description (see “Special Weapons” later in this section)."),
        THROWN("If a weapon has the thrown property, you can throw the weapon to make a ranged Attack. If the weapon is a melee weapon, you use the same ability modifier for that Attack roll and damage roll that you would use for a melee Attack with the weapon. For example, if you throw a Handaxe, you use your Strength, but if you throw a Dagger, you can use either your Strength or your Dexterity, since the Dagger has the finesse property."),
        TWOHANDED("This weapon requires two hands when you Attack with it."),
        VERSATILE("This weapon can be used with one or two hands. A damage value in parentheses appears with the property—the damage when the weapon is used with two hands to make a melee Attack.");

        public String description;
        public Range range;
        public Dice dice;
        public String special;

        WeaponProperty(String description) {
            this.description = description;
        }

        WeaponProperty setRange(int min, int max) {
            this.range = new Range(min, max);
            return this;
        }
        
        WeaponProperty setDice(Dice dice) {
            this.dice = dice;
            return this;
        }
        
        WeaponProperty setSpecial(String special) {
            this.special = special;
            return this;
        }
    }

    public enum Weapon {

        //   Simple Melee Weapons
        CLUB(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(1, CoinType.SP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT})),
        DAGGER(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.PIERCING), 1.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
        GREATCLUB(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(2, CoinType.SP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 10.0, new WeaponProperty[]{WeaponProperty.TWOHANDED})),
        HANDAXE(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.SLASHING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
        JAVELIN(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(5, CoinType.SP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(30, 120)})),
        LIGHTHAMMER(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT, WeaponProperty.THROWN.setRange(20, 60)})),
        MACE(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.BLUDGEONING), 4.0, new WeaponProperty[]{})),
        QUARTERSTAFF(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(2, CoinType.SP), new Damage(new Dice(DiceType.D6), DamageType.BLUDGEONING), 4.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))})),
        SICKLE(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(1, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.SLASHING), 2.0, new WeaponProperty[]{WeaponProperty.LIGHT})),
        SPEAR(new ConcreteWeapon(WeaponCategory.SIMPLE_MELEE_WEAPONS, new Coin(1, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 3.0, new WeaponProperty[]{WeaponProperty.THROWN.setRange(20, 60), WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))})),

        //   Simple Ranged Weapons
        LIGHT_CROSSBOW(new ConcreteWeapon(WeaponCategory.SIMPLE_RANGED_WEAPONS, new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 5.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(80, 320), WeaponProperty.LOADING, WeaponProperty.TWOHANDED})),
        DART(new ConcreteWeapon(WeaponCategory.SIMPLE_RANGED_WEAPONS, new Coin(5, CoinType.CP), new Damage(new Dice(DiceType.D4), DamageType.PIERCING), 0.25, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.THROWN.setRange(20, 60)})),
        SHORTBOW(new ConcreteWeapon(WeaponCategory.SIMPLE_RANGED_WEAPONS, new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(80, 320), WeaponProperty.TWOHANDED})),
        SLING(new ConcreteWeapon(WeaponCategory.SIMPLE_RANGED_WEAPONS, new Coin(1, CoinType.SP), new Damage(new Dice(DiceType.D4), DamageType.BLUDGEONING), 0.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(30, 120)})),
        
        //   Martial Melee Weapons
        BATTLEAXE(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.SLASHING), 4.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
        FLAIL(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{})),
        GLAIVE(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(20, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
        GREATAXE(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(30, CoinType.GP), new Damage(new Dice(DiceType.D12), DamageType.SLASHING), 7.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
        GREATSWORD(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(50, CoinType.GP), new Damage(new Dice(DiceType.D6, 2), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
        HALBERD(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(20, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.SLASHING), 6.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
        LANCE(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D12), DamageType.PIERCING), 6.0, new WeaponProperty[]{WeaponProperty.REACH, WeaponProperty.SPECIAL.setSpecial("You have disadvantage when you use a lance to attack a target within 5 feet of you. Also, a lance requires two hands to wield when you aren't mounted.")})),
        LONGSWORD(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
        MAUL(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D6, 2), DamageType.BLUDGEONING), 10.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
        MORNINGSTAR(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 4.0, new WeaponProperty[]{})),
        PIKE(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.PIERCING), 18.0, new WeaponProperty[]{WeaponProperty.HEAVY, WeaponProperty.REACH, WeaponProperty.TWOHANDED})),
        RAPIER(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.FINESSE})),
        SCIMITAR(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(25, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT})),
        SHORTSWORD(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(10, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.LIGHT})),
        TRIDENT(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 4.0, new WeaponProperty[]{WeaponProperty.THROWN.setRange(20, 60), WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D8))})),
        WAR_PICK(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(5, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{})),
        WARHAMMER(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(15, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.BLUDGEONING), 2.0, new WeaponProperty[]{WeaponProperty.VERSATILE.setDice(new Dice(DiceType.D10))})),
        WHIP(new ConcreteWeapon(WeaponCategory.MARTIAL_MELEE_WEAPONS, new Coin(2, CoinType.GP), new Damage(new Dice(DiceType.D4), DamageType.SLASHING), 3.0, new WeaponProperty[]{WeaponProperty.FINESSE, WeaponProperty.REACH})),
        
        //   Martial Ranged Weapons
        BLOWGUN(new ConcreteWeapon(WeaponCategory.MARTIAL_RANGED_WEAPONS, new Coin(10, CoinType.GP), new Damage(1, DamageType.PIERCING), 1.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(25, 100), WeaponProperty.LOADING})),
        HAND_CROSSBOW(new ConcreteWeapon(WeaponCategory.MARTIAL_RANGED_WEAPONS, new Coin(75, CoinType.GP), new Damage(new Dice(DiceType.D6), DamageType.PIERCING), 3.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(30, 120), WeaponProperty.LIGHT, WeaponProperty.LOADING})),
        HEAVY_CROSSBOW(new ConcreteWeapon(WeaponCategory.MARTIAL_RANGED_WEAPONS, new Coin(50, CoinType.GP), new Damage(new Dice(DiceType.D10), DamageType.PIERCING), 18.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(100, 400), WeaponProperty.HEAVY, WeaponProperty.LOADING, WeaponProperty.TWOHANDED})),
        LONGBOW(new ConcreteWeapon(WeaponCategory.MARTIAL_RANGED_WEAPONS, new Coin(50, CoinType.GP), new Damage(new Dice(DiceType.D8), DamageType.PIERCING), 2.0, new WeaponProperty[]{WeaponProperty.AMMUNITION.setRange(150, 600), WeaponProperty.HEAVY, WeaponProperty.TWOHANDED})),
        NET(new ConcreteWeapon(WeaponCategory.MARTIAL_RANGED_WEAPONS, new Coin(1, CoinType.GP), new Damage(), 3.0, new WeaponProperty[]{WeaponProperty.SPECIAL, WeaponProperty.THROWN.setRange(5, 15)}));
        
        private ConcreteWeapon weapon;

        private Weapon(ConcreteWeapon weapon) {
            this.weapon = weapon;
        }
        
        WeaponCategory category() {
            return weapon.category;
        }

        Coin coin() {
            return weapon.coin;
        }

        Damage damage() {
            return weapon.damage;
        }

        Double weight() {
            return weapon.weight;
        }

        WeaponProperty[] weaponProperties() {
            return weapon.weaponProperties;
        }
        
        Weapon[] getWeaponByType(WeaponCategory category) {
            return (Weapon[]) Arrays.asList(Weapon.values()).stream().filter(w -> w.category() == category).collect(Collectors.toList()).toArray();
        }

    }

    private WeaponCategory category;
    private Damage damage;
    private WeaponProperty[] weaponProperties;

    private ConcreteWeapon(WeaponCategory category, Coin coin, Damage damage, Double weight, WeaponProperty[] weaponProperties) {
        super(coin, weight);
        this.category = category;
        this.damage = damage;
        this.weaponProperties = weaponProperties;
    }
}
