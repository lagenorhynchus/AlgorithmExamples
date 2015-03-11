// リストの探索とソートのアルゴリズム

(function () {
  "use strict";

  var swap = function (list, x, y) {
    var tmp = list[x];

    list[x] = list[y];
    list[y] = tmp;
  };

  var qSort = function qSort (list, left, right) {
    var pivot = Math.floor((left + right) / 2);
    var last = left;
    var i;

    if (right - left < 1) {
      return list;
    }

    swap(list, left, pivot);
    for (i = left + 1; i <= right; i += 1) {
      if (list[i] < list[left]) {
        last += 1;
        swap(list, i, last);
      }
    }
    swap(list, left, last);

    qSort(list, left, last - 1);
    qSort(list, last + 1, right);

    return list;
  };

  var AlgorithmInJavaScript2 = {
    // 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
    // リスト内に該当する要素がない場合、nullを返却する。
    sequentialSearch: function (list, target) {
      var i;
      var len = list.length;

      for (i = 0; i < len; i += 1) {
        if (list[i] === target) {
          return i;
        }
      }

      return null;
    },

    // 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
    // リスト内に該当する要素がない場合、nullを返却する。
    binarySearch: function (list, target) {
      var low = 0;
      var high = list.length - 1;
      var middle;

      while (low <= high) {
        middle = Math.floor((low + high) / 2);
        if (list[middle] > target) {
          high = middle - 1;
        } else if (list[middle] < target) {
          low = middle + 1;
        } else {
          return middle;
        }
      }

      return null;
    },

    // バブルソートアルゴリズムによりリストlistを昇順にソートする。
    bubbleSort: function (list) {
      var i;
      var j;
      var len = list.length;

      list = list.concat();
      for (i = 0; i < len; i++) {
        for (j = 0; j < len - i - 1; j++) {
          if (list[j] > list[j + 1]) {
            swap(list, j, j + 1);
          }
        }
      }
      return list;
    },

    // セレクションソートアルゴリズムによりリストlistを昇順にソートする。
    selectionSort: function (list) {
      var first;
      var min;
      var i;
      var len = list.length;

      list = list.concat();
      for (first = 0; first < len - 1; first += 1) {
        min = first;
        for (i = first + 1; i < len; i += 1) {
          if (list[i] < list[min]) {
            min = i;
          }
        }
        swap(list, first, min);
      }
      return list;
    },

    // クイックソートアルゴリズムによりリストlistを昇順にソートする。
    quickSort: function (list) {
      list = list.concat();
      return  qSort(list, 0, list.length - 1);
    }
  };
  if (typeof module !== "undefined" && module.exports) {
    module.exports = AlgorithmInJavaScript2;
  } else {
    this.AlgorithmInJavaScript2 = AlgorithmInJavaScript2;
  }
}).call(this);
