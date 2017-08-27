/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package magic;

import ability.Ability;
import java.util.HashSet;
import java.util.Set;

public class Spellbook extends HashSet<ISpell> {
    
    public Ability spellcastingAbility;
    
    public Spellbook(Ability spellcastingAbility) {
        this.spellcastingAbility = spellcastingAbility;
    }
    
    public Spellbook(Ability spellcastingAbility, ISpell... spells) {
        this.spellcastingAbility = spellcastingAbility;
        for (ISpell spell : spells) {
            add(spell);
        }
    }

}
