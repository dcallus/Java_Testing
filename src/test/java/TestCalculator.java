import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calc.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calc.subtract(4, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(20, calc.multiply(5, 4));
    }

    @Test
    public void canDivid(){
        assertEquals(2.5, calc.divide(5, 2), 0.0);
    }



}
