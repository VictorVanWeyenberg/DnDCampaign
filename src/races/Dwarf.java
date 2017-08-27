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
import enums.Language;
import gear.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xmlmapping.GearMapper;

public class Dwarf extends ConcreteRace {
    
    GearMapper mapper = new GearMapper();

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        return new ArrayList<>(Arrays.asList(new AbilityScoreIncrease[] {new AbilityScoreIncrease(Ability.CONSTITUTION, 2)}));
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
    public List<Proficiency> proficiencies() {
        List<Proficiency> proficiencies = super.proficiencies();
        proficiencies.addAll(new ArrayList<>(Arrays.asList(new Proficiency[] {new Proficiency<Tool>(mapper.selectByName("Smith's Tools", Tool.class)), new Proficiency<Tool>(mapper.selectByName("Brewer's Supplies", Tool.class)), new Proficiency<Tool>(mapper.selectByName("Mason's Tools", Tool.class))})));
        return proficiencies;
    }

    @Override
    public List<RaceTrait> raceTraits() {
        return new ArrayList<>(Arrays.asList(new RaceTrait[] {RaceTrait.DARKVISION, RaceTrait.DWARVEN_RESILIENCE, RaceTrait.DWARVEN_COMBAT_TRAINING, RaceTrait.STONECUNNING}));
    }

    @Override
    public final List<Language> languages() {
        return new ArrayList<>(Arrays.asList(new Language[] {Language.COMMON, Language.DWARVISH}));
    }

    @Override
    public final Integer speed() {
        return 25;
    }

    @Override
    public List<Class<? extends Race>> subraces() {
        return (Arrays.asList(new Class[] {Hill_Dwarf.class, Mountain_Dwarf.class}));
    }

}
