/**
 *
 * @date Jun 25, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import ability.AbilityPrequisite;
import ability.AbilityScore;
import damage.Disadvantage;

public interface IArmor extends Gear {
    
    AbilityPrequisite strengthPrequisite();
    Disadvantage stealthDisadvantage();
    Integer calculateArmorClass(AbilityScore as);

}
