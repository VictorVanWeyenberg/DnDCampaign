/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package races;

public class Alignment {

    public enum Entropy {
        LAWFUL, TRUELY, CHAOTIC;
    }

    public enum Motif {
        GOOD, NEUTRAL, EVIL;
    }
    
    private Entropy entropy;
    private Motif motif;
    
    public Alignment(Entropy entropy, Motif motif) {
        this.entropy = entropy;
        this.motif = motif;
    }

    public Entropy entropy() {
        return entropy;
    }

    public Motif motif() {
        return motif;
    }

}
