/**
 *
 * @date Jul 2, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

import ability.Ability;
import ability.AbilityScoreIncrease;
import java.util.List;
import races.RaceTrait.RaceTrait;

public class High_Elf extends Elf {
    
    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        List<AbilityScoreIncrease> asi = super.abilityScoreIncrease();
        asi.add(new AbilityScoreIncrease(Ability.INTELLIGENCE, 1));
        return asi;
    }
    
    @Override
    public List<RaceTrait> raceTraits() {
        List<RaceTrait> r = super.raceTraits();
        //r.add(RaceTrait.ELF_WEAPON_TRAINING);
        return r;
    }

}
