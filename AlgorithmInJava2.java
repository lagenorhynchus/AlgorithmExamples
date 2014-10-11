/*
 * リストの探索とソートのアルゴリズム
 */

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AlgorithmInJava2 {
  /*
   * 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  public static <T> int sequentialSearch(List<T> list, T target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        return i;
      }
    }

    return -1;
  }

  /*
   * 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  public static <T extends Comparable<? super T>> int binarySearch(List<T> list, T target) {
    int low = 0;
    int high = list.size() - 1;
    while (low <= high) {
      int middle = (low + high) / 2;
      int c = list.get(middle).compareTo(target);
      if (c > 0) {
        high = middle - 1;
      } else if (c < 0) {
        low = middle + 1;
      } else {
        return middle;
      }
    }

    return -1;
  }

  /*
   * バブルソートアルゴリズムによりリストlistを昇順にソートする。
   */
  public static <T extends Comparable<? super T>> List<T> bubbleSort(List<T> list) {
    return bubbleSort(list, (a, b) -> a.compareTo(b));
  }

  public static <T> List<T> bubbleSort(List<T> list, Comparator<? super T> comp) {
    list = new ArrayList<>(list);

    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
          swap(list, j, j + 1);
        }
      }
    }

    return  list;
  }

  /*
   * セレクションソートアルゴリズムによりリストlistを昇順にソートする。
   */
  public static <T extends Comparable<? super T>> List<T> selectionSort(List<T> list) {
    return selectionSort(list, (a, b) -> a.compareTo(b));
  }

  public static <T> List<T> selectionSort(List<T> list, Comparator<? super T> comp) {
    list = new ArrayList<>(list);

    for (int first = 0; first < list.size() - 1; first++) {
      int min = first;
      for (int i = first + 1; i < list.size(); i++) {
        if (comp.compare(list.get(i), list.get(min)) < 0) {
          min = i;
        }
      }
      swap(list, first, min);
    }

    return list;
  }

  /*
   * クイックソートアルゴリズムによりリストlistを昇順にソートする。
   */
  public static <T extends Comparable<? super T>> List<T> quickSort(List<T> list) {
    return quickSort(list, (a, b) -> a.compareTo(b));
  }

  public static <T> List<T> quickSort(List<T> list, Comparator<? super T> comp) {
    list = new ArrayList<>(list);

    return  qSort(list, 0, list.size() - 1, comp);
  }

  private static <T> List<T> qSort(List<T> list, int left, int right, Comparator<? super T> comp) {
    if (right - left < 1) {
      return list;
    }

    int pivot = (left + right) / 2;
    swap(list, left, pivot);
    int last = left;
    for (int i = left + 1; i <= right; i++) {
      if (comp.compare(list.get(i), list.get(left)) < 0) {
        last++;
        swap(list, i, last);
      }
    }
    swap(list, left, last);

    qSort(list, left, last - 1, comp);
    qSort(list, last + 1, right, comp);

    return list;
  }
}
