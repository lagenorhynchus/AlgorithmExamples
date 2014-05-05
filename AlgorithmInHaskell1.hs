{-
数値計算のアルゴリズム
author: OHASHI Kent
-}

-- 西暦年yearが閏年かどうかを判定する。
isLeapYear :: Int -> Bool
isLeapYear year = False
-- TODO: ロジックを実装

-- 整数nが素数かどうかを判定する。
isPrime :: Int -> Bool
isPrime n = False
-- TODO: ロジックを実装

-- ユークリッドの互除法により整数a, bの最大公約数を算出する。
-- a, bが0以下の場合、Nothingを返却する。
-- 除算版
gcd' :: Int -> Int -> Maybe Int
gcd' a b = Nothing
-- TODO: ロジックを実装

-- 減算版
gcd2 :: Int -> Int -> Maybe Int
gcd2 a b = Nothing
-- TODO: ロジックを実装

-- 整数a, bの最小公倍数を算出する。
-- a, bが0以下の場合、Nothingを返却する。
lcm' :: Int -> Int -> Maybe Int
lcm' a b = Nothing
-- TODO: ロジックを実装

-- フィボナッチ数列の第i項の値を算出する。
-- iが0以下の場合、Nothingを返却する。
-- 再帰版
fibonacci :: Int -> Maybe Int
fibonacci i = Nothing
-- TODO: ロジックを実装

-- ループ版
fibonacci2 :: Int -> Maybe Int
fibonacci2 i = Nothing
-- TODO: ロジックを実装

-- 整数nの階乗n!の値を算出する。
-- nが負の数の場合、Nothingを返却する。
-- 再帰版
factorial :: Int -> Maybe Int
factorial n = Nothing
-- TODO: ロジックを実装

-- ループ版
factorial2 :: Int -> Maybe Int
factorial2 n = Nothing
-- TODO: ロジックを実装
