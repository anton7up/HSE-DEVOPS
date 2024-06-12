package org.example;

import java.math.BigInteger;
import java.util.Scanner;

/** класс, запускающий программу. */
public final class Main {
  private Main() { }

  /** функция, запускающая программу.
    *
    * @param args - аргументы запуска
    */
  public static void main(final String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    BigInteger factorial = Factorial.getFactorial(n);
    System.out.println("Факториал " + n + " равен " + factorial);
  }
}
