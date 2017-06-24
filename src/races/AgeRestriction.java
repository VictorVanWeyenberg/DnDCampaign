/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

public class AgeRestriction {
    
    private int young, adult, average;

    public AgeRestriction(int young, int adult, int average) {
        this.young = young;
        this.adult = adult;
        this.average = average;
    }

    public int young() {
        return young;
    }

    public int adult() {
        return adult;
    }

    public int death() {
        return average;
    }
    
    

}
