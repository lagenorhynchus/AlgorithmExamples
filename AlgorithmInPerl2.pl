#
# リストの探索とソートのアルゴリズム
# author: OHASHI Kent
#

use strict;
use warnings;

# 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、undefを返却する。
sub sequential_search {
  my ($list, $target) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、undefを返却する。
sub binary_search {
  my ($list, $target) = @_;

  # TODO: ロジックを実装
  return undef;
}

# バブルソートアルゴリズムによりリストlistを昇順にソートする。
sub bubble_sort {
  my (@list) = @_;

  # TODO: ロジックを実装
  return @list;
}

# セレクションソートアルゴリズムによりリストlistを昇順にソートする。
sub selection_sort {
  my (@list) = @_;

  # TODO: ロジックを実装
  return @list;
}

# クイックソートアルゴリズムによりリストlistを昇順にソートする。
sub quick_sort {
  my (@list) = @_;

  # TODO: ロジックを実装
  return @list;
}

sub q_sort {
  my ($list, $left, $right) = @_;

  # TODO: ロジックを実装
}

sub swap {
  my ($list, $x, $y) = @_;

  ($list->[$x], $list->[$y]) = ($list->[$y], $list->[$x]);
}
