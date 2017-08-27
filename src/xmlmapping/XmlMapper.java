/**
 *
 * @date Aug 15, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package xmlmapping;

import ability.*;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.collections.ArrayConverter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import com.thoughtworks.xstream.mapper.Mapper;
import damage.*;
import gear.*;
import gear.armor.*;
import gear.weapon.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import magic.*;

public class XmlMapper {

    private static File file;
    private static ObjectOutputStream out;
    private static ObjectInputStream in;
    private static ArrayConverter arrayConverter;

    private static Class[] types = new Class[]{AdventuringGear.class, Coin.class, Container.class, GamingSet.class, Tool.class, MusicalInstrument.class, Inventory.class,
        Kit.class, MartialMeleeWeapon.class, MartialRangedWeapon.class, SimpleMeleeWeapon.class, SimpleRangedWeapon.class, Range.class,
        LightArmor.class, MediumArmor.class, HeavyArmor.class, Shield.class,
        Advantage.class, Disadvantage.class,
        StrengthSkills.class, DexteritySkills.class, IntelligenceSkills.class, WisdomSkills.class, CharismaSkills.class,
        BardSpell.class, PaladinSpell.class, WizardSpell.class, SorcererSpell.class, ClericSpell.class, DruidSpell.class, RangerSpell.class, WarlockSpell.class};

    private static XStream initXStream() {
        XStream xs = new XStream(new StaxDriver());
        for (Class clazz : types) {
            xs.alias(clazz.getSimpleName().replace("Skills", ""), clazz);
        }
        XStream.setupDefaultSecurity(xs);
        xs.autodetectAnnotations(true);
        Mapper mapper = xs.getMapper();
        arrayConverter = new ArrayConverter(mapper);
        xs.allowTypes(types);
        xs.registerConverter(arrayConverter);
        return xs;
    }

    private static void initIn(String fileName) throws IOException {
        file = new File(fileName);
        in = xs.createObjectInputStream(new FileInputStream(file));
    }

    private static void initOut(String fileName) throws IOException {
        file = new File(fileName);
        if (file.exists() && !file.isDirectory()) {
            Scanner input = new Scanner(System.in);
            System.out.println("Are you sure you want to save to " + fileName + "? [Y/N]");
            String answer = input.next();
            if (!answer.equals("Y")) {
                throw new IllegalArgumentException();
            }
        }
        out = xs.createObjectOutputStream(new PrettyPrintWriter(new FileWriter(file)), "ampd");
    }

    public static <E> List<E> fromXML(String fileName) throws IOException, ClassNotFoundException {
        initIn(fileName);
        List<E> objectList = new ArrayList<>();
        try {
            while (true) {
                objectList.add((E) in.readObject());
            }
        } catch (EOFException e) {

        }
        return objectList;
    }

    public static <E> void toXML(String fileName, List<E> objects) throws IOException {
        initOut(fileName);
        for (E object : objects) {
            out.writeObject(object);
        }
        out.close();
    }

    private static XStream xs = initXStream();
}
