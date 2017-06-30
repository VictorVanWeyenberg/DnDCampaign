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

public enum Tool implements Gear {

    ALCHEMIST_SUPPLIES(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).setWeight(8.0).build()),
    BREWER$S_SUPPLIES(new ConcreteGearBuilder().setCoin(new Coin(20, CoinType.GP)).setWeight(9.0).build()),
    CALLIGRAPHER$S_SUPPLIES(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(5.0).build()),
    CARPENTER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(8, CoinType.GP)).setWeight(6.0).build()),
    CARTOGRAPHER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(15, CoinType.GP)).setWeight(6.0).build()),
    COBBLER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(5.0).build()),
    COOK$S_UTENSILS(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(8.0).build()),
    GLASSBLOWER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(30, CoinType.GP)).setWeight(5.0).build()),
    JEWELER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(2.0).build()),
    LEATHERWORKER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(5, CoinType.GP)).setWeight(5.0).build()),
    MASON$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(8.0).build()),
    PAINTER$S_SUPPLIES(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(5.0).build()),
    POTTER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(10, CoinType.GP)).setWeight(3.0).build()),
    SMITH$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(20, CoinType.GP)).setWeight(8.0).build()),
    TINKER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(50, CoinType.GP)).setWeight(10.0).build()),
    WEAVER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(5.0).build()),
    WOODCARVER$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(1, CoinType.GP)).setWeight(5.0).build()),
    NAVIGATOR$S_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(2.0).setDescription("This set of instruments is used for navigation at sea. Proficiency with navigator's tools lets you chart a ship's course and follow navigation charts. In addition, these tools allow you to add your proficiency bonus to any ability check you make to avoid getting lost at sea.").build()),
    THIEVES$_TOOLS(new ConcreteGearBuilder().setCoin(new Coin(25, CoinType.GP)).setWeight(1.0).setDescription("This set o  tools includes a small file, a set of lock picks, a small mirror munted on a metal handle, a set of narrow-bladed scissors, and a pair of pliers. Proficiency with these tools lets you add your proficiency bonus to any ability checks you make to disarm traps or open locks.").build()),
    ARTISAN$S_TOOLS(new ConcreteGearBuilder().addSubGear(ALCHEMIST_SUPPLIES, BREWER$S_SUPPLIES, CALLIGRAPHER$S_SUPPLIES, CARPENTER$S_TOOLS, CARTOGRAPHER$S_TOOLS, COBBLER$S_TOOLS, COOK$S_UTENSILS, GLASSBLOWER$S_TOOLS, JEWELER$S_TOOLS, LEATHERWORKER$S_TOOLS, MASON$S_TOOLS, PAINTER$S_SUPPLIES, POTTER$S_TOOLS, SMITH$S_TOOLS, TINKER$S_TOOLS, WEAVER$S_TOOLS, WOODCARVER$S_TOOLS).setDescription("These special tools include the items needed to pursue a craft or trade. The table shows examples of the most common types o f tools, each providing items related to a single craft. Proficiency with a set of artisan’s tools lets you add your proficiency bonus to any ability checks you make using the tools in your craft. Each type of artisan’s tools requires a separate proficiency.").build());
    
    private ConcreteGear gear;
    private Integer amount;

    Tool(ConcreteGear gear) {
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
