/**
 *
 * @date Aug 18, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.HashMap;
import java.util.Map;

@XStreamAlias("Inventory")
public class Inventory<Item, V> extends HashMap<Item, Integer> {

}
