/**
 *
 * @date Jul 8, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

import damage.Damage;

public interface ISpell {
    
    public String name();
    
    public Integer level();
    
    public String description();
    
    public School school();
    
    public Character[] components();
    
    public CastingTime castingTime();
    
    public String range();
    
    public String duration();

}
