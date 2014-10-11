/*
 * リストの探索とソートのアルゴリズム
 */

object AlgorithmInScala2 {
  /*
   * 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、Noneを返却する。
   */
  def sequentialSearch[A](list: List[A], target: A): Option[Int] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、Noneを返却する。
   */
  def binarySearch[A <% Ordered[A]](list: List[A], target: A): Option[Int] = {
    // TODO: ロジックを実装
    None
  }

  /*
   * バブルソートアルゴリズムによりリストlistを昇順にソートする。
   */
  def bubbleSort[A <% Ordered[A]](list: List[A]): List[A] = {
    // TODO: ロジックを実装
    list
  }

  /*
   * セレクションソートアルゴリズムによりリストlistを昇順にソートする。
   */
  def selectionSort[A <% Ordered[A]](list: List[A]): List[A] = {
    // TODO: ロジックを実装
    list
  }

  /*
   * クイックソートアルゴリズムによりリストlistを昇順にソートする。
   */
  def quickSort[A <% Ordered[A]](list: List[A]): List[A] = {
    // TODO: ロジックを実装
    list
  }
}
