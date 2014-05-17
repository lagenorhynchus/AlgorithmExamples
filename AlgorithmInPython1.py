# coding: utf-8

# 数値計算のアルゴリズム
# author: OHASHI Kent

from functools import reduce
from math import sqrt
from operator import mul


# 西暦年yearが閏年かどうかを判定する。
def is_leap_year(year):
    if year % 4 == 0 and year % 100 != 0:
        return True
    elif year % 400 == 0:
        return True
    else:
        return False


# 整数nが素数かどうかを判定する。
def is_prime(n):
    if n < 2:
        return False

    stop_point = int(sqrt(n))
    for i in range(2, stop_point + 1):
        if n % i == 0:
            return False

    return True


# ユークリッドの互除法により整数a, bの最大公約数を算出する。
# a, bが0以下の場合、Noneを返却する。
# 除算版
def gcd(a, b):
    if a < 1 or b < 1:
        return None

    while b > 0:
        r = a % b
        a, b = b, r
    return a


# 減算版
def gcd_2(a, b):
    if a < 1 or b < 1:
        return None

    while True:
        if a > b:
            a -= b
        elif a < b:
            b -= a
        else:
            return a


# 整数a, bの最小公倍数を算出する。
# a, bが0以下の場合、Noneを返却する。
def lcm(a, b):
    if a < 1 or b < 1:
        return None

    return a * b // gcd(a, b)


# フィボナッチ数列の第i項の値を算出する。
# iが0以下の場合、Noneを返却する。
# ループ版
def fibonacci(i):
    if i < 1:
        return None

    previous = 1
    current = 0
    for n in range(i):
        previous, current = current, (previous + current)
    return current


# 再帰版
def fibonacci_2(i):
    if i < 1:
        return None
    elif i in [1, 2]:
        return 1

    return fibonacci_2(i - 2) + fibonacci_2(i - 1)


# 末尾再帰版
def fibonacci_3(i):
    if i < 1:
        return None

    def fib(x, previous, current):
        if x == 1:
            return previous + current

        return fib(x - 1, current, previous + current)
    return fib(i, 1, 0)


# 再帰(メモ化)版
def fibonacci_4(i):
    if i < 1:
        return None

    def fib(x, fib_dict={}):
        if x in [1, 2]:
            return 1
        elif x not in fib_dict:
            fib_dict[x] = fib(x - 2) + fib(x - 1)

        return fib_dict[x]
    return fib(i)


# 整数nの階乗n!の値を算出する。
# nが負の数の場合、Noneを返却する。
# ループ版
def factorial(n):
    if n < 0:
        return None

    product = 1
    for i in range(2, n + 1):
        product *= i
    return product


# 再帰版
def factorial_2(n):
    if n < 0:
        return None
    elif n in [0, 1]:
        return 1

    return n * factorial_2(n - 1)


# 末尾再帰版
def factorial_3(n):
    if n < 0:
        return None

    def fact(x, product):
        if x in [0, 1]:
            return product

        return fact(x - 1, x * product)
    return fact(n, 1)


# 畳み込み版
def factorial_4(n):
    if n < 0:
        return None

    return reduce(lambda product, i: product * i, range(2, n + 1), 1)


# 畳み込み版2
def factorial_5(n):
    if n < 0:
        return None

    return reduce(mul, range(2, n + 1), 1)
