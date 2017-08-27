/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package ability;

import ability.Ability;

public class AbilityScoreIncrease extends AbilityScore {
    
    public AbilityScoreIncrease(Ability ability, Integer amount) {
        super(ability, amount);
    }
    
    public void increase(AbilityScore as) {
        if (as.ability != this.ability) {
            throw new IllegalArgumentException("Ability score increase can only be executed on the same ability.");
        }
        as.amount += this.amount;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s", ability, amount < 0 ? amount : "+" + amount);
    }

}
