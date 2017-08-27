/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

public class CastingTime {
    
    private Integer amount;
    private TimeUnit unit;
    
    public CastingTime(Integer amount, TimeUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "CastingTime{" + "amount=" + amount + ", unit=" + unit + '}';
    }

}
