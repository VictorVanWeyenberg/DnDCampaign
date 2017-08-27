/**
 *
 * @date Jun 23, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package gear;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import util.Builder;

public class ConcreteGear implements IGear {

    protected Coin coin;
    protected Double weight;
    protected String description;

    @Override
    public Coin coin() {
        return coin;
    }

    @Override
    public Double weight() {
        return weight;
    }

    @Override
    public String description() {
        return description;
    }

    public static class ConcreteGearBuilder implements Builder<ConcreteGear> {

        protected Coin coin;
        protected Double weight;
        protected String description;

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

        public ConcreteGear build() {
            return new ConcreteGear(coin, weight, description);
        }

    }

    protected ConcreteGear(Coin coin, Double weight) {
        this.coin = coin;
        this.weight = weight;
    }

    protected ConcreteGear(Coin coin, Double weight, String description) {
        this(coin, weight);
        this.description = description;
    }

}
