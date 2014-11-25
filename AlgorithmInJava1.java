/*
 * 数値計算のアルゴリズム
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AlgorithmInJava1 {
  /*
   * 西暦年yearが閏年かどうかを判定する。
   */
  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0) {
      return true;
    } else if (year % 400 == 0) {
      return true;
    } else {
      return false;
    }
  }

  /*
   * 整数nが素数かどうかを判定する。
   * ループ版
   */
  public static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }

    int stopPoint = (int) Math.sqrt(n);
    for (int i = 2; i <= stopPoint; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

  /*
   * ストリーム版
   */
  public static boolean isPrime2(int n) {
    if (n < 2) {
      return false;
    }

    int stopPoint = (int) Math.sqrt(n);
    return IntStream.rangeClosed(2, stopPoint)
      .allMatch(i -> n % i != 0);
  }

  /*
   * ユークリッドの互除法により整数a, bの最大公約数を算出する。
   * a, bが1未満の場合、Optional.emptyを返却する。
   * 除算版
   */
  public static Optional<Integer> gcd(int a, int b) {
    if (a < 1 || b < 1) {
      return Optional.empty();
    }

    while (b > 0) {
      int r = a % b;
      a = b;
      b = r;
    }
    return Optional.of(a);
  }

  /*
   * 減算版
   */
  public static Optional<Integer> gcd2(int a, int b) {
    if (a < 1 || b < 1) {
      return Optional.empty();
    }

    while (true) {
      if (a > b) {
        a -= b;
      } else if (a < b) {
        b -= a;
      } else {
        return Optional.of(a);
      }
    }
  }

  /*
   * 整数a, bの最小公倍数を算出する。
   * a, bが1未満の場合、Optional.emptyを返却する。
   */
  public static Optional<Integer> lcm(int a, int b) {
    if (a < 1 || b < 1) {
      return Optional.empty();
    }

    return gcd(a, b).map(gcd -> a * b / gcd);
  }

  /*
   * フィボナッチ数列の第i項の値を算出する。
   * iが1未満の場合、Optional.emptyを返却する。
   * ループ版
   */
  public static Optional<Long> fibonacci(int i) {
    if (i < 1) {
      return Optional.empty();
    }

    long previous = 1L;
    long current = 0L;
    for (int j = 0; j < i; j++) {
      long tmp = previous;
      previous = current;
      current = tmp + current;
    }
    return Optional.of(current);
  }

  /*
   * 再帰版
   */
  public static Optional<Long> fibonacci2(int i) {
    if (i < 1) {
      return Optional.empty();
    } else if (i == 1 || i == 2) {
      return Optional.of(1L);
    }

    return fibonacci2(i - 2).flatMap(fib1 -> fibonacci2(i - 1).map(fib2 -> fib1 + fib2));
  }

  /*
   * 末尾再帰版
   */
  public static Optional<Long> fibonacci3(int i) {
    if (i < 1) {
      return Optional.empty();
    }

    return Optional.of(fib(i, 1L, 0L));
  }

  private static long fib(int x, long previous, long current) {
    if (x == 1) {
      return previous + current;
    }

    return fib(x - 1, current, previous + current);
  }

  /*
   * 再帰(メモ化)版
   */
  public static Optional<Long> fibonacci4(int i) {
    if (i < 1) {
      return Optional.empty();
    }

    return Optional.of(fib2(i, new HashMap<>()));
  }

  private static long fib2(int x, Map<Integer, Long> fibMap) {
    if (x == 1 || x == 2) {
      return 1L;
    } else if (!fibMap.containsKey(x)) {
      fibMap.put(x, fib2(x - 2, fibMap) + fib2(x - 1, fibMap));
    }

    return fibMap.get(x);
  }

  /*
   * 整数nの階乗n!の値を算出する。
   * nが負の数の場合、Optional.emptyを返却する。
   * ループ版
   */
  public static Optional<Long> factorial(int n) {
    if (n < 0) {
      return Optional.empty();
    }

    long product = 1L;
    for (int i = 2; i <= n; i++) {
      product *= i;
    }
    return Optional.of(product);
  }

  /*
   * 再帰版
   */
  public static Optional<Long> factorial2(int n) {
    if (n < 0) {
      return Optional.empty();
    } else if (n == 0 || n == 1) {
      return Optional.of(1L);
    }

    return factorial2(n - 1).map(fact -> n * fact);
  }

  /*
   * 末尾再帰版
   */
  public static Optional<Long> factorial3(int n) {
    if (n < 0) {
      return Optional.empty();
    }

    return Optional.of(fact(n, 1L));
  }

  private static long fact(int x, long product) {
    if (x == 0 || x == 1) {
      return product;
    }

    return fact(x - 1, product * x);
  }

  /*
   * 畳み込み版
   */
  public static Optional<Long> factorial4(int n) {
    if (n < 0) {
      return Optional.empty();
    }

    return Optional.of(LongStream.rangeClosed(2, n)
      .reduce(1L, (product, i) -> product * i));
  }
}
