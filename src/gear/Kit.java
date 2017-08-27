/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Kit")
public class Kit extends AdventuringGear {
    
    public Kit(String name, Coin coin, Double weight) {
        super(name, coin, weight);
    }

    public Kit(String name, Coin coin, Double weight, String description) {
        super(name, coin, weight, description);
    }

}
