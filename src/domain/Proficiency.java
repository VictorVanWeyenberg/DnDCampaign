/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

public class Proficiency<E extends Enum<E>> {
    
    private E[] gear;
    
    public Proficiency(E[] gear) {
        this.gear = gear;
    }
    
    public E[] gear() {
        return gear;
    }

    @Override
    public String toString() {
        String proficient = "You are proficient with ";
        for (int i = 0; i < gear.length; i++) {
            proficient += gear[i].toString().toLowerCase();
            if (i == gear.length - 1) {
                proficient += ".";
            } else if (i == gear.length - 2) {
                proficient += " and ";
            } else {
                proficient += ", ";
            }
        }
        return proficient;
    }

}
