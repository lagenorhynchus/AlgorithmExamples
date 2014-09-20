/*
 * リストの探索とソートのアルゴリズム
 * author: OHASHI Kent
 */

class AlgorithmInGroovy2 {
  /*
   * 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  static <T> int sequentialSearch(List<T> list, T target) {
    // TODO: ロジックを実装
    return -1;
  }

  /*
   * 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  static <T extends Comparable<? super T>> int binarySearch(List<T> list, T target) {
    // TODO: ロジックを実装
    return -1;
  }

  /*
   * バブルソートアルゴリズムによりリストlistを昇順にソートする。
   */
  static <T extends Comparable<? super T>> List<T> bubbleSort(List<T> list) {
    return bubbleSort(list, {a, b -> a.compareTo(b)});
  }

  static <T> List<T> bubbleSort(List<T> list, Comparator<? super T> comp) {
    // TODO: ロジックを実装
    return list;
  }

  /*
   * セレクションソートアルゴリズムによりリストlistを昇順にソートする。
   */
  static <T extends Comparable<? super T>> List<T> selectionSort(List<T> list) {
    return selectionSort(list, {a, b -> a.compareTo(b)});
  }

  static <T> List<T> selectionSort(List<T> list, Comparator<? super T> comp) {
    // TODO: ロジックを実装
    return list;
  }

  /*
   * クイックソートアルゴリズムによりリストlistを昇順にソートする。
   */
  static <T extends Comparable<? super T>> List<T> quickSort(List<T> list) {
    return quickSort(list, {a, b -> a.compareTo(b)});
  }

  static <T> List<T> quickSort(List<T> list, Comparator<? super T> comp) {
    // TODO: ロジックを実装
    return list;
  }
}
