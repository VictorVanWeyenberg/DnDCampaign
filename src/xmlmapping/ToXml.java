/**
 *
 * @date Aug 26, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package xmlmapping;

import gear.armor.Armor;
import gear.armor.LightArmor;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import magic.*;

public class ToXml {
    
    private final String fileName = "src/xmls/HeavyArmor.xml";

    public static void main(String[] args) {
        new ToXml();
    }

    public ToXml() {
        try {
            List<Armor> unserializedSpells = XmlMapper.fromXML(fileName);
            unserializedSpells.forEach(s -> System.out.println(s.toString()));
        } catch (IOException ex) {
            Logger.getLogger(ToXml.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ToXml.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
