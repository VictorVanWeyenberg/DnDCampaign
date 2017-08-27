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
import ability.Skill;
import ability.WisdomSkills;
import damage.Advantage;
import damage.Condition;
import domain.Proficiency;
import enums.CheckType;
import enums.Language;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import races.HeightRestriction.Size;

public class Elf extends ConcreteRace {

    public List<RaceTrait> raceTraits;

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        return new ArrayList<>(Arrays.asList(new AbilityScoreIncrease[]{new AbilityScoreIncrease(Ability.DEXTERITY, 2)}));
    }

    @Override
    public AgeRestriction ageRestriction() {
        return new AgeRestriction(18, 100, 750);
    }

    @Override
    public HeightRestriction heightRestriction() {
        return new HeightRestriction(5, 6, Size.MEDIUM);
    }

    @Override
    public List<RaceTrait> raceTraits() {
        if (raceTraits == null) {
            raceTraits = new ArrayList<RaceTrait>(Arrays.asList(new RaceTrait[]{
                new RaceTraitBuilder("Darkvision")
                .addDescription("You can see in dim light within 60 feet of you as if it were bright light, and in darkness as if it were dim light. You can't discern color in darkness, only shades of gray.")
                .build(),
                new RaceTraitBuilder("Keen Senses")
                .addDescription("You have proficiency in the Perception skill.")
                .addProficiencies(new Proficiency<Skill>(WisdomSkills.PERCEPTION))
                .build(),
                new RaceTraitBuilder("Fey Ancestry")
                .addDescription("You have advantage on saving throws against being charmed, and magic can't put you to sleep.")
                .addAdvantages(new Advantage(Condition.CHARMED, CheckType.SAVING_THROW))
                .build(),
                new RaceTraitBuilder("Trance")
                .addDescription("Elves don't need to sleep. Instead they meditate deeply, remaining unconscious, for 4 hours a day. (The Common word for such meditation is \"trance.\") While meditating, you can dream after a fashion; such dreams are actually mental exercises that have become reflexive through years of practice. After restingin this way, you gain the same benefit that a human does from 8 hours of sleep.")
                .build()
            }));
        }
        return raceTraits;
    }

    @Override
    public List<Language> languages() {
        return new ArrayList<>(Arrays.asList(new Language[]{Language.COMMON, Language.ELVISH}));
    }

    @Override
    public Integer speed() {
        return 30;
    }

    @Override
    public List<Class<? extends Race>> subraces() {
        return Arrays.asList(new Class[]{High_Elf.class, Wood_Elf.class, Dark_Elf.class});
    }

}
