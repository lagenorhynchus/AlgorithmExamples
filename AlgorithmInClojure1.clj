;;;; 数値計算のアルゴリズム
;;;; author: OHASHI Kent

;;; 西暦年yearが閏年かどうかを判定する。
(defn leap-year? [year]
  ;; TODO: ロジックを実装
  false)

;;; 整数nが素数かどうかを判定する。
(defn prime? [n]
  ;; TODO: ロジックを実装
  false)

;;; ユークリッドの互除法により整数a, bの最大公約数を算出する。
;;; a, bが0以下の場合、nilを返却する。
;;; 除算版
(defn gcd [a b]
  ;; TODO: ロジックを実装
  nil)

;;; 減算版
(defn gcd-2 [a b]
  ;; TODO: ロジックを実装
  nil)

;;; 整数a, bの最小公倍数を算出する。
;;; a, bが0以下の場合、nilを返却する。
(defn lcm [a b]
  ;; TODO: ロジックを実装
  nil)

;;; フィボナッチ数列の第i項の値を算出する。
;;; iが0以下の場合、nilを返却する。
;;; 再帰版
(defn fibonacci [i]
  ;; TODO: ロジックを実装
  nil)

;;; 末尾再帰版
(defn fibonacci-2 [i]
  ;; TODO: ロジックを実装
  nil)

;;; ループ版
(defn fibonacci-3 [i]
  ;; TODO: ロジックを実装
  nil)

;;; 再帰(メモ化)版
(defn fibonacci-4 [i]
  ;; TODO: ロジックを実装
  nil)

;;; 整数nの階乗n!の値を算出する。
;;; nが負の数の場合、nilを返却する。
;;; 再帰版
(defn factorial [n]
  ;; TODO: ロジックを実装
  nil)

;;; 末尾再帰版
(defn factorial-2 [n]
  ;; TODO: ロジックを実装
  nil)

;;; ループ版
(defn factorial-3 [n]
  ;; TODO: ロジックを実装
  nil)

;;; 畳み込み版
(defn factorial-4 [n]
  ;; TODO: ロジックを実装
  nil)

;;; 畳み込み版2
(defn factorial-5 [n]
  ;; TODO: ロジックを実装
  nil)
