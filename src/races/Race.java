/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

import enums.Ability;
import domain.AbilityScoreIncrease;
import races.Alignment.Entropy;
import races.Alignment.Motif;
import races.HeightRestriction.Size;

public abstract class Race {
    
    public abstract AbilityScoreIncrease[] abilityScoreIncrease();
    
    public abstract AgeRestriction ageRestriction();
    
    public abstract HeightRestriction heightRestriction();
    
    public abstract int speed();

}
