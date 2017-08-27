/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.armor;

import ability.AbilityPrequisite;
import ability.AbilityScore;
import damage.Disadvantage;
import gear.IGear;

public interface IArmor extends IGear {

    AbilityPrequisite strengthPrequisite();
    
    boolean dexModMax2();

    Disadvantage stealthDisadvantage();

    Integer baseArmorClass();

}
