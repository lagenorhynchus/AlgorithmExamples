/*
 * 数値計算のアルゴリズム
 */

import scala.annotation.tailrec

object AlgorithmInScala1 {
  /*
   * 西暦年yearが閏年かどうかを判定する。
   */
  def isLeapYear(year: Int): Boolean =
    if (year % 4 == 0 && year % 100 != 0) true
    else if (year % 400 == 0) true
    else false

  /*
   * 整数nが素数かどうかを判定する。
   */
  def isPrime(n: Int): Boolean =
    if (n < 2) false
    else {
      val stopPoint = Math.sqrt(n).toInt
      (2 to stopPoint).forall(n % _ != 0)
    }

  /*
   * ユークリッドの互除法により整数a, bの最大公約数を算出する。
   * a, bが1未満の場合、Noneを返却する。
   * 除算版
   */
  def gcd(a: Int, b: Int): Option[Int] = {
    @tailrec
    def divide(x: Int, y: Int): Int =
      if (y == 0) x
      else divide(y, x % y)

    if (a < 1 || b < 1) None
    else Some(divide(a, b))
  }

  /*
   * 減算版
   */
  def gcd2(a: Int, b: Int): Option[Int] = {
    @tailrec
    def subtract(x: Int, y: Int): Int =
      if (x > y) subtract(x - y, y)
      else if (x < y) subtract(x, y - x)
      else x

    if (a < 1 || b < 1) None
    else Some(subtract(a, b))
  }

  /*
   * 整数a, bの最小公倍数を算出する。
   * a, bが1未満の場合、Noneを返却する。
   */
  def lcm(a: Int, b: Int): Option[Int] =
    if (a < 1 || b < 1) None
    else gcd(a, b).map(a * b / _)

  /*
   * フィボナッチ数列の第i項の値を算出する。
   * iが1未満の場合、Noneを返却する。
   * 再帰版
   */
  def fibonacci(i: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 末尾再帰版
   */
  def fibonacci2(i: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * ループ版
   */
  def fibonacci3(i: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 再帰(メモ化)版
   */
  def fibonacci4(i: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 整数nの階乗n!の値を算出する。
   * nが負の数の場合、Noneを返却する。
   * 再帰版
   */
  def factorial(n: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 末尾再帰版
   */
  def factorial2(n: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * ループ版
   */
  def factorial3(n: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 畳み込み版
   */
  def factorial4(n: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 畳み込み版2
   */
  def factorial5(n: Int): Option[Long] = {
    // TODO: ロジックを実装
    None
  }
}
