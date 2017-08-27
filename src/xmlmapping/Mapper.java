/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package xmlmapping;

import java.util.List;

public interface Mapper<E> {
    
    public List<E> selectAll();
    
    public <A extends E> List<? extends E> selectAllOfType(Class<A> type);
    
    public <A extends E> A selectByName(String name, Class<A> type);

}
