/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import domain.Coin.CoinType;
import gear.ConcreteGear.ConcreteGearBuilder;

public enum AdventuringGear implements Gear {

    ABACUS(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(2.0).build()),
    ACID(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(1.0).build()),
    ALCHEMIST$S_FIRE(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).setWeight(1.0).build()),
    ARROWS(new ConcreteGearBuilder().setDescription("20").setCoin(new Coin(20, CoinType.GP)).setWeight(1.0).build()),
    BLOWGUN_NEEDLES(new ConcreteGearBuilder().setDescription("50").setCoin(new Coin(50, CoinType.GP)).setWeight(1.0).build()),
    CROSSBOW_BOLTS(new ConcreteGearBuilder().setDescription("20").setCoin(new Coin(1, CoinType.GP)).setWeight(1.5).build()),
    SLING_BULLETS(new ConcreteGearBuilder().setDescription("20").setCoin(new Coin(4, CoinType.CP)).setWeight(1.5).build()),
    AMMUNITION(new ConcreteGearBuilder().addSubGear(ARROWS, BLOWGUN_NEEDLES, CROSSBOW_BOLTS, SLING_BULLETS).build()),
    ANTITOXIN(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).build()),
    CRYSTAL(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(1.0).build()),
    ORB(new ConcreteGearBuilder().setCoin(new Coin(20, CoinType.GP)).setWeight(3.0).build()),
    ROD(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(2.0).build()),
    STAFF(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(4.0).build()),
    WAND(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(1.0).build()),
    ARCANE_FOCUS(new ConcreteGearBuilder().addSubGear(CRYSTAL, ORB, ROD, STAFF, WAND).build()),
    BALL_BEARING(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(2.0).build()),
    BEDROLL(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(7.0).build()),
    BELL(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).build()),
    BLANKET(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).setWeight(3.0).build()),
    BLOCK_AND_TACKLE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(5.0).setDescription("A set of pulleys with a cable threaded through them and a hook to attach to objects, a block and tackle allows you to hoist up to four times the weight you can normally lift.").build()),
    BOOK(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(5.0).setDescription("A book might contain poetry, historical acoounts, information pertaining to a particular field of lore, diagrams and notes on gnomish contraptions, or just about anything else that can be represented using text or pictures. A book of spells is a spellbook.").build()),
    GLASS_BOTTLE(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(2.0).build()),
    CALPTOPS(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(2.0).setDescription("As an action, you can spread a bag of caltrops to cover a square areathat is 5 feet on a side. Any creature that enters the area must secceed on a DX 15 Dexterity saving throw or stop moving this turn and take 1 piercing damage. Taking this damages reduces the creature's walking speed by 10 feet until the creature regains at least 1 hitpoint. A creature moving through the area at half speed, doesn't need to make the save.").build()),
    CANDLE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.CP)).setDescription("For 1 hour, a candle sheds bright light in a 5-foot radius and dim light for an additional 5 feet.").build()),
    CROSSBOW_BOLT_CASE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(1.0).setDescription("This wooden case can hold up to twenty crossbow bolts.").build()),
    MAP_OR_SCROLL_CASE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(1.0).setDescription("This cylindrical leather case can hold up to ten rolled-up sheets sheets of paper or five rolled-up sheets of parchment.").build()),
    CHAIN(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(10.0).setDescription("A chain has 10 hitpoints. It can burst with a succesful DC 20 Strength check.").build()),
    CHALK(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.CP)).build()),
    CLIMBER$S_KIT(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(12.0).setDescription("A clmber's kit includes special pitons, boot tips, gloves and a harnass. You can use the climber's kit as an action to anchor yourself; when you do, you can't fall more than 25 feet from the point where you anchored yourself, and you can't climb more than 25 feet away from that point without undoing the anchor.").build()),
    COMMON_CLOTHES(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).setWeight(3.0).build()),
    COSTUME_CLOTHES(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(4.0).build()),
    FINE_CLOTHES(new ConcreteGearBuilder().setCoin(new Coin(15, CoinType.GP)).setWeight(6.0).build()),
    TRAVELER$S_CLOTHES(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(4.0).build()),
    COMPONENT_POUCH(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(2.0).setDescription("A component pouch is a small, watertight leather belt pouch that has compaetments to hold all the material components and other special items you need to cast your spells, except for those components that have a specific cost (as indicated in a spell's description).").build()),
    CROWBAR(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(5.0).setDescription("Using a crowbar grants advantage to Strength checks where the crowbar's leverage can be applied.").build()),
    SPRIG_OF_MISLETOE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).build()),
    TOTEM(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).build()),
    WOODEN_STAFF(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(4.0).build()),
    YEW_WAND(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(1.0).build()),
    DRUIDIC_FOCUS(new ConcreteGearBuilder().addSubGear(SPRIG_OF_MISLETOE, TOTEM, WOODEN_STAFF, YEW_WAND).setDescription("A druidic focus might be a sprig of misletoe or holly, a wand or scepter made of yew or another special wood, a staff drawn whole out of a living tree, or a totem object incorporating feathers, fure, bones, and teethfrom sacred animals. A druid can use such an object as a spellcasting focus, as described in chapter 10.").build()),
    FISHING_TACKLE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(4.0).setDescription("This kit includes a wooden rod, silken line, corkwood bobbers, steel hooks, lead sinkers, velvet lures, and narrow netting.").build()),
    GRAPPLING_HOOK(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(4.0).build()),
    HAMMER(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(3.0).build()),
    SLEDGE_HAMMER(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(10.0).build()),
    HEALER$S_KIT(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(3.0).setDescription("This kit is a leather pouch containing bandages, salves, and splints. The kit has ten uses. As an action, you can expend one use of the kit to stabilize a creature that has 0 hitpoints, without needing to make a Wisdom (Medicine) check.").build()),
    AMULET(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(1.0).build()),
    EMBLEM(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).build()),
    RELIQUARY(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(2.0).build()),
    HOLY_SYMBOL(new ConcreteGearBuilder().addSubGear(AMULET, EMBLEM, RELIQUARY).setDescription("A holy symbol is a representation ofa god or pantheon. It might be an amulet depicting a symbol representing a deity, the same symbol carefully engraved or inlaid as an emblem on a shield, or a tiny box holding a fragment o f a sacred relic. Appendix B lists the symbols commonly associated with many gods in the multiverse. A cleric or paladin can use a holy symbol as a spellcasting focus, as described in chapter 10. To use the symbol in this way, the caster must hold it in hand, wear it visibly, or bear it on a shield.").build()),
    HOLY_WATER(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(1.0).setDescription("As an action, you can splash the contents of this flask onto a creature within 5 feet of you or throw it up to 20 feet, shattering it on impact. In either case, make a ranged attack against a target creature, treating the holy water as an improvised w eapon. If the target is a fiend or undead, it takes 2d6 radiant damage. A cleric or paladin may create holy water by performing a special ritual. The ritual takes 1 hour to perform, uses 25 gp worth of powdered silver, and requires the caster to expend a 1st-level spell slot.").build()),
    HOUGLASS(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(1.0).build()),
    HUNTING_TRAP(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(25.0).setDescription("When you use your action to set it, this trap forms a saw-toothed steel ring that snaps shut when a creature steps on a pressure plate in the center. The trap is affixed by a heavy chain to an immobile object, such as a tree or a spike driven into the ground. A creature that steps on the plate must succeed on a DC 13 Dexterity saving throw or take 1d4 piercing damage and stop moving. Thereafter, until the creature breaks free of the trap, its movement is limited by the length of the chain (typically 3 feet long). A creature can use its action to make a DC 13 Strength check, freeing itself or another creature within its reach on a success. Each failed check deals 1 piercing damage to the trapped creature.").build()),
    INK(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).build()),
    INK_PEN(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.CP)).build()),
    LADDER(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.SP)).setWeight(25.0).build()),
    LAMP(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(1.0).setDescription("A lamp casts bright light in a 15-foot radius and dim light for an additional 30 feet. Once lit, it burns for 6 hours on a flask (1 pint) of oil.").build()),
    BULLSEYE_LANTERN(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(2.0).setDescription("A bullseye lantern casts bright light light in a 60-foot cone and dim light for an additional 60 feet. Once lit, it burns for 6 hours on a flask (1 pint) of oil.").build()),
    HOODED_LANTERN(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(2.0).setDescription("A hooded lantern casts bright light in a 30-foot radius and dim light for an additional 30 feet. Once lit, it burns for 6 hours on a flask (1 pint) of oil. As an action, you can lower the hood, reducing the light to dim light in a 5-foot radius.").build()),
    LOCK(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(1.0).setDescription("A key is provided with the lock. Without the key, a creature proficient with thieves’ tools can pick this lock with a successful DC 15 Dexterity check. Your DM may decide that better locks are available for higher prices.").build()),
    MAGNIFYING_GLASS(new ConcreteGearBuilder().setCoin(new Coin(100, CoinType.GP)).setDescription("This lens allows a closer look at small objects. It is also useful as a substitute for flint and steel when starting fires. Lighting a fire with a magnifying glass requires light as bright as sunlight to focus, tinder to ignite, and about 5 minutes for the fire to ignite. A magnifying glass grants advantage on any ability check made to appraise or inspect an item that is small or highly detailed.").build()),
    MANACLES(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(6.0).setDescription("These metal restraints can bind a Small or Medium creature. Escaping the manacles requires a successful DC 20 Dexterity check. Breaking them requires a successful DC 20 Strength check. Each set of manacles comes with one key. Without the key, a creature proficient with thieves’ tools can pick the manacles’ lock with a successful DC 15 Dexterity check. Manacles have 15 hit points.").build()),
    MESS_KIT(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.SP)).setWeight(1.0).setDescription("This tin box contains a cup and simple cutlery. The box clamps together, and one side can be used as a cooking pan and the other as a plate or shallow bowl.").build()),
    STEEL_MIRROR(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(0.5).build()),
    OIL(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.SP)).setWeight(1.0).setDescription("Oil usually comes in a clay flask that holds 1 pint. As an action, you can splash the oil in this flask onto a creature within 5 feet of you or throw it up to 20 feet, shattering it on impact. Make a ranged attack against a target creature or object, treating the oil as an improvised weapon. On a hit, the target is covered in oil. If the target takes any fire damage before the oil dries (after 1 minute), the target takes an additional 5 fire damage from the burning oil. You can also pour a flask of oil on the ground to cover a 5-foot-square area, provided that the surface is level. If lit, the oil burns for 2 rounds and deals 5 fire damage to any creature that enters the area or ends its turn in the area. A creature can take this damage only once per turn.").build()),
    PAPER(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.SP)).build()),
    PARCHMENT(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.SP)).build()),
    PERFUME(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).build()),
    MINER$S_PICK(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(10.0).build()),
    PITON(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.CP)).setWeight(0.25).build()),
    BASIC_POISON(new ConcreteGearBuilder().setCoin(new Coin(100, CoinType.GP)).setDescription("You can use the poison in this vial to coat one slashing or piercing weapon or up to three pieces o f ammunition. Applying the poison takes an action. A creature hit by the poisoned w eapon or ammunition must make a DC 10 Constitution saving throw or take 1d4 poison damage. Once applied, the poison retains potency for 1 minute before drying.").build()),
    POLE(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.CP)).setWeight(7.0).build()),
    POTION_OF_HEALING(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).setDescription("A character who drinks the magical red fluid in this vial regains 2d4 + 2 hit points. Drinking or administering a potion takes an action.").build()),
    GUIVER(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(1.0).setDescription("A quiver can hold up to 20 arrows.").build()),
    PORTABLE_RAM(new ConcreteGearBuilder().setCoin(new Coin(4, CoinType.GP)).setWeight(35.0).setDescription("You can use a portable ram to break down doors. When doing so, you gain a +4 bonus on the Strength check. One other character can help you use the ram, giving you advantage on this check.").build()),
    RATIONS(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).setWeight(2.0).setDescription("Rations consist of dry foods suitable for extended travel, including jerky, dried fruit, hardtack, and nuts.").build()),
    ROBES(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(4.0).build()),
    HEMPEN_ROPE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(10.0).setDescription("Rope, whether made of hemp or silk, has 2 hit points and can be burst with a DC 17 Strength check. Standard 50 feet.").build()),
    SILK_ROPE(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(5.0).setDescription("Rope, whether made of hemp or silk, has 2 hit points and can be burst with a DC 17 Strength check. Standard 50 feet.").build()),
    MERCHANT$S_SCALE(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(3.0).setDescription("A scale includes a small balance, pans, and a suitable assortment of weights up to 2 pounds. With it, you can measure the exact weight of small objects, such as raw precious metals or trade goods, to help determine their worth.").build()),
    SEALING_WAX(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).build()),
    SHOVEL(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(5.0).build()),
    SIGNAL_WHISTLE(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.CP)).build()),
    SIGNET_RING(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).build()),
    SOAP(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.CP)).build()),
    SPELLBOOK(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).setWeight(3.0).setDescription("Essential for wizards, a spellbook is a leather-bound tome with 100 blank vellum pages suitable for recording spells.").build()),
    IRON_SPIKES(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(5.0).build()),
    SPYGLASS(new ConcreteGearBuilder().setCoin(new Coin(1000, CoinType.GP)).setWeight(1.0).setDescription("Objects viewed through a spyglass are magnified to twice their size.").build()),
    TENT(new ConcreteGearBuilder().setCoin(new Coin(2, CoinType.GP)).setWeight(20.0).setDescription("A simple and portable canvas shelter, a tent sleeps two.").build()),
    TINDERBOX(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.SP)).setWeight(1.0).setDescription("This small container holds flint, fire steel, and tinder (usually dry cloth soaked in light oil) used to kindle a fire. Using it to light a torch—or anything else with abundant, exposed fuel—takes an action. Lighting any other fire takes 1 minute.").build()),
    TORCH(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.CP)).setWeight(1.0).setDescription("A torch burns for 1 hour, providing bright light in a 20-foot radius and dim light for an additional 20 feet. If you make a melee attack with a burning torch and hit, it deals 1 fire damage.").build()),
    WHETSTONE(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.CP)).setWeight(1.0).build());

    private ConcreteGear gear;
    private Integer amount;

    AdventuringGear(ConcreteGear gear) {
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
    public AdventuringGear setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        String name = this.toString().replace('$', '\'').replace('_', ' ').toLowerCase();
        return Character.toUpperCase(name.charAt(0)) + name.substring(1);
    }

}
