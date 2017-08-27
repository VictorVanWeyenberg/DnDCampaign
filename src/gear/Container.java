/**
 *
 * @date Aug 19, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("Container")
public class Container extends AdventuringGear {
    
    private String capacity;
    
    public static class ContainerBuilder/*extends ConcreteGearBuilder*/ {
        
        private String capacity;
        private Coin coin;
        private Double weight;
        private String description;
        
        public ContainerBuilder setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }

        protected ContainerBuilder setCoin(Coin coin) {
            this.coin = coin;
            return this;
        }

        protected ContainerBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        protected ContainerBuilder setDescription(String description) {
            this.description = description;
            return this;
        }
        
        public Container build() {
            return new Container("", coin, weight, description, capacity);
        }
        
    }
    
    public Container(String name, Coin coin, Double weight, String capacity) {
        super(name, coin, weight);
        this.capacity = capacity;
    }

    public Container(String name, Coin coin, Double weight, String description, String capacity) {
        super(name, coin, weight, description);
        this.capacity = capacity;
    }

}
