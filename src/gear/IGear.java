/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import gear.ConcreteGear;

public interface IGear {

    Coin coin();

    Double weight();

    String description();
    
    String toString();
}
