/**
 *
 * @date Jun 25, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package ability;

public class AbilityScore {

    protected Ability ability;
    protected Integer amount;

    public AbilityScore(Ability ability, Integer amount) {
        this.ability = ability;
        this.amount = amount;
    }

    public Ability ability() {
        return ability;
    }

    public Integer amount() {
        return amount;
    }

}
