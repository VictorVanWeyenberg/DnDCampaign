/**
 *
 * @date Aug 22, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package xmlmapping;

import gear.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class GearMapper implements Mapper<AdventuringGear> {

    private final String TOOL = "src/xmls/Tool.xml";
    private final String ADVENTURING_GEAR = "src/xmls/AdventuringGear.xml";
    private final String GAMING_SET = "src/xmls/GamingSet.xml";
    private final String KIT = "src/xmls/Kit.xml";
    private final String MUSICAL_INSTRUMENT = "src/xmls/MusicalInstrument.xml";
    
    private Set<Tool> tools;
    private Set<AdventuringGear> adventuringGear;
    private Set<GamingSet> gamingSets;
    private Set<Kit> kits;
    private Set<MusicalInstrument> musicalInstruments;
    
    public GearMapper() {
        tools = new HashSet<>();
        adventuringGear = new HashSet<>();
        gamingSets = new HashSet<>();
        kits = new HashSet<>();
        musicalInstruments = new HashSet<>();
    }

    public <A extends AdventuringGear> A selectByName(String name, Class<A> type) {
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

    public <A extends AdventuringGear> List<? extends AdventuringGear> selectAllOfType(Class<A> type) {
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
    public List<AdventuringGear> selectAll() {
        List<String> files = Arrays.asList(new String[] {ADVENTURING_GEAR, GAMING_SET, KIT, MUSICAL_INSTRUMENT, TOOL});
        List<AdventuringGear> gear = new ArrayList<>();
        for (String file : files) {
            try {
                gear.addAll(XmlMapper.fromXML(file));
            } catch (IOException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GearMapper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return gear;
    }

    private <A extends AdventuringGear> String checkFileName(Class<A> type) {
        switch (type.getSimpleName()) {
            case "Tool":
                return TOOL;
            case "AdventuringGear":
                return ADVENTURING_GEAR;
            case "GamingSet":
                return GAMING_SET;
            case "Kit":
                return KIT;
            case "MusicalInstrument":
                return MUSICAL_INSTRUMENT;
            default:
                throw new IllegalArgumentException("Invalid type \"" + type.getSimpleName() + "\" in WeaponMapper.");
        }
    }

}
