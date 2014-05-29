/*
 * 数値計算のアルゴリズム
 * author: OHASHI Kent
 */

public class AlgorithmInJava1 {
    /*
     * 西暦年yearが閏年かどうかを判定する。
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * 整数nが素数かどうかを判定する。
     */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        int stopPoint = (int) Math.sqrt(n);
        for (int i = 2; i <= stopPoint; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /*
     * ユークリッドの互除法により整数a, bの最大公約数を算出する。
     * a, bが1未満の場合、nullを返却する。
     * 除算版
     */
    public static Integer gcd(int a, int b) {
        if (a < 1 || b < 1) {
            return null;
        }

        while (b > 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    /*
     * 減算版
     */
    public static Integer gcd2(int a, int b) {
        if (a < 1 || b < 1) {
            return null;
        }

        while (true) {
            if (a > b) {
                a -= b;
            } else if (a < b) {
                b -= a;
            } else {
                return a;
            }
        }
    }

    /*
     * 整数a, bの最小公倍数を算出する。
     * a, bが1未満の場合、nullを返却する。
     */
    public static Integer lcm(int a, int b) {
        if (a < 1 || b < 1) {
            return null;
        }

        return a * b / gcd(a, b);
    }

    /*
     * フィボナッチ数列の第i項の値を算出する。
     * iが1未満の場合、nullを返却する。
     * ループ版
     */
    public static Long fibonacci(int i) {
        if (i < 1) {
            return null;
        }

        long previous = 1L;
        long current = 0L;
        for (int j = 0; j < i; j++) {
            long tmp = previous;
            previous = current;
            current = tmp + current;
        }
        return current;
    }

    /*
     * 再帰版
     */
    public static Long fibonacci2(int i) {
        if (i < 1) {
            return null;
        } else if (i == 1 || i == 2) {
            return 1L;
        }

        return fibonacci2(i - 2) + fibonacci2(i - 1);
    }

    /*
     * 末尾再帰版
     */
    public static Long fibonacci3(int i) {
        // TODO: ロジックを実装
        return null;
    }

    /*
     * 再帰(メモ化)版
     */
    public static Long fibonacci4(int i) {
        // TODO: ロジックを実装
        return null;
    }

    /*
     * 整数nの階乗n!の値を算出する。
     * nが負の数の場合、nullを返却する。
     * ループ版
     */
    public static Long factorial(int n) {
        if (n < 0) {
            return null;
        }

        long product = 1L;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    /*
     * 再帰版
     */
    public static Long factorial2(int n) {
        if (n < 0) {
            return null;
        } else if (n == 0 || n == 1) {
            return 1L;
        }

        return n * factorial2(n - 1);
    }

    /*
     * 末尾再帰版
     */
    public static Long factorial3(int n) {
        // TODO: ロジックを実装
        return null;
    }

    /*
     * 畳み込み版
     */
    public static Long factorial4(int n) {
        // TODO: ロジックを実装
        return null;
    }

    /*
     * 畳み込み版2
     */
    public static Long factorial5(int n) {
        // TODO: ロジックを実装
        return null;
    }
}
