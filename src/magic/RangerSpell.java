/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("RangerSpell")
public class RangerSpell extends ConcreteSpell {

    public RangerSpell(String name, Integer level, String description, School school, Character[] components, CastingTime castingTime, String range, String duration) {
        super(name, level, description, school, components, castingTime, range, duration);
    }

}
