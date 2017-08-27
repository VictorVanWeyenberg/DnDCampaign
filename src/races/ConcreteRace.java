/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package races;

import domain.Proficiency;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import magic.Spellbook;

public abstract class ConcreteRace implements Race {

    @Override
    public List<Proficiency> proficiencies() {
        List<Proficiency> proficiencies = new ArrayList<>();
        raceTraits().forEach(r -> Arrays.asList(r.proficiencies()).forEach(p -> proficiencies.add(p)));
        return proficiencies;
    }
    
    @Override
    public Spellbook spellbook() {
        return null;
    }
    
    public static <R extends Race> R initInstance(Class<R> type) {
        Race race = null;
        try {
            race = type.newInstance();
        } catch (InstantiationException ex) { 
            Logger.getLogger(ConcreteRace.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ConcreteRace.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (R) race;
    }

}
