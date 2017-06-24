/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

public class HeightRestriction {
    
    private int min, max;
    private Size size;
    
    public HeightRestriction(int min, int max, Size size) {
        this.min = min;
        this.max = max;
        this.size = size;
    }
    
    public enum Size {
        FINE, DIMINUITIVE, TINY, SMALL, MEDIUM, LARGE, HUGE, GARGANTUAN, COLOSSAL;
    }

    public int min() {
        return min;
    }

    public int max() {
        return max;
    }

    public Size size() {
        return size;
    }
    
    

}
