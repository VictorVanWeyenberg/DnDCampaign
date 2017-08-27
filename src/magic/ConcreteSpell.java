/**
 *
 * @date Jul 10, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package magic;

import damage.Damage;
import domain.Choice;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import races.Race;

public abstract class ConcreteSpell implements ISpell {

    private String name;
    private Integer level;
    private String description;
    private School school;
    private Character[] components;
    private CastingTime castingTime;
    private String range;
    private String duration;

    @Override
    public String name() {
        return name;
    }

    @Override
    public Integer level() {
        return level;
    }

    @Override
    public String description() {
        return description;
    }
    
    public ConcreteSpell(String name, Integer level, String description, School school, Character[] components, CastingTime castingTime, String range, String duration) {
        this.name = name;
        this.level = level;
        this.description = description;
        this.school = school;
        this.components = components;
        this.castingTime = castingTime;
        this.range = range;
        this.duration = duration;
    }

    @Override
    public School school() {
        return school;
    }

    @Override
    public Character[] components() {
        return components;
    }

    @Override
    public CastingTime castingTime() {
        return castingTime;
    }

    @Override
    public String range() {
        return range;
    }

    @Override
    public String duration() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ConcreteSpell{" + "name=" + name + ", level=" + level + ", description=" + description + ", school=" + school + ", components=" + components + ", castingTime=" + castingTime + ", range=" + range + ", duration=" + duration + '}';
    }

}
