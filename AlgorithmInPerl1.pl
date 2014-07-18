#
# 数値計算のアルゴリズム
# author: OHASHI Kent
#

use strict;
use warnings;

# 西暦年yearが閏年かどうかを判定する。
sub is_leap_year {
  my ($year) = @_;

  # TODO: ロジックを実装
  return 0;
}

# 整数nが素数かどうかを判定する。
# ループ版
sub is_prime {
  my ($n) = @_;

  # TODO: ロジックを実装
  return 0;
}

# 組み込み関数版
sub is_prime_2 {
  my ($n) = @_;

  # TODO: ロジックを実装
  return 0;
}

# ユークリッドの互除法により整数a, bの最大公約数を算出する。
# a, bが1未満の場合、undefを返却する。
# 除算版
sub gcd {
  my ($a, $b) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 減算版
sub gcd_2 {
  my ($a, $b) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 整数a, bの最小公倍数を算出する。
# a, bが1未満の場合、undefを返却する。
sub lcm {
  my ($a, $b) = @_;

  # TODO: ロジックを実装
  return undef;
}

# フィボナッチ数列の第i項の値を算出する。
# iが1未満の場合、undefを返却する。
# ループ版
sub fibonacci {
  my ($i) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 再帰版
sub fibonacci_2 {
  my ($i) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 末尾再帰版
sub fibonacci_3 {
  my ($i) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 再帰 (メモ化)版
sub fibonacci_4 {
  my ($i) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 整数nの階乗n!の値を算出する。
# nが負の数の場合、undefを返却する。
# ループ版
sub factorial {
  my ($n) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 再帰版
sub factorial_2 {
  my ($n) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 末尾再帰版
sub factorial_3 {
  my ($n) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 畳み込み版
sub factorial_4 {
  my ($n) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 畳み込み版2
sub factorial_5 {
  my ($n) = @_;

  # TODO: ロジックを実装
  return undef;
}
