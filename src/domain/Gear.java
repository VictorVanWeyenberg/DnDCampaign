/**
 *
 * @date Jun 23, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package domain;

public class Gear {

    protected Coin coin;
    protected Double weight;
    private String description;

    public Gear(Coin coin, Double weight) {
        this.coin = coin;
        this.weight = weight;
    }

    public Gear(Coin coin, Double weight, String description) {
        this(coin, weight);
        this.description = description;
    }

}
