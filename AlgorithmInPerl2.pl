#
# リストの探索とソートのアルゴリズム
# author: OHASHI Kent
#

use strict;
use warnings;

# 逐次探索アルゴリズムによりリストlist_refの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、undefを返却する。
sub sequential_search {
  my ($list_ref, $target) = @_;

  # TODO: ロジックを実装
  return undef;
}

# 二分探索アルゴリズムによりソート済みリストlist_refの指定した要素targetの位置を取得する。
# リスト内に該当する要素がない場合、undefを返却する。
sub binary_search {
  my ($list_ref, $target) = @_;

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
  my ($list_ref, $left, $right) = @_;

  # TODO: ロジックを実装
}

sub swap {
  my ($list_ref, $x, $y) = @_;

  ($list_ref->[$x], $list_ref->[$y]) = ($list_ref->[$y], $list_ref->[$x]);
}
