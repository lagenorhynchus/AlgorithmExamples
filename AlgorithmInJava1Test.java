/*
 * 数値計算のアルゴリズムのテスト
 * author: OHASHI Kent
 */

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AlgorithmInJava1Test {
  @Test
  public void isLeapYearで2012がtrueと判定される() {
    int year = 2012;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isLeapYear(year);
    assertThat(actual, is(expected));
  }

  @Test
  public void isLeapYearで2013がfalseと判定される() {
    int year = 2013;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isLeapYear(year);
    assertThat(actual, is(expected));
  }

  @Test
  public void isLeapYearで2000がtrueと判定される() {
    int year = 2000;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isLeapYear(year);
    assertThat(actual, is(expected));
  }

  @Test
  public void isLeapYearで2100がfalseと判定される() {
    int year = 2100;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isLeapYear(year);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeで2がtrueと判定される() {
    int n = 2;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeで1がfalseと判定される() {
    int n = 1;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeで13がtrueと判定される() {
    int n = 13;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeで15がfalseと判定される() {
    int n = 15;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeで0がfalseと判定される() {
    int n = 0;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrimeでマイナス1がfalseと判定される() {
    int n = -1;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2で2がtrueと判定される() {
    int n = 2;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2で1がfalseと判定される() {
    int n = 1;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2で13がtrueと判定される() {
    int n = 13;

    boolean expected = true;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2で15がfalseと判定される() {
    int n = 15;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2で0がfalseと判定される() {
    int n = 0;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void isPrime2でマイナス1がfalseと判定される() {
    int n = -1;

    boolean expected = false;
    boolean actual = AlgorithmInJava1.isPrime2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdで8と12の最大公約数が返却される() {
    int a = 8;
    int b = 12;

    Integer expected = 4;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdで2と3の最大公約数が返却される() {
    int a = 2;
    int b = 3;

    Integer expected = 1;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdで6と6の最大公約数が返却される() {
    int a = 6;
    int b = 6;

    Integer expected = 6;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaが0のときnullが返却される() {
    int a = 0;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでbが0のときnullが返却される() {
    int a = 2;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaとbが0のときnullが返却される() {
    int a = 0;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaがマイナス1のときnullが返却される() {
    int a = -1;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでbがマイナス1のときnullが返却される() {
    int a = 2;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaとbがマイナス1のときnullが返却される() {
    int a = -1;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で8と12の最大公約数が返却される() {
    int a = 8;
    int b = 12;

    Integer expected = 4;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で2と3の最大公約数が返却される() {
    int a = 2;
    int b = 3;

    Integer expected = 1;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で6と6の最大公約数が返却される() {
    int a = 6;
    int b = 6;

    Integer expected = 6;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaが0のときnullが返却される() {
    int a = 0;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でbが0のときnullが返却される() {
    int a = 2;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaとbが0のときnullが返却される() {
    int a = 0;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaがマイナス1のときnullが返却される() {
    int a = -1;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でbがマイナス1のときnullが返却される() {
    int a = 2;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaとbがマイナス1のときnullが返却される() {
    int a = -1;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで8と12の最小公倍数が返却される() {
    int a = 8;
    int b = 12;

    Integer expected = 24;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで2と3の最小公倍数が返却される() {
    int a = 2;
    int b = 3;

    Integer expected = 6;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで6と6の最小公倍数が返却される() {
    int a = 6;
    int b = 6;

    Integer expected = 6;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaが0のときnullが返却される() {
    int a = 0;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでbが0のときnullが返却される() {
    int a = 2;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaとbが0のときnullが返却される() {
    int a = 0;
    int b = 0;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaがマイナス1のときnullが返却される() {
    int a = -1;
    int b = 2;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでbがマイナス1のときnullが返却される() {
    int a = 2;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaとbがマイナス1のときnullが返却される() {
    int a = -1;
    int b = -1;

    Integer expected = null;
    Integer actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第1項の値が返却される() {
    int i = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第2項の値が返却される() {
    int i = 2;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第3項の値が返却される() {
    int i = 3;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第6項の値が返却される() {
    int i = 6;

    Long expected = 8L;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciでiが0のときnullが返却される() {
    int i = 0;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciでiがマイナス1のときnullが返却される() {
    int i = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第1項の値が返却される() {
    int i = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第2項の値が返却される() {
    int i = 2;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第3項の値が返却される() {
    int i = 3;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第6項の値が返却される() {
    int i = 6;

    Long expected = 8L;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2でiが0のときnullが返却される() {
    int i = 0;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2でiがマイナス1のときnullが返却される() {
    int i = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第1項の値が返却される() {
    int i = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第2項の値が返却される() {
    int i = 2;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第3項の値が返却される() {
    int i = 3;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第6項の値が返却される() {
    int i = 6;

    Long expected = 8L;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3でiが0のときnullが返却される() {
    int i = 0;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3でiがマイナス1のときnullが返却される() {
    int i = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第1項の値が返却される() {
    int i = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第2項の値が返却される() {
    int i = 2;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第3項の値が返却される() {
    int i = 3;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第6項の値が返却される() {
    int i = 6;

    Long expected = 8L;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4でiが0のときnullが返却される() {
    int i = 0;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4でiがマイナス1のときnullが返却される() {
    int i = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで0の階乗の値が返却される() {
    int n = 0;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで1の階乗の値が返却される() {
    int n = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで2の階乗の値が返却される() {
    int n = 2;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで5の階乗の値が返却される() {
    int n = 5;

    Long expected = 120L;
    Long actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialでnがマイナス1のときnullが返却される() {
    int n = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で0の階乗の値が返却される() {
    int n = 0;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で1の階乗の値が返却される() {
    int n = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で2の階乗の値が返却される() {
    int n = 2;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で5の階乗の値が返却される() {
    int n = 5;

    Long expected = 120L;
    Long actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2でnがマイナス1のときnullが返却される() {
    int n = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で0の階乗の値が返却される() {
    int n = 0;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で1の階乗の値が返却される() {
    int n = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で2の階乗の値が返却される() {
    int n = 2;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で5の階乗の値が返却される() {
    int n = 5;

    Long expected = 120L;
    Long actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3でnがマイナス1のときnullが返却される() {
    int n = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で0の階乗の値が返却される() {
    int n = 0;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で1の階乗の値が返却される() {
    int n = 1;

    Long expected = 1L;
    Long actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で2の階乗の値が返却される() {
    int n = 2;

    Long expected = 2L;
    Long actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で5の階乗の値が返却される() {
    int n = 5;

    Long expected = 120L;
    Long actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4でnがマイナス1のときnullが返却される() {
    int n = -1;

    Long expected = null;
    Long actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }
}
