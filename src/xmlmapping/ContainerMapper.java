/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package xmlmapping;

import gear.Container;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContainerMapper implements Mapper<Container> {
    
    private final String container = "src/xmls/Container.xml";

    @Override
    public List<Container> selectAll() {
        try {
            return XmlMapper.fromXML(container);
        } catch (IOException ex) {
            Logger.getLogger(ContainerMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContainerMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public <A extends Container> List<? extends Container> selectAllOfType(Class<A> type) {
        return selectAll();
    }

    @Override
    public <A extends Container> A selectByName(String name, Class<A> type) {
        return (A) selectAll().stream().filter(c -> c.name().equals(name)).findFirst().get();
    }

}
