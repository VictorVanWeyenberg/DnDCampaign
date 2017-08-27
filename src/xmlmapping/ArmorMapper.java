/**
 *
 * @date Aug 26, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package xmlmapping;

import gear.AdventuringGear;
import gear.armor.Armor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import magic.ISpell;

public class ArmorMapper implements Mapper<Armor> {
    
    private final String LIGHT_ARMOR = "src/xmls/LightArmor.xml";
    private final String MEDIUM_ARMOR = "src/xmls/MediumArmor.xml";
    private final String HEAVY_ARMOR = "src/xmls/HeavyArmor.xml";

    @Override
    public List<Armor> selectAll() {
        List<String> files = Arrays.asList(new String[] {LIGHT_ARMOR, MEDIUM_ARMOR, HEAVY_ARMOR});
        List<Armor> armor = new ArrayList<>();
        for (String file : files) {
            try {
                armor.addAll(XmlMapper.fromXML(file));
            } catch (IOException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return armor;
    }

    @Override
    public <A extends Armor> List<? extends Armor> selectAllOfType(Class<A> type) {
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

    @Override
    public <A extends Armor> A selectByName(String name, Class<A> type) {
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

    private <A extends Armor> String checkFileName(Class<A> type) {
        switch (type.getSimpleName()) {
            case "LightArmor":
                return LIGHT_ARMOR;
            case "MediumArmor":
                return MEDIUM_ARMOR;
            case "HeavyArmor":
                return HEAVY_ARMOR;
            default:
                throw new IllegalArgumentException("Invalid type \"" + type.getSimpleName() + "\" in WeaponMapper.");
        }
    }

}
