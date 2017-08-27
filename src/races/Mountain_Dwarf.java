/**
 *
 * @date Jun 24, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

import ability.AbilityScoreIncrease;
import ability.Ability;
import domain.Proficiency;
import gear.armor.Armor;
import gear.armor.LightArmor;
import gear.armor.MediumArmor;
import java.util.List;
import xmlmapping.ArmorMapper;

public class Mountain_Dwarf extends Dwarf {
    
    private ArmorMapper armorMapper;
    
    public Mountain_Dwarf() {
        armorMapper = new ArmorMapper();
    }

    @Override
    public List<AbilityScoreIncrease> abilityScoreIncrease() {
        List<AbilityScoreIncrease> asi = super.abilityScoreIncrease();
        asi.add(new AbilityScoreIncrease(Ability.STRENGTH, 2));
        return asi;
    }

    @Override
    public List<RaceTrait> raceTraits() {
        List<RaceTrait> rt = super.raceTraits();
        rt.add(new RaceTraitBuilder("Dwarven Armor Training")
                .addDescription("You are proficient with light and medium armor.")
                .addProficiencies(new Proficiency<Armor>((List<Armor>) armorMapper.selectAllOfType(LightArmor.class)), new Proficiency<Armor>((List<Armor>) armorMapper.selectAllOfType(MediumArmor.class)))
                .build());
        return rt;
    }

}
