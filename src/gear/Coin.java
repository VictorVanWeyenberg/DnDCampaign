/**
 *
 * @date Jun 21, 2017
 * 
 * @author Reznov
 * @website http://www.reznov.be/
 */

package gear;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Coin {
    
    @XStreamAsAttribute
    private Integer copper, silver, electrum, gold, platinum;
    
    public enum CoinType {
        CP, SP, EP, GP, PP;
    }
    
    private Coin() {
        copper = silver = electrum = gold = platinum = 0;
    }
    
    public Coin(Integer... coins) {
        this();
        if (coins.length != 5) {
            throw new IllegalArgumentException("There are five coin types");
        }
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] < 0) {
                throw new IllegalArgumentException("Coin amount can not be negative.");
            }
            set(CoinType.values()[i], coins[i]);
        }
    }
    
    public Coin (Integer amount, CoinType type) {
        this();
        set(type, amount);
    }
    
    public void set(CoinType type, Integer amount) {
        switch(type) {
            case CP:
                copper = amount;
                break;
            case SP:
                silver = amount;
                break;
            case EP:
                electrum = amount;
                break;
            case GP:
                gold = amount;
                break;
            case PP:
                platinum = amount;
                break;
        }
    }

}
