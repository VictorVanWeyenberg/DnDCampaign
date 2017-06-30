/**
 *
 * @date Jun 25, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import domain.Coin;
import java.util.List;

public class Item extends ConcreteGear implements Gear {
    
    private String name;
    private Integer amount;

    public Item(String name, Coin coin, Double weight, List<Gear> subGear, String description) {
        super(coin, weight, subGear, description);
        this.name = name;
    }

    @Override
    public Coin coin() {
        return coin;
    }

    @Override
    public Double weight() {
        return weight;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Gear setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }

}
