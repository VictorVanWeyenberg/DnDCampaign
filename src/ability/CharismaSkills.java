/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package ability;

import static ability.Ability.CHARISMA;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Charisma")
public enum CharismaSkills implements Skill {
    DECEPTION, INTIMIDATION, PERFORMANCE, PERSUASION;

    @Override
    public Ability ability() {
        return CHARISMA;
    }
}
