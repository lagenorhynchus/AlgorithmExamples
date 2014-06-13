# coding: utf-8

# リストの探索とソートのアルゴリズム
# author: OHASHI Kent


# 逐次探索アルゴリズムによりリストlstの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、Noneを返却する。
def sequential_search(lst, target):
    for i, e in enumerate(lst):
        if e == target:
            return i

    return None


# 二分探索アルゴリズムによりソート済みリストlstの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、Noneを返却する。
def binary_search(lst, target):
    low = 0
    high = len(lst) - 1
    while low <= high:
        middle = (low + high) // 2
        if lst[middle] > target:
            high = middle - 1
        elif lst[middle] < target:
            low = middle + 1
        else:
            return middle

    return None


# バブルソートアルゴリズムによりリストlstを昇順にソートする。
def bubble_sort(lst):
    # TODO: ロジックを実装
    pass


# セレクションソートアルゴリズムによりリストlstを昇順にソートする。
def selection_sort(lst):
    # TODO: ロジックを実装
    pass


# クイックソートアルゴリズムによりリストlstを昇順にソートする。
def quick_sort(lst):
    # TODO: ロジックを実装
    pass


def q_sort(lst, left, right):
    # TODO: ロジックを実装
    pass


def swap(lst, x, y):
    lst[x], lst[y] = lst[y], lst[x]
