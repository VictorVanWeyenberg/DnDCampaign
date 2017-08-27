/**
 *
 * @date Aug 22, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear.weapon;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Range")
public class Range {

    public Integer min, max;

    public Range(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }
}
