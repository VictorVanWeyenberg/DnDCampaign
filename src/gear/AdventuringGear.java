/**
 *
 * @date Aug 18, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.List;

@XStreamAlias("AdventuringGear")
public class AdventuringGear extends ConcreteGear implements Item {
    
    private String name;

    public AdventuringGear(String name, Coin coin, Double weight) {
        super(coin, weight);
        this.name = name;
    }

    public AdventuringGear(String name, Coin coin, Double weight, String description) {
        super(coin, weight, description);
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String toString() {
        return name();
    }

}
