/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("GamingSet")
public class GamingSet extends AdventuringGear {
    
    public GamingSet(String name, Coin coin, Double weight) {
        super(name, coin, weight);
    }

    public GamingSet(String name, Coin coin, Double weight, String description) {
        super(name, coin, weight, description);
    }

}
