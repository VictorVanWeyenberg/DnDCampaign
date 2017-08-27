/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.weapon;

import gear.weapon.Range;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Damage;
import enums.Dice;
import gear.Coin;
import gear.ConcreteGear;
import java.util.Arrays;
import java.util.List;

public class ConcreteWeapon extends ConcreteGear {

    private void testArguments(WeaponProperty[] weaponProperties, Range range, Dice dice, String special) {
        List<WeaponProperty> properties = Arrays.asList(weaponProperties);
        if ((properties.contains(WeaponProperty.AMMUNITION) || properties.contains(WeaponProperty.RANGE) || properties.contains(WeaponProperty.THROWN)) && range == null) {
            throw new IllegalArgumentException("Range is mandatory when using the AMMUNITION, RANGE and THROWN WeaponProperty.");
        }
        if (properties.contains(WeaponProperty.VERSATILE) && dice == null) {
            throw new IllegalArgumentException("Dice is mandatory when using the VERSATILE WeaponProperty.");
        }
        if (properties.contains(WeaponProperty.SPECIAL) && (special == null || special.isEmpty())) {
            throw new IllegalArgumentException("Special description is mandatory when using the SPECIAL WeaponProperty.");
        }
    }

    @XStreamAlias("WeaponProperty")
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
    }

    protected Damage damage;
    protected WeaponProperty[] weaponProperties;
    protected Range range;
    protected Dice versatileDice;
    protected String special;

    public ConcreteWeapon(Coin coin, Damage damage, Double weight, WeaponProperty[] weaponProperties, Range range, Dice dice, String special) {
        super(coin, weight);
        this.damage = damage;
        testArguments(weaponProperties, range, dice, special);
        this.weaponProperties = weaponProperties;
        this.range = range;
        this.versatileDice = dice;
        this.special = special;
    }
}