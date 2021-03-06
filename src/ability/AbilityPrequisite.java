/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("AbilityPrequisite")
public class AbilityPrequisite extends AbilityScore {

    public AbilityPrequisite(Ability ability, Integer amount) {
        super(ability, amount);
    }
    
    public Boolean isValid(Integer amount) {
        if (amount < this.amount) return false;
        return true;
    }

}
