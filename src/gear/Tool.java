/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

public class Tool extends AdventuringGear {
    
    public Tool(String name, Coin coin, Double weight) {
        super(name, coin, weight);
    }

    public Tool(String name, Coin coin, Double weight, String description) {
        super(name, coin, weight, description);
    }

}
