/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

import gear.IGear;
import java.util.ArrayList;
import java.util.List;

public class Proficiency<E> {
    
    private List<E> proficient;
    
    public Proficiency(E proficient) {
        this.proficient = new ArrayList<>();
            this.proficient.add(proficient);
    }
    
    public Proficiency(List<E> proficient) {
        this.proficient = proficient;
    }
    
    public List<E> gear() {
        return proficient;
    }

    @Override
    public String toString() {
        String proficientString = "You are proficient with ";
        for (int i = 0; i < proficient.size(); i++) {
            proficientString += proficient.get(i).toString().toLowerCase();
            if (i == proficient.size() - 1) {
                proficientString += ". ";
            } else if (i == proficient.size() - 2) {
                proficientString += " and ";
            } else {
                proficientString += ", ";
            }
        }
        return proficientString;
    }

}
