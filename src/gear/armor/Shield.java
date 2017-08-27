/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear.armor;

import ability.AbilityPrequisite;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Disadvantage;
import gear.Coin;

@XStreamAlias("Shield")
public class Shield extends Armor {

    public Shield() {
        super("Shield", new Coin(10, Coin.CoinType.GP), 2, false, null, null, 6.0);
    }

}
