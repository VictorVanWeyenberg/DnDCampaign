/**
 *
 * @date Jun 20, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package ability;

public enum Ability {

    STRENGTH(StrengthSkills.values()), DEXTERITY(DexteritySkills.values()), CONSTITUTION(null), INTELLIGENCE(IntelligenceSkills.values()), WISDOM(WisdomSkills.values()), CHARISMA(CharismaSkills.values());
    
    private Enum[] skills;
    
    Ability(Enum[] skills) {
        this.skills = skills;
    }
    
    public interface Skill {
        Ability ability();
    }
    
    public enum StrengthSkills implements Skill {
        ATHLETICS;

        @Override
        public Ability ability() {
            return STRENGTH;
        }
    }
    
    public enum DexteritySkills implements Skill {
        ACROBATICS, SLEIGHT_OF_HAND, STEALTH;

        @Override
        public Ability ability() {
            return DEXTERITY;
        }
    }
    
    public enum IntelligenceSkills implements Skill {
        ARCANA, HISTORY, INVESTIGATION, NATURE, RELIGION;

        @Override
        public Ability ability() {
            return INTELLIGENCE;
        }
    }
    
    public enum WisdomSkills implements Skill {
        ANIMAL_HANDLING, INSIGHT, MEDICINE, PERCEPTION, SURVIVAL;

        @Override
        public Ability ability() {
            return WISDOM;
        }
    }
    
    public enum CharismaSkills implements Skill {
        DECEPTION, INTIMIDATION, PERFORMANCE, PERSUASION;

        @Override
        public Ability ability() {
            return CHARISMA;
        }
    }
    
}
