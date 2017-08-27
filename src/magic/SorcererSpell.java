/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SorcererSpell")
public class SorcererSpell extends ConcreteSpell {

    public SorcererSpell(String name, Integer level, String description, School school, Character[] components, CastingTime castingTime, String range, String duration) {
        super(name, level, description, school, components, castingTime, range, duration);
    }

}
