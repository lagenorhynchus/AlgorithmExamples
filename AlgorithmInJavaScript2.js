// リストの探索とソートのアルゴリズム
// author: OHASHI Kent

var AlgorithmInJavaScript2 = (function () {
  var swap = function (list, x, y) {
    var tmp = list[x];

    list[x] = list[y];
    list[y] = tmp;
  };

  return {
    // 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
    // リスト内に該当する要素がない場合、-1を返却する。
    sequentialSearch: function (list, target) {
      var i;
      var len = list.length;

      for (i = 0; i < len; i += 1) {
        if (list[i] === target) {
          return i;
        }
      }

      return -1;
    },

    // 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
    // リスト内に該当する要素がない場合、-1を返却する。
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

      return -1;
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
      // TODO: ロジックを実装
      return list;
    },

    // クイックソートアルゴリズムによりリストlistを昇順にソートする。
    quickSort: function (list) {
      // TODO: ロジックを実装
      return list;
    }
  };
}());
