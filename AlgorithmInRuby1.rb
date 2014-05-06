# coding: utf-8

#
# 数値計算のアルゴリズム
# author: OHASHI Kent
#

# 西暦年yearが閏年かどうかを判定する。
def leap_year?(year)
  if year % 4 == 0 && year % 100 != 0
    return true
  elsif year % 400 == 0
    return true
  else
    return false
  end
end

# 整数nが素数かどうかを判定する。
def prime?(n)
  if n < 2
    return false
  end

  stop_point = Math.sqrt(n).to_i
  (2..stop_point).each do |i|
    if n % i == 0
      return false
    end
  end

  return true
end

# ユークリッドの互除法により整数a, bの最大公約数を算出する。
# a, bが0以下の場合、nilを返却する。
# 除算版
def gcd(a, b)
  if a < 1 || b < 1
    return nil
  end

  while b > 0
    r = a % b
    a = b
    b = r
  end
  return a
end

# 減算版
def gcd_2(a, b)
  if a < 1 || b < 1
    return nil
  end

  loop do
    if a > b
      a -= b
    elsif a < b
      b -= a
    else
      return a
    end
  end
end

# 整数a, bの最小公倍数を算出する。
# a, bが0以下の場合、nilを返却する。
def lcm(a, b)
  if a < 1 || b < 1
    return nil
  end

  return a * b / gcd(a, b)
end

# フィボナッチ数列の第i項の値を算出する。
# iが0以下の場合、nilを返却する。
# ループ版
def fibonacci(i)
  if i < 1
    return nil
  end

  current = 0
  previous = 1
  i.times do
    previous, current = current, (previous + current)
  end
  return current
end

# 再帰版
def fibonacci_2(i)
  if i < 1
    return nil
  elsif i == 1 || i == 2
    return 1
  end

  return fibonacci_2(i-2) + fibonacci_2(i-1)
end

# 整数nの階乗n!の値を算出する。
# nが負の数の場合、nilを返却する。
# ループ版
def factorial(n)
  if n < 0
    return nil
  end

  product = 1
  (2..n).each do |i|
    product *= i
  end
  return product
end

# 再帰版
def factorial_2(n)
  if n < 0
    return nil
  elsif n == 0 || n == 1
    return 1
  end

  return n * factorial_2(n-1)
end

# 畳み込み版
def factorial_3(n)
  if n < 0
    return nil
  end

  return (2..n).inject(1) {|product, i| product * i}
end
