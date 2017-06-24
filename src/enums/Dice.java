/**
 *
 * @date Jun 21, 2017
 *
 * @author Reznov
 * @website http://www.reznov.be/
 */
package enums;

import java.util.Random;

public class Dice extends Number {

    public enum DiceType {
        D2(2), D4(4), D6(6), D8(8), D10(10), D12(12), D20(20), D100(100);
        
        protected Integer number;
        
        DiceType(Integer number) {
            this.number = number;
        }
    }
    
    private Integer amount = 1;
    private Random random = new Random();
    private DiceType type;
    
    public Dice(DiceType type) {
        this.type = type;
    }
    
    public Dice(DiceType type, Integer amount) {
        this(type);
        this.amount = amount;
    }

    @Override
    public int intValue() {
        int number = random.nextInt(type.number) + 1;
        for (int i = 0; i < amount - 1; i++) {
            number += random.nextInt(type.number) + 1;
        }
        return number;
    }

    @Override
    public long longValue() {
        long number = random.nextInt(type.number) + 1;
        for (int i = 0; i < amount - 1; i++) {
            number += random.nextInt(type.number) + 1;
        }
        return number;
    }

    @Override
    public float floatValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double doubleValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
