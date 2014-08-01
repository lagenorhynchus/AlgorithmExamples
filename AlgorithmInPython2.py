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
    lst = lst[:]
    for i in range(0, len(lst)):
        for j in range(0, len(lst) - i - 1):
            if lst[j] > lst[j + 1]:
                swap(lst, j, j + 1)

    return lst


# セレクションソートアルゴリズムによりリストlstを昇順にソートする。
def selection_sort(lst):
    lst = lst[:]
    for first in range(0, len(lst) - 1):
        m = first
        for i in range(first + 1, len(lst)):
            if lst[i] < lst[m]:
                m = i
        swap(lst, first, m)

    return lst


# クイックソートアルゴリズムによりリストlstを昇順にソートする。
def quick_sort(lst):
    lst = lst[:]
    return q_sort(lst, 0, len(lst) - 1)


def q_sort(lst, left, right):
    if right - left < 1:
        return lst

    pivot = (left + right) // 2
    swap(lst, left, pivot)
    last = left
    for i in range(left + 1, right + 1):
        if lst[i] < lst[left]:
            last += 1
            swap(lst, i, last)
    swap(lst, left, last)

    q_sort(lst, left, last - 1)
    q_sort(lst, last + 1, right)

    return lst


def swap(lst, x, y):
    lst[x], lst[y] = lst[y], lst[x]
