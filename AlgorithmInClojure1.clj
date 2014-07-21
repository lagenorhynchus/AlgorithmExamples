;;;; 数値計算のアルゴリズム
;;;; author: OHASHI Kent

(ns AlgorithmInClojure1)

;;; 西暦年yearが閏年かどうかを判定する。
(defn leap-year? [year]
  (cond
    (and (= (rem year 4) 0)
         (not= (rem year 100) 0)) true
    (= (rem year 400) 0)          true
    :else                         false))

;;; 整数nが素数かどうかを判定する。
(defn prime? [n]
  (if (< n 2)
    false
    (let [stop-point (Math/floor (Math/sqrt n))]
      (every? (fn [x] (not= (rem n x) 0)) (range 2 (inc stop-point))))))

;;; ユークリッドの互除法により整数a, bの最大公約数を算出する。
;;; a, bが1未満の場合、nilを返却する。
;;; 除算版
(defn gcd [a b]
  (if (or (< a 1) (< b 1))
    nil
    (letfn [(divide [x y]
              (if (= y 0)
                x
                (recur y (rem x y))))]
      (divide a b))))

;;; 減算版
(defn gcd-2 [a b]
  (if (or (< a 1) (< b 1))
    nil
    (letfn [(subtract [x y]
              (cond
                (> x y) (recur (- x y) y)
                (< x y) (recur x (- y x))
                :else   x))]
      (subtract a b))))

;;; 整数a, bの最小公倍数を算出する。
;;; a, bが1未満の場合、nilを返却する。
(defn lcm [a b]
  (if (or (< a 1) (< b 1))
    nil
    (quot (* a b) (gcd a b))))

;;; フィボナッチ数列の第i項の値を算出する。
;;; iが1未満の場合、nilを返却する。
;;; 再帰版
(defn fibonacci [i]
  (if (< i 1)
    nil
    (letfn [(fib [x]
              (cond
                (= x 1) 1N
                (= x 2) 1N
                :else   (+ (fib (- x 2N)) (fib (- x 1N)))))]
      (fib i))))

;;; 末尾再帰版
(defn fibonacci-2 [i]
  (if (< i 1)
    nil
    (letfn [(fib [x prev curr]
              (if (= x 1)
                (+ prev curr)
                (recur (dec x) curr (+ prev curr))))]
      (fib i 1N 0N))))

;;; ループ版
(defn fibonacci-3 [i]
  (if (< i 1)
    nil
    (letfn [(fib [prev-curr]
              (let [prev (first prev-curr)
                    curr (second prev-curr)]
                [curr (+ prev curr)]))]
      (second (nth (iterate fib [1N 0N]) i)))))

;;; 再帰(メモ化)版
(defn fibonacci-4 [i]
  ;; TODO: ロジックを実装
  nil)

;;; 整数nの階乗n!の値を算出する。
;;; nが負の数の場合、nilを返却する。
;;; 再帰版
(defn factorial [n]
  (if (< n 0)
    nil
    (letfn [(fact [x]
              (cond
                (= x 0) 1N
                (= x 1) 1N
                :else   (* x (fact (dec x)))))]
      (fact n))))

;;; 末尾再帰版
(defn factorial-2 [n]
  (if (< n 0)
    nil
    (letfn [(fact [x prod]
              (cond
                (= x 0) prod
                (= x 1) prod
                :else   (recur (dec x) (* x prod))))]
      (fact n 1N))))

;;; ループ版
(defn factorial-3 [n]
  (if (< n 0)
    nil
    (letfn [(fact [x-prod]
              (let [x    (first x-prod)
                    prod (second x-prod)]
                [(inc x) (* x prod)]))]
      (second (nth (iterate fact [1N 1N]) n)))))

;;; 畳み込み版
(defn factorial-4 [n]
  (if (< n 0)
    nil
    (reduce * 1N (range 2N (inc n)))))

;;; 畳み込み版2
(defn factorial-5 [n]
  (if (< n 0)
    nil
    (apply * (range 2N (inc n)))))
