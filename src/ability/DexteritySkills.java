/**
 *
 * @date Aug 19, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;

import static ability.Ability.DEXTERITY;
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Dexterity")
public enum DexteritySkills implements Skill {
    ACROBATICS, SLEIGHT_OF_HAND, STEALTH;

    @Override
    public Ability ability() {
        return DEXTERITY;
    }
}
