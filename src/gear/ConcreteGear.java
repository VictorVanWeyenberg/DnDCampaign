/**
 *
 * @date Jun 23, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import domain.Coin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import util.Builder;

public class ConcreteGear {

    protected Coin coin;
    protected Double weight;
    protected String description;
    private Gear[] subGear;

    public static class ConcreteGearBuilder implements Builder<ConcreteGear> {

        private Coin coin;
        private Double weight;
        private String description;
        private List<Gear> subGear = new ArrayList<>();

        protected ConcreteGearBuilder setCoin(Coin coin) {
            this.coin = coin;
            return this;
        }

        protected ConcreteGearBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        protected ConcreteGearBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        protected ConcreteGearBuilder addSubGear(Gear... gears) {
            this.subGear.addAll(Arrays.asList(gears));
            return this;
        }

        public ConcreteGear build() {
            return new ConcreteGear(coin, weight, subGear, description);
        }

    }

    protected ConcreteGear(Coin coin, Double weight) {
        this.coin = coin;
        this.weight = weight;
    }

    protected ConcreteGear(Coin coin, Double weight, List<Gear> subGear, String description) {
        this(coin, weight);
        this.description = description;
        this.subGear = (Gear[]) subGear.toArray();
    }

}
