/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import damage.Damage;
import enums.Dice;

public class ConcreteWeapon extends ConcreteGear {

    private static class Range {

        public Integer min, max;

        public Range(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }
    }

    protected enum WeaponProperty {

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

    protected Damage damage;
    protected WeaponProperty[] weaponProperties;

    public ConcreteWeapon(Coin coin, Damage damage, Double weight, WeaponProperty[] weaponProperties) {
        super(coin, weight);
        this.damage = damage;
        this.weaponProperties = weaponProperties;
    }
}