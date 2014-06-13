// リストの探索とソートのアルゴリズム
// author: OHASHI Kent

// 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
// リスト内に該当する要素がない場合、-1を返却する。
var sequentialSearch = function (list, target) {
    var i = 0;
    var len = 0;

    for (i = 0, len = list.length; i < len; i += 1) {
        if (list[i] === target) {
            return i;
        }
    }

    return -1;
};

// 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
// リスト内に該当する要素がない場合、-1を返却する。
var binarySearch = function (list, target) {
    var low = 0;
    var high = list.length - 1;
    var middle = 0;

    while (low <= high) {
        middle = (low + high) / 2;
        if (list[middle] > target) {
            high = middle - 1;
        } else if (list[middle] < target) {
            low = middle + 1;
        } else {
            return middle;
        }
    }

    return -1;
};

// バブルソートアルゴリズムによりリストlistを昇順にソートする。
var bubbleSort = function (list) {
    // TODO: ロジックを実装
    return list;
};

// セレクションソートアルゴリズムによりリストlistを昇順にソートする。
var selectionSort = function (list) {
    // TODO: ロジックを実装
    return list;
};

// クイックソートアルゴリズムによりリストlistを昇順にソートする。
var quickSort = function (list) {
    // TODO: ロジックを実装
    return list;
};

var swap = function (list, x, y) {
    var tmp = list[x];

    list[x] = list[y];
    list[y] = tmp;
};
