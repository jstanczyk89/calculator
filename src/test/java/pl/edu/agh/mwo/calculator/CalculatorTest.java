package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

        Calculator tester = new Calculator();

        @Test
        void sumOfTwoNumbers() {

            assertEquals(10, tester.sum(5,5));
            assertEquals(6, tester.sum(2,4));
            assertEquals(13, tester.sum(10,3));
            assertEquals(15, tester.sum(13,2));

        }

    @Test
    void subtractOfTwoNumbers() {

        assertEquals(5, tester.subtract(10,2));
        assertEquals(2, tester.subtract(4,2));
        assertEquals(3, tester.subtract(9,3));
        assertEquals(7, tester.subtract(14,2));

    }
}
