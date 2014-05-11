{-
リストの探索とソートのアルゴリズム
author: OHASHI Kent
-}

module AlgorithmInHaskell2 where

-- 逐次探索アルゴリズムによりリストlistの指定した要素targetの位置を取得する。
-- リスト内に該当する要素がない場合、Nothingを返却する。
sequentialSearch :: [Int] -> Int -> Maybe Int
sequentialSearch list target = Nothing
-- TODO: ロジックを実装

-- 二分探索アルゴリズムによりソート済みリストlistの指定した要素targetの位置を取得する。
-- リスト内に該当する要素がない場合、Nothingを返却する。
binarySearch :: [Int] -> Int -> Maybe Int
binarySearch list target = Nothing
-- TODO: ロジックを実装

-- バブルソートアルゴリズムによりリストlistを昇順にソートする。
bubbleSort :: [Int] -> [Int]
bubbleSort list = list
-- TODO: ロジックを実装

-- セレクションソートアルゴリズムによりリストlistを昇順にソートする。
selectionSort :: [Int] -> [Int]
selectionSort list = list
-- TODO: ロジックを実装

-- クイックソートアルゴリズムによりリストlistを昇順にソートする。
quickSort :: [Int] -> [Int]
quickSort list = list
-- TODO: ロジックを実装
