/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import enums.Ability;
import domain.AbilityScoreIncrease;

public class Dwarf extends Race {
    
    private AbilityScoreIncrease[] abilityScoreIncrease = {new AbilityScoreIncrease(Ability.CONSTITUTION, 2)};
    private AgeRestriction ageRestriction = new AgeRestriction(18, 50, 350);
    private HeightRestriction heightRestriction = new HeightRestriction(4, 5, HeightRestriction.Size.MEDIUM);

    @Override
    public AbilityScoreIncrease[] abilityScoreIncrease() {
        return abilityScoreIncrease;
    }
    
    @Override
    public AgeRestriction ageRestriction() {
        return ageRestriction;
    }

    @Override
    public HeightRestriction heightRestriction() {
        return heightRestriction;
    }

    @Override
    public int speed() {
        return 25;
    }

}
