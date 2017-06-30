/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import ability.AbilityScoreIncrease;
import domain.Proficiency;
import ability.Ability;
import races.ConcreteRaceTrait.RaceTrait;
import enums.Language;
import gear.Tool;
import java.util.Arrays;
import java.util.List;

public class Dwarf implements Race {

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        return Arrays.asList(new AbilityScoreIncrease[] {new AbilityScoreIncrease(Ability.CONSTITUTION, 2)});
    }

    @Override
    public final AgeRestriction ageRestriction() {
        return new AgeRestriction(18, 50, 350);
    }

    @Override
    public final HeightRestriction heightRestriction() {
        return new HeightRestriction(4, 5, HeightRestriction.Size.MEDIUM);
    }

    @Override
    public List<Proficiency> proficiencyRestrictions() {
        return Arrays.asList(new Proficiency[] {new Proficiency<Tool>(Tool.SMITH$S_TOOLS), new Proficiency<Tool>(Tool.BREWER$S_SUPPLIES), new Proficiency<Tool>(Tool.MASON$S_TOOLS)});
    }

    @Override
    public List<RaceTrait> raceTraits() {
        return Arrays.asList(new RaceTrait[] {RaceTrait.DARKVISION, RaceTrait.DWARVEN_RESILIENCE, RaceTrait.DWARVEN_COMBAT_TRAINING, RaceTrait.STONECUNNING});
    }

    @Override
    public final List<Language> languages() {
        return Arrays.asList(new Language[] {Language.COMMON, Language.DWARVISH});
    }

    @Override
    public final Integer speed() {
        return 25;
    }

    @Override
    public List<Class<? extends Race>> subraces() {
        return Arrays.asList(new Class[] {Hill_Dwarf.class, Mountain_Dwarf.class});
    }

}
