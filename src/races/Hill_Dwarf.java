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

public class Hill_Dwarf extends Dwarf {
    
    public Hill_Dwarf() {
        super();
    }

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        List<AbilityScoreIncrease> asi = super.abilityScoreIncrease();
        asi.add(new AbilityScoreIncrease(Ability.WISDOM, 1));
        return asi;
    }
    
    @Override
    public List<RaceTrait> raceTraits() {
        List<RaceTrait> rt = super.raceTraits();
        rt.add(new RaceTraitBuilder("Dwarven Toughness")
                .addDescription("Your hitpoint maximum increases by 1, and it increases by 1 every time you gain a level.")
                .build());
        return rt;
    }

}
