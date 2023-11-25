import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void diff() {
        Calculator calculator = new Calculator();

        int result = calculator.diff(5, 2);

        assertEquals(3, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        
        int result1 = calculator.div(6, 2);

        assertEquals(3, result1);
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();

        int result = calculator.times(4, 3);

        assertEquals(12, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();

        // x = (b * c) + a
        int result = calculator.solver(2, 3, 4);

        assertEquals(14, result);
    }
}
