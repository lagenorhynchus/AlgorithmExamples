/*
 * 数値計算のアルゴリズムのテスト
 */

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
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

    Optional<Integer> expected = Optional.of(4);
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdで2と3の最大公約数が返却される() {
    int a = 2;
    int b = 3;

    Optional<Integer> expected = Optional.of(1);
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdで6と6の最大公約数が返却される() {
    int a = 6;
    int b = 6;

    Optional<Integer> expected = Optional.of(6);
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaが0のときemptyが返却される() {
    int a = 0;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでbが0のときemptyが返却される() {
    int a = 2;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaとbが0のときemptyが返却される() {
    int a = 0;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでbがマイナス1のときemptyが返却される() {
    int a = 2;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcdでaとbがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で8と12の最大公約数が返却される() {
    int a = 8;
    int b = 12;

    Optional<Integer> expected = Optional.of(4);
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で2と3の最大公約数が返却される() {
    int a = 2;
    int b = 3;

    Optional<Integer> expected = Optional.of(1);
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2で6と6の最大公約数が返却される() {
    int a = 6;
    int b = 6;

    Optional<Integer> expected = Optional.of(6);
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaが0のときemptyが返却される() {
    int a = 0;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でbが0のときemptyが返却される() {
    int a = 2;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaとbが0のときemptyが返却される() {
    int a = 0;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でbがマイナス1のときemptyが返却される() {
    int a = 2;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void gcd2でaとbがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.gcd2(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで8と12の最小公倍数が返却される() {
    int a = 8;
    int b = 12;

    Optional<Integer> expected = Optional.of(24);
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで2と3の最小公倍数が返却される() {
    int a = 2;
    int b = 3;

    Optional<Integer> expected = Optional.of(6);
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmで6と6の最小公倍数が返却される() {
    int a = 6;
    int b = 6;

    Optional<Integer> expected = Optional.of(6);
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaが0のときemptyが返却される() {
    int a = 0;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでbが0のときemptyが返却される() {
    int a = 2;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaとbが0のときemptyが返却される() {
    int a = 0;
    int b = 0;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = 2;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでbがマイナス1のときemptyが返却される() {
    int a = 2;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void lcmでaとbがマイナス1のときemptyが返却される() {
    int a = -1;
    int b = -1;

    Optional<Integer> expected = Optional.empty();
    Optional<Integer> actual = AlgorithmInJava1.lcm(a, b);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第1項の値が返却される() {
    int i = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第2項の値が返却される() {
    int i = 2;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第3項の値が返却される() {
    int i = 3;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciで第6項の値が返却される() {
    int i = 6;

    Optional<Long> expected = Optional.of(8L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciでiが0のときemptyが返却される() {
    int i = 0;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacciでiがマイナス1のときemptyが返却される() {
    int i = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第1項の値が返却される() {
    int i = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第2項の値が返却される() {
    int i = 2;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第3項の値が返却される() {
    int i = 3;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2で第6項の値が返却される() {
    int i = 6;

    Optional<Long> expected = Optional.of(8L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2でiが0のときemptyが返却される() {
    int i = 0;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci2でiがマイナス1のときemptyが返却される() {
    int i = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci2(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第1項の値が返却される() {
    int i = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第2項の値が返却される() {
    int i = 2;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第3項の値が返却される() {
    int i = 3;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3で第6項の値が返却される() {
    int i = 6;

    Optional<Long> expected = Optional.of(8L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3でiが0のときemptyが返却される() {
    int i = 0;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci3でiがマイナス1のときemptyが返却される() {
    int i = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci3(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第1項の値が返却される() {
    int i = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第2項の値が返却される() {
    int i = 2;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第3項の値が返却される() {
    int i = 3;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4で第6項の値が返却される() {
    int i = 6;

    Optional<Long> expected = Optional.of(8L);
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4でiが0のときemptyが返却される() {
    int i = 0;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void fibonacci4でiがマイナス1のときemptyが返却される() {
    int i = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.fibonacci4(i);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで0の階乗の値が返却される() {
    int n = 0;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで1の階乗の値が返却される() {
    int n = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで2の階乗の値が返却される() {
    int n = 2;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialで5の階乗の値が返却される() {
    int n = 5;

    Optional<Long> expected = Optional.of(120L);
    Optional<Long> actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorialでnがマイナス1のときemptyが返却される() {
    int n = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.factorial(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で0の階乗の値が返却される() {
    int n = 0;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で1の階乗の値が返却される() {
    int n = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で2の階乗の値が返却される() {
    int n = 2;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2で5の階乗の値が返却される() {
    int n = 5;

    Optional<Long> expected = Optional.of(120L);
    Optional<Long> actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial2でnがマイナス1のときemptyが返却される() {
    int n = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.factorial2(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で0の階乗の値が返却される() {
    int n = 0;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で1の階乗の値が返却される() {
    int n = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で2の階乗の値が返却される() {
    int n = 2;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3で5の階乗の値が返却される() {
    int n = 5;

    Optional<Long> expected = Optional.of(120L);
    Optional<Long> actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial3でnがマイナス1のときemptyが返却される() {
    int n = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.factorial3(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で0の階乗の値が返却される() {
    int n = 0;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で1の階乗の値が返却される() {
    int n = 1;

    Optional<Long> expected = Optional.of(1L);
    Optional<Long> actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で2の階乗の値が返却される() {
    int n = 2;

    Optional<Long> expected = Optional.of(2L);
    Optional<Long> actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4で5の階乗の値が返却される() {
    int n = 5;

    Optional<Long> expected = Optional.of(120L);
    Optional<Long> actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }

  @Test
  public void factorial4でnがマイナス1のときemptyが返却される() {
    int n = -1;

    Optional<Long> expected = Optional.empty();
    Optional<Long> actual = AlgorithmInJava1.factorial4(n);
    assertThat(actual, is(expected));
  }
}
