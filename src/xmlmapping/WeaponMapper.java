/**
 *
 * @date Aug 20, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package xmlmapping;

import gear.AdventuringGear;
import gear.weapon.MartialMeleeWeapon;
import gear.weapon.Weapon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import magic.ISpell;

public class WeaponMapper implements Mapper<Weapon> {

    private final String MARTIAL_MELEE_WEAPON = "src/xmls/MartialMeleeWeapon.xml";
    private final String MARTIAL_RANGED_WEAPON = "src/xmls/MartialRangedWeapon.xml";
    private final String SIMPLE_MELEE_WEAPON = "src/xmls/SimpleMeleeWeapon.xml";
    private final String SIMPLE_RANGED_WEAPON = "src/xmls/SimpleRangedWeapon.xml";

    public <W extends Weapon> W selectByName(String name, Class<W> type) {
        String fileName = checkFileName(type);
        try {
            List<W> weapons = XmlMapper.fromXML(fileName).stream().map(w -> (W) w).collect(Collectors.toList());
            return weapons.stream().filter(w -> w.name().equals(name)).findFirst().orElse(null);
        } catch (IOException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public <W extends Weapon> List<? extends Weapon> selectAllOfType(Class<W> type) {
        String fileName = checkFileName(type);
        try {
            return XmlMapper.fromXML(fileName).stream().map(w -> (W) w).collect(Collectors.toList());
        } catch (IOException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WeaponMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Weapon> selectAll() {
        List<String> files = Arrays.asList(new String[] {SIMPLE_MELEE_WEAPON, SIMPLE_RANGED_WEAPON, MARTIAL_MELEE_WEAPON, MARTIAL_RANGED_WEAPON});
        List<Weapon> weapons = new ArrayList<>();
        for (String file : files) {
            try {
                weapons.addAll(XmlMapper.fromXML(file));
            } catch (IOException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return weapons;
    }

    private <W extends Weapon> String checkFileName(Class<W> type) {
        switch (type.getSimpleName()) {
            case "MartialMeleeWeapon":
                return MARTIAL_MELEE_WEAPON;
            case "MartialRangedWeapon":
                return MARTIAL_RANGED_WEAPON;
            case "SimpleMeleeWeapon":
                return SIMPLE_MELEE_WEAPON;
            case "SimpleRangedWeapon":
                return SIMPLE_RANGED_WEAPON;
            default:
                throw new IllegalArgumentException("Invalid type \"" + type.getSimpleName() + "\" in WeaponMapper.");
        }
    }

}
