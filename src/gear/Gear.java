/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import gear.ConcreteGear;

public interface Gear {

    Coin coin();

    Double weight();

    String description();

    Gear setAmount(Integer amount);
    
    String toString();
}
