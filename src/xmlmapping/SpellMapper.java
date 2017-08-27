/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package xmlmapping;

import gear.AdventuringGear;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import magic.ISpell;

public class SpellMapper implements Mapper<ISpell> {
    
    private final String BARD = "src/xml/BardSpell.xml";
    private final String CLERIC = "src/xml/ClericSpell.xml";
    private final String DRUID = "src/xml/DruidSpell.xml";
    private final String PALADIN = "src/xml/PaladinSpell.xml";
    private final String RANGER = "src/xml/RangerSpell.xml";
    private final String SORCERER = "src/xml/SorcererSpell.xml";
    private final String WARLOCK = "src/xml/WarlockSpell.xml";
    private final String WIZARD = "src/xml/WizardSpell.xml";

    @Override
    public List<ISpell> selectAll() {
        List<String> files = Arrays.asList(new String[] {BARD, CLERIC, DRUID, PALADIN, RANGER, SORCERER, WARLOCK, WIZARD});
        List<ISpell> spells = new ArrayList<>();
        for (String file : files) {
            try {
                spells.addAll(XmlMapper.fromXML(file));
            } catch (IOException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return spells;
    }

    @Override
    public <A extends ISpell> List<? extends ISpell> selectAllOfType(Class<A> type) {
        String fileName = checkFileName(type);
        try {
            return XmlMapper.fromXML(fileName).stream().map(w -> (A) w).collect(Collectors.toList());
        } catch (IOException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public <A extends ISpell> List<? extends ISpell> selectByLevelAndType(Class<A> type, Integer level) {
        List<? extends ISpell> spells = selectAllOfType(type);
        return spells.stream().filter(s -> s.level().equals(level)).collect(Collectors.toList());
    }

    @Override
    public <A extends ISpell> A selectByName(String name, Class<A> type) {
        String fileName = checkFileName(type);
        try {
            List<A> weapons = XmlMapper.fromXML(fileName).stream().map(w -> (A) w).collect(Collectors.toList());
            return weapons.stream().filter(w -> w.name().equals(name)).findFirst().orElse(null);
        } catch (IOException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private <A extends ISpell> String checkFileName(Class<A> type) {
        switch(type.getSimpleName()) {
            case "BardSpell": return BARD;
            case "ClericSpell": return CLERIC;
            case "DruidSpell": return DRUID;
            case "PaladinSpell": return PALADIN;
            case "RangerSpell": return RANGER;
            case "SorcererSpell": return SORCERER;
            case "WarlockSpell": return WARLOCK;
            case "WizardSpell": return WIZARD;
            default:
                throw new IllegalArgumentException("Invalid type \"" + type.getSimpleName() + "\" in WeaponMapper.");
        }
    }

}
