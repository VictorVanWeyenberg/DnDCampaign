/**
 *
 * @date Aug 19, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;

import static ability.Ability.WISDOM;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Wisdom")
public enum WisdomSkills implements Skill {
    ANIMAL_HANDLING, INSIGHT, MEDICINE, PERCEPTION, SURVIVAL;

    @Override
    public Ability ability() {
        return WISDOM;
    }
}
