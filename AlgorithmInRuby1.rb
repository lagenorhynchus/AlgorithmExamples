#
# 数値計算のアルゴリズム
#

module AlgorithmInRuby1
  module_function

  # 西暦年yearが閏年かどうかを判定する。
  def leap_year?(year)
    if year % 4 == 0 && year % 100 != 0
      true
    elsif year % 400 == 0
      true
    else
      false
    end
  end

  # 整数nが素数かどうかを判定する。
  # ループ版
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

    true
  end

  # 高階関数版
  def prime_2?(n)
    if n < 2
      return false
    end

    stop_point = Math.sqrt(n).to_i
    (2..stop_point).all? { |i| n % i != 0 }
  end

  # ユークリッドの互除法により整数a, bの最大公約数を算出する。
  # a, bが1未満の場合、nilを返却する。
  # 除算版
  def gcd(a, b)
    if a < 1 || b < 1
      return nil
    end

    while b > 0
      a, b = b, (a % b)
    end
    a
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
  # a, bが1未満の場合、nilを返却する。
  def lcm(a, b)
    if a < 1 || b < 1
      return nil
    end

    a * b / gcd(a, b)
  end

  # フィボナッチ数列の第i項の値を算出する。
  # iが1未満の場合、nilを返却する。
  # ループ版
  def fibonacci(i)
    if i < 1
      return nil
    end

    previous = 1
    current = 0
    i.times do
      previous, current = current, (previous + current)
    end
    current
  end

  # 再帰版
  def fibonacci_2(i)
    if i < 1
      return nil
    elsif [1, 2].include?(i)
      return 1
    end

    fibonacci_2(i - 2) + fibonacci_2(i - 1)
  end

  # 末尾再帰版
  def fibonacci_3(i)
    if i < 1
      return nil
    end

    def fib(x, previous, current)
      if x == 1
        return previous + current
      end

      fib(x - 1, current, previous + current)
    end
    fib(i, 1, 0)
  end

  # 再帰(メモ化)版
  def fibonacci_4(i)
    if i < 1
      return nil
    end

    def fib(x, fib_hash = {})
      if [1, 2].include?(x)
        return 1
      elsif !fib_hash.key?(x)
        fib_hash[x] = fib(x - 2) + fib(x - 1)
      end

      fib_hash[x]
    end
    fib(i)
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
    product
  end

  # 再帰版
  def factorial_2(n)
    if n < 0
      return nil
    elsif [0, 1].include?(n)
      return 1
    end

    n * factorial_2(n - 1)
  end

  # 末尾再帰版
  def factorial_3(n)
    if n < 0
      return nil
    end

    def fact(x, product)
      if [0, 1].include?(x)
        return product
      end

      fact(x - 1, product * x)
    end
    fact(n, 1)
  end

  # 畳み込み版
  def factorial_4(n)
    if n < 0
      return nil
    end

    (2..n).inject(1) { |product, i| product * i }
  end

  # 畳み込み版2
  def factorial_5(n)
    if n < 0
      return nil
    end

    (2..n).inject(1, :*)
  end
end
