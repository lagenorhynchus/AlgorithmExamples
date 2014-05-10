{-
数値計算のアルゴリズム
author: OHASHI Kent
-}

-- 西暦年yearが閏年かどうかを判定する。
isLeapYear :: Int -> Bool
isLeapYear year
    | year `mod` 4 == 0 && year `mod` 100 /= 0 = True
    | year `mod` 400 == 0                      = True
    | otherwise                                = False

-- 整数nが素数かどうかを判定する。
isPrime :: Int -> Bool
isPrime n
    | n < 2     = False
    | otherwise = all (\x -> n `mod` x /= 0) [2..stopPoint]
        where stopPoint = floor . sqrt $ fromIntegral n

-- ユークリッドの互除法により整数a, bの最大公約数を算出する。
-- a, bが0以下の場合、Nothingを返却する。
-- 除算版
gcd' :: Int -> Int -> Maybe Int
gcd' a b
    | a < 1 || b < 1 = Nothing
    | otherwise      = divide a b
        where divide x y
                  | y <= 0    = Just x
                  | otherwise = divide y (x `mod` y)

-- 減算版
gcd2 :: Int -> Int -> Maybe Int
gcd2 a b
    | a < 1 || b < 1 = Nothing
    | otherwise      = sub a b
        where sub x y
                  | x > y     = sub (x - y) y
                  | x < y     = sub x (y - x)
                  | otherwise = Just x

-- 整数a, bの最小公倍数を算出する。
-- a, bが0以下の場合、Nothingを返却する。
lcm' :: Int -> Int -> Maybe Int
lcm' a b
    | a < 1 || b < 1 = Nothing
    | otherwise      = fmap (div $ a * b) (gcd' a b)

-- フィボナッチ数列の第i項の値を算出する。
-- iが0以下の場合、Nothingを返却する。
-- 再帰版
fibonacci :: Int -> Maybe Integer
fibonacci i
    | i < 1     = Nothing
    | otherwise = Just $ fib i
        where fib 1 = 1
              fib 2 = 1
              fib x = fib (x-2) + fib (x-1)

-- ループ版
fibonacci2 :: Int -> Maybe Integer
fibonacci2 i = Nothing
-- TODO: ロジックを実装

-- 再帰(メモ化)版
fibonacci3 :: Int -> Maybe Integer
fibonacci3 i
    | i < 1     = Nothing
    | otherwise = Just $ map fib [0..] !! i
        where fib 1 = 1
              fib 2 = 1
              fib x = fib (x-2) + fib (x-1)

-- 整数nの階乗n!の値を算出する。
-- nが負の数の場合、Nothingを返却する。
-- 再帰版
factorial :: Integer -> Maybe Integer
factorial n
    | n < 0     = Nothing
    | otherwise = Just $ fact n
        where fact 0 = 1
              fact 1 = 1
              fact x = x * fact (x-1)

-- ループ版
factorial2 :: Integer -> Maybe Integer
factorial2 n = Nothing
-- TODO: ロジックを実装

-- 畳み込み版
factorial3 :: Integer -> Maybe Integer
factorial3 n
    | n < 0     = Nothing
    | otherwise = Just $ foldl (*) 1 [2..n]
