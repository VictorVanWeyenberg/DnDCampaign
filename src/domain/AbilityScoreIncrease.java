/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

import enums.Ability;

public class AbilityScoreIncrease {
    
    private Ability ability;
    private int amount;

    public AbilityScoreIncrease(Ability ability, int amount) {
        this.ability = ability;
        this.amount = amount;
    }
    
    public Ability ability() {
        return ability;
    }
    
    public int amount() {
        return amount;
    }

}
