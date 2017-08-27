/**
 *
 * @date Aug 27, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Choice<E> {
    
    private Integer amount;
    private List<E> choices;
    
    private E choice;
    
    public Choice(Integer amount, List<E> choices) {
        this.amount = amount;
        this.choices = choices;
    }
    
    public E get() {
        return choice;
    }

}
