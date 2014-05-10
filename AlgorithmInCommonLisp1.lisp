;;;; 数値計算のアルゴリズム
;;;; author: OHASHI Kent

;;; 西暦年yearが閏年かどうかを判定する。
(defun is-leap-year (year)
  ;; TODO: ロジックを実装
  nil)

;;; 整数nが素数かどうかを判定する。
(defun is-prime (n)
  ;; TODO: ロジックを実装
  nil)

;;; ユークリッドの互除法により整数a, bの最大公約数を算出する。
;;; a, bが0以下の場合、nilを返却する。
;;; 除算版
(defun gcd (a b)
  ;; TODO: ロジックを実装
  nil)

;;; 減算版
(defun gcd-2 (a b)
  ;; TODO: ロジックを実装
  nil)

;;; 整数a, bの最小公倍数を算出する。
;;; a, bが0以下の場合、nilを返却する。
(defun lcm (a b)
  ;; TODO: ロジックを実装
  nil)

;;; フィボナッチ数列の第i項の値を算出する。
;;; iが0以下の場合、nilを返却する。
;;; 再帰版
(defun fibonacci (i)
  ;; TODO: ロジックを実装
  nil)

;;; ループ版
(defun fibonacci-2 (i)
  ;; TODO: ロジックを実装
  nil)

;;; 再帰(メモ化)版
(defun fibonacci-3 (i)
  ;; TODO: ロジックを実装
  nil)

;;; 整数nの階乗n!の値を算出する。
;;; nが負の数の場合、nilを返却する。
;;; 再帰版
(defun factorial (n)
  ;; TODO: ロジックを実装
  nil)

;;; ループ版
(defun factorial-2 (n)
  ;; TODO: ロジックを実装
  nil)

;;; 畳み込み版
(defun factorial-3 (n)
  ;; TODO: ロジックを実装
  nil)
