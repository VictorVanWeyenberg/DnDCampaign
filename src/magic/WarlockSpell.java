/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("WarlockSpell")
public class WarlockSpell extends ConcreteSpell {

    public WarlockSpell(String name, Integer level, String description, School school, Character[] components, CastingTime castingTime, String range, String duration) {
        super(name, level, description, school, components, castingTime, range, duration);
    }

}
