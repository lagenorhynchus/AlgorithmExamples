{-
リストの探索とソートのアルゴリズム
-}

module AlgorithmInHaskell2 where

-- 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
-- リスト内に該当する要素がない場合、Nothingを返却する。
sequentialSearch :: Eq a => [a] -> a -> Maybe Int
sequentialSearch list target = Nothing
-- TODO: ロジックを実装

-- 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
-- リスト内に該当する要素がない場合、Nothingを返却する。
binarySearch :: Ord a => [a] -> a -> Maybe Int
binarySearch list target = Nothing
-- TODO: ロジックを実装

-- バブルソートアルゴリズムによりリストlistを昇順にソートする。
bubbleSort :: Ord a => [a] -> [a]
bubbleSort list = list
-- TODO: ロジックを実装

-- セレクションソートアルゴリズムによりリストlistを昇順にソートする。
selectionSort :: Ord a => [a] -> [a]
selectionSort list = list
-- TODO: ロジックを実装

-- クイックソートアルゴリズムによりリストlistを昇順にソートする。
quickSort :: Ord a => [a] -> [a]
quickSort list = list
-- TODO: ロジックを実装
