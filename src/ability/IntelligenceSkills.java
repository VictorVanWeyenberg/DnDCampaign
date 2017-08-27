/**
 *
 * @date Aug 19, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;

import static ability.Ability.INTELLIGENCE;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Intelligence")
public enum IntelligenceSkills implements Skill {
    ARCANA, HISTORY, INVESTIGATION, NATURE, RELIGION;

    @Override
    public Ability ability() {
        return INTELLIGENCE;
    }
}
