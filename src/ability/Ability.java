/**
 *
 * @date Jun 20, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Ability")
public enum Ability {

    STRENGTH(StrengthSkills.values()), DEXTERITY(DexteritySkills.values()), CONSTITUTION(null), INTELLIGENCE(IntelligenceSkills.values()), WISDOM(WisdomSkills.values()), CHARISMA(CharismaSkills.values());

    private Enum[] skills;

    Ability(Enum[] skills) {
        this.skills = skills;
    }

}