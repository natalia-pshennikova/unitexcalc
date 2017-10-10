package nata.unitex;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void add() throws Exception {
        assertEquals(4, calc.add(3, 1), 0.00001);
        assertEquals(40, calc.add(35, 5), 0.00001);
    }

    @Test
    public void sub() throws Exception {
        assertEquals(35, calc.sub(40, 5), 0.00001);
    }

    @Test
    public void mul() throws Exception {
        assertEquals(6, calc.mul(3, 2), 0.00001);
    }

    @Test
    public void div() throws Exception {
        assertEquals(20, calc.div(40, 2), 0.00001);
    }

//
    @Test
    public void divByZero() throws Exception {
        assertEquals(Double.POSITIVE_INFINITY, calc.div(5, 0), 0.00001);
    }
}