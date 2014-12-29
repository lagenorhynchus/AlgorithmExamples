#
# リストの探索とソートのアルゴリズム
#

module AlgorithmInRuby2
  module_function

  # 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
  # リスト内に該当する要素がない場合、nilを返却する。
  def sequential_search(list, target)
    list.each_with_index do |e, i|
      if e == target
        return i
      end
    end

    nil
  end

  # 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
  # リスト内に該当する要素がない場合、nilを返却する。
  def binary_search(list, target)
    low = 0
    high = list.length - 1
    while low <= high
      middle = (low + high) / 2
      if list[middle] > target
        high = middle - 1
      elsif list[middle] < target
        low = middle + 1
      else
        return middle
      end
    end

    nil
  end

  # バブルソートアルゴリズムによりリストlistを昇順にソートする。
  def bubble_sort(list)
    list = list.dup
    (0..list.length - 1).each do |i|
      (0..list.length - i - 2).each do |j|
        if list[j] > list[j + 1]
          swap(list, j, j + 1)
        end
      end
    end

    list
  end

  # セレクションソートアルゴリズムによりリストlistを昇順にソートする。
  def selection_sort(list)
    list = list.dup
    (0..list.length - 2).each do |first|
      min = first
      (first + 1..list.length - 1).each do |i|
        if list[i] < list[min]
          min = i
        end
      end
      swap(list, first, min)
    end

    list
  end

  # クイックソートアルゴリズムによりリストlistを昇順にソートする。
  def quick_sort(list)
    list = list.dup
    q_sort(list, 0, list.length - 1)
  end

  def q_sort(list, left, right)
    if right - left < 1
      return list
    end

    pivot = (left + right) / 2
    swap(list, left, pivot)
    last = left
    (left + 1..right).each do |i|
      if list[i] < list[left]
        last += 1
        swap(list, i, last)
      end
    end
    swap(list, left, last)

    q_sort(list, left, last - 1)
    q_sort(list, last + 1, right)

    list
  end

  def swap(list, x, y)
    list[x], list[y] = list[y], list[x]
  end

  private_class_method :q_sort, :swap
end
