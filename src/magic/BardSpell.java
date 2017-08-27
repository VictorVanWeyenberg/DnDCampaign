/**
 *
 * @date Jul 10, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package magic;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import damage.Damage;

/**
 *
 * @author Reznov
 */
@XStreamAlias("BardSpell")
public class BardSpell extends ConcreteSpell {

    public BardSpell(String name, Integer level, String description, School school, Character[] components, CastingTime castingTime, String range, String duration) {
        super(name, level, description, school, components, castingTime, range, duration);
    }

}
