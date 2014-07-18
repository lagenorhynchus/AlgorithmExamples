/*
 * リストの探索とソートのアルゴリズム
 * author: OHASHI Kent
 */

import static java.util.Collections.swap;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmInJava2 {
  /*
   * 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  public static int sequentialSearch(List<Integer> list, Integer target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == target) {
        return i;
      }
    }

    return -1;
  }

  /*
   * 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
   * リスト内に該当する要素がない場合、-1を返却する。
   */
  public static int binarySearch(List<Integer> list, Integer target) {
    int low = 0;
    int high = list.size() - 1;
    while (low <= high) {
      int middle = (low + high) / 2;
      if (list.get(middle) > target) {
        high = middle - 1;
      } else if (list.get(middle) < target) {
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
  public static List<Integer> bubbleSort(List<Integer> list) {
    list = new ArrayList<Integer>(list);
    for (int i = 0; i < list.size(); i++) {
      for (int j = 0; j < list.size() - i - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          swap(list, j, j + 1);
        }
      }
    }

    return  list;
  }

  /*
   * セレクションソートアルゴリズムによりリストlistを昇順にソートする。
   */
  public static List<Integer> selectionSort(List<Integer> list) {
    list = new ArrayList<Integer>(list);
    for (int first = 0; first < list.size() - 1; first++) {
      int min = first;
      for (int i = first + 1; i < list.size(); i++) {
        if (list.get(i) < list.get(min)) {
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
  public static List<Integer> quickSort(List<Integer> list) {
    // TODO: ロジックを実装
    return list;
  }
}
