package org.example;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

/** класс, тестирующий функцию, вычисляющую факториал.*/
public class FactorialTest {
    /** функция, тестирующая корректность вычисление факториала в классе Factorial.
     *
     */
    @org.junit.Test
    public void factorialTest() {
        // тест 1
        final int x1 = 1;
        final int rightAnswer1 = 1;
        BigInteger result1 = Factorial.getFactorial(x1);
        BigInteger expected1 = BigInteger.valueOf(rightAnswer1);
        assertEquals(expected1, result1);
        // тест 2
        final int x2 = 5;
        final int rightAnswer2 = 120;
        BigInteger result2 = Factorial.getFactorial(x2);
        BigInteger expected2 = BigInteger.valueOf(rightAnswer2);
        assertEquals(expected2, result2);
        // тест 3
        final int x3 = 8;
        final int rightAnswer3 = 40320;
        BigInteger result3 = Factorial.getFactorial(x3);
        BigInteger expected3 = BigInteger.valueOf(rightAnswer3);
        assertEquals(expected3, result3);
        // тест 4
        final int x4 = 10;
        final int rightAnswer4 = 3628800;
        BigInteger result4 = Factorial.getFactorial(x4);
        BigInteger expected4 = BigInteger.valueOf(rightAnswer4);
        assertEquals(expected4, result4);
        // тест 5
        final int x5 = 12;
        final int rightAnswer5 = 479001600;
        BigInteger result5 = Factorial.getFactorial(x5);
        BigInteger expected5 = BigInteger.valueOf(rightAnswer5);
        assertEquals(expected5, result5);
    }
}
