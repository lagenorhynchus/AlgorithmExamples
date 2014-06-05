// 数値計算のアルゴリズム
// author: OHASHI Kent

// 西暦年yearが閏年かどうかを判定する。
var isLeapYear = function (year) {
    if (year % 4 === 0 && year % 100 !== 0) {
        return true;
    } else if (year % 400 === 0) {
        return true;
    } else {
        return false;
    }
};

// 整数nが素数かどうかを判定する。
// 標準機能版
var isPrime = function (n) {
    var stopPoint = 0;
    var i = 0;

    if (n < 2) {
        return false;
    }

    stopPoint = Math.floor(Math.sqrt(n));
    for (i = 2; i <= stopPoint; i += 1) {
        if (n % i === 0) {
            return false;
        }
    }

    return true;
};

// Underscore.js版
var isPrime2 = function (n) {
    var stopPoint = 0;

    if (n < 2) {
        return false;
    }

    stopPoint = Math.floor(Math.sqrt(n));
    return _.every(_.range(2, stopPoint + 1), function (i) {
        return n % i !== 0;
    });
};

// ユークリッドの互除法により整数a, bの最大公約数を算出する。
// a, bが1未満の場合、nullを返却する。
// 除算版
var gcd = function (a, b) {
    var r = 0;

    if (a < 1 || b < 1) {
        return null;
    }

    while (b > 0) {
        r = a % b;
        a = b;
        b = r;
    }
    return a;
};

// 減算版
var gcd2 = function (a, b) {
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
};

// 整数a, bの最小公倍数を算出する。
// a, bが1未満の場合、nullを返却する。
var lcm = function (a, b) {
    if (a < 1 || b < 1) {
        return null;
    }

    return a * b / gcd(a, b);
};

// フィボナッチ数列の第i項の値を算出する。
// iが1未満の場合、nullを返却する。
// ループ版
var fibonacci = function (i) {
    var previous = 1;
    var current = 0;
    var j = 0;
    var tmp = 0;

    if (i < 1) {
        return null;
    }

    for (j = 0; j < i; j += 1) {
        tmp = previous;
        previous = current;
        current = tmp + current;
    }
    return current;
};

// 再帰版
var fibonacci2 = function (i) {
    if (i < 1) {
        return null;
    } else if (i === 1 || i === 2) {
        return 1;
    }

    return fibonacci2(i - 2) + fibonacci2(i - 1);
};

// 末尾再帰版
var fibonacci3 = function (i) {
    var fib = function (x, previous, current) {
        if (x === 1) {
            return previous + current;
        }

        return fib(x - 1, current, previous + current);
    };

    if (i < 1) {
        return null;
    }

    return fib(i, 1, 0);
};

// 再帰(メモ化)版
var fibonacci4 = function (i) {
    var fibList = [];
    var fib = function (x) {
        if (x === 1 || x === 2) {
            return 1;
        } else if (typeof fibList[x] !== "number") {
            fibList[x] = fib(x - 2) + fib(x - 1);
        }

        return fibList[x];
    };

    if (i < 1) {
        return null;
    }

    return fib(i);
};

// 整数nの階乗n!の値を算出する。
// nが負の数の場合、nullを返却する。
// ループ版
var factorial = function (n) {
    var product = 1;
    var i = 0;

    if (n < 0) {
        return null;
    }

    for (i = 2; i <= n; i += 1) {
        product *= i;
    }
    return product;
};

// 再帰版
var factorial2 = function (n) {
    if (n < 0) {
        return null;
    } else if (n === 0 || n === 1) {
        return 1;
    }

    return n * factorial2(n - 1);
};

// 末尾再帰版
var factorial3 = function (n) {
    var fact = function (x, product) {
        if (x === 0 || x === 1) {
            return product;
        }

        return fact(x - 1, product * x);
    };

    if (n < 0) {
        return null;
    }

    return fact(n, 1);
};

// 畳み込み版
var factorial4 = function (n) {
    if (n < 0) {
        return null;
    }

    return _.reduce(_.range(2, n + 1), function (product, i) {
        return product * i;
    }, 1);
};
