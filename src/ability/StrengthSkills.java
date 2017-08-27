/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package ability;

import static ability.Ability.STRENGTH;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Strength")
public enum StrengthSkills implements Skill {
    ATHLETICS;

    @Override
    public Ability ability() {
        return STRENGTH;
    }
}
