package MathProblemTesting;

import org.junit.Test;
import static org.junit.Assert.*;
import MathProblem.Math;


public class MathTests {

    @Test
    public void testAddition() {
        String result = Math.mathOperations(10, 5, 15);
        assertEquals("10 + 5 = 15", result);
    }

    @Test
    public void testSubtraction() {
        String result = Math.mathOperations(20, 10, 10);
        assertEquals("20 - 10 = 10", result);
    }

    @Test
    public void testMultiplication() {
        String result = Math.mathOperations(6, 3, 18);
        assertEquals("6 * 3 = 18", result);
    }

    @Test
    public void testDivision() {
        String result = Math.mathOperations(20, 4, 5);
        assertEquals("20 / 4 = 5", result);
    }

    @Test
    public void testNone() {
        String result = Math.mathOperations(7, 3, 10);
        assertEquals("None", result);
    }
}
