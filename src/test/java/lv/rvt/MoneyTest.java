package lv.rvt;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testPlusMethod() {
        Money money1 = new Money(1, 10);
        Money money2 = new Money(1, 10);
        Money money3 = money1.plus(money2);

        assertTrue(money3.euros() == 2);
        assertTrue(money3.cents() == 20);

        Money money4 = new Money(1,99);
        Money money5 = new Money(1,10);
        Money money6 = money4.plus(money5);

        assertTrue(money6.euros() == 3);
        assertTrue(money6.cents() == 9);
        
    }

    @Test
    public void testMinusMethod() {

    }

    @Test
    public void testLessThanMethod() {

    }
}