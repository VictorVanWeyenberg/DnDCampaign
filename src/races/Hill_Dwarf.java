/**
 *
 * @date Jun 24, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import ability.AbilityScoreIncrease;
import ability.Ability;
import java.util.List;
import races.ConcreteRaceTrait.RaceTrait;

public class Hill_Dwarf extends Dwarf {

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        List<AbilityScoreIncrease> asi = super.abilityScoreIncrease();
        asi.add(new AbilityScoreIncrease(Ability.WISDOM, 1));
        return asi;
    }
    
    @Override
    public List<RaceTrait> raceTraits() {
        List<RaceTrait> rt = super.raceTraits();
        rt.add(RaceTrait.DWARVEN_TOUGHNESS);
        return rt;
    }

}
