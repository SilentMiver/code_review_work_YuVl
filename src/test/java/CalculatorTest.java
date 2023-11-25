import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void diff() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.diff(2, 3));
        assertEquals(-1, calculator.diff(-4, -3));
        assertEquals(0, calculator.diff(0, 0));
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(6, -3));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.times(2, 3));
        assertEquals(-12, calculator.times(4, -3));
        assertEquals(0, calculator.times(0, 0));
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.solver(2, 3, 2));
        assertEquals(0, calculator.solver(0, 0, 5));
        assertEquals(15, calculator.solver(5, 2, 5));
    }
}
