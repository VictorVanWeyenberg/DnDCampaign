/**
 *
 * @date Aug 27, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import damage.Advantage;
import damage.DamageToughness;
import domain.Proficiency;
import magic.Spellbook;

public class RaceTraitBuilder {

    private String name;
    private String description;
    private DamageToughness[] damageToughness;
    private Advantage[] advantages;
    private Proficiency[] proficiencies;
    private Spellbook spellbook;

    public RaceTraitBuilder(String name) {
        this.name = name;
    }

    public RaceTraitBuilder addDescription(String description) {
        this.description = description;
        return this;
    }

    public RaceTraitBuilder addDamageToughness(DamageToughness... damageToughness) {
        this.damageToughness = damageToughness;
        return this;
    }

    public RaceTraitBuilder addAdvantages(Advantage... advantages) {
        this.advantages = advantages;
        return this;
    }

    public RaceTraitBuilder addProficiencies(Proficiency... proficiencies) {
        this.proficiencies = proficiencies;
        return this;
    }

    public RaceTraitBuilder addSpellbook(Spellbook spellbook) {
        this.spellbook = spellbook;
        return this;
    }

    public RaceTrait build() {
        return new RaceTrait(name, description, damageToughness, advantages, proficiencies, spellbook);
    }

}
