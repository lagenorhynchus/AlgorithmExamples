/*
 * リストの探索とソートのアルゴリズムのテスト
 */

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AlgorithmInJava2Test {
  @Test
  public void sequentialSearchで先頭の要素の位置が返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);
    int target = 8;

    int expected = 0;
    int actual = AlgorithmInJava2.sequentialSearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void sequentialSearchで末尾の要素の位置が返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);
    int target = 3;

    int expected = 9;
    int actual = AlgorithmInJava2.sequentialSearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void sequentialSearchでtargetが存在する最小の要素より小さいときマイナス1が返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);
    int target = 0;

    int expected = -1;
    int actual = AlgorithmInJava2.sequentialSearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void sequentialSearchでtargetが存在する最大の要素より大きいときマイナス1が返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);
    int target = 11;

    int expected = -1;
    int actual = AlgorithmInJava2.sequentialSearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void sequentialSearchでlistが空のときマイナス1が返却される() {
    List<Integer> list = new ArrayList<>();
    int target = 1;

    int expected = -1;
    int actual = AlgorithmInJava2.sequentialSearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void binarySearchで先頭の要素の位置が返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int target = 1;

    int expected = 0;
    int actual = AlgorithmInJava2.binarySearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void binarySearchで末尾の要素の位置が返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int target = 10;

    int expected = 9;
    int actual = AlgorithmInJava2.binarySearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void binarySearchでtargetが存在する最小の要素より小さいときマイナス1が返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int target = 0;

    int expected = -1;
    int actual = AlgorithmInJava2.binarySearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void binarySearchでtargetが存在する最大の要素より大きいときマイナス1が返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int target = 11;

    int expected = -1;
    int actual = AlgorithmInJava2.binarySearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void binarySearchでlistが空のときマイナス1が返却される() {
    List<Integer> list = new ArrayList<>();
    int target = 1;

    int expected = -1;
    int actual = AlgorithmInJava2.binarySearch(list, target);
    assertThat(actual, is(expected));
  }

  @Test
  public void bubbleSortで未ソートのlistがソートされて返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.bubbleSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void bubbleSortでソート済みのlistがそのまま返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.bubbleSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void bubbleSortで空のlistがそのまま返却される() {
    List<Integer> list = new ArrayList<Integer>();

    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = AlgorithmInJava2.bubbleSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void selectionSortで未ソートのlistがソートされて返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.selectionSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void selectionSortでソート済みのlistがそのまま返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.selectionSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void selectionSortで空のlistがそのまま返却される() {
    List<Integer> list = new ArrayList<Integer>();

    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = AlgorithmInJava2.selectionSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void quickSortで未ソートのlistがソートされて返却される() {
    List<Integer> list = Arrays.asList(8, 2, 7, 5, 9, 4, 1, 10, 6, 3);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.quickSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void quickSortでソート済みのlistがそのまま返却される() {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> actual = AlgorithmInJava2.quickSort(list);
    assertThat(actual, is(expected));
  }

  @Test
  public void quickSortで空のlistがそのまま返却される() {
    List<Integer> list = new ArrayList<Integer>();

    List<Integer> expected = new ArrayList<Integer>();
    List<Integer> actual = AlgorithmInJava2.quickSort(list);
    assertThat(actual, is(expected));
  }
}
