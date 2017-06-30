/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

import ability.AbilityScoreIncrease;
import domain.Proficiency;
import races.ConcreteRaceTrait.RaceTrait;
import enums.Language;
import java.util.List;

public interface Race {

    public List<AbilityScoreIncrease> abilityScoreIncrease();
    
    public AgeRestriction ageRestriction();

    public HeightRestriction heightRestriction();
    
    public List<Proficiency> proficiencyRestrictions();
    
    public List<RaceTrait> raceTraits();
    
    public List<Language> languages();
    
    public Integer speed();
    
    public List<Class<? extends Race>> subraces();

}
