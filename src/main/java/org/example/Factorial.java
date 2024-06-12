package org.example;

import java.math.BigInteger;

/** класс, вычисляющий факториал числа. */
public final class Factorial {
  private  Factorial() { }

  /** функция, вычисляющая факториал числа.
    *
    * @param x - число, для которого ищется факториал
    * @return - возвращает факториал числа x
    */
  public static BigInteger getFactorial(final int x) {
    if (x <= 1) {
      return BigInteger.valueOf(1);
    } else {
      return BigInteger.valueOf(x).multiply(getFactorial(x - 1));
    }
  }
}
