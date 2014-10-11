// 数値計算のアルゴリズム

var _ = typeof require === "undefined" ? _ : require("underscore");

var AlgorithmInJavaScript1 = (function () {
  return {
    // 西暦年yearが閏年かどうかを判定する。
    isLeapYear: function (year) {
      if (year % 4 === 0 && year % 100 !== 0) {
        return true;
      } else if (year % 400 === 0) {
        return true;
      } else {
        return false;
      }
    },

    // 整数nが素数かどうかを判定する。
    // 標準機能版
    isPrime: function (n) {
      var stopPoint;
      var i;

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
    },

    // Underscore.js版
    isPrime2: function (n) {
      var stopPoint;

      if (n < 2) {
        return false;
      }

      stopPoint = Math.floor(Math.sqrt(n));
      return _.every(_.range(2, stopPoint + 1), function (i) {
        return n % i !== 0;
      });
    },

    // ユークリッドの互除法により整数a, bの最大公約数を算出する。
    // a, bが1未満の場合、nullを返却する。
    // 除算版
    gcd: function (a, b) {
      var r;

      if (a < 1 || b < 1) {
        return null;
      }

      while (b > 0) {
        r = a % b;
        a = b;
        b = r;
      }
      return a;
    },

    // 減算版
    gcd2: function (a, b) {
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
    },

    // 整数a, bの最小公倍数を算出する。
    // a, bが1未満の場合、nullを返却する。
    lcm: function (a, b) {
      if (a < 1 || b < 1) {
        return null;
      }

      return a * b / this.gcd(a, b);
    },

    // フィボナッチ数列の第i項の値を算出する。
    // iが1未満の場合、nullを返却する。
    // ループ版
    fibonacci: function (i) {
      var previous = 1;
      var current = 0;
      var j;
      var tmp;

      if (i < 1) {
        return null;
      }

      for (j = 0; j < i; j += 1) {
        tmp = previous;
        previous = current;
        current = tmp + current;
      }
      return current;
    },

    // 再帰版
    fibonacci2: function fibonacci2 (i) {
      if (i < 1) {
        return null;
      } else if (i === 1 || i === 2) {
        return 1;
      }

      return fibonacci2(i - 2) + fibonacci2(i - 1);
    },

    // 末尾再帰版
    fibonacci3: function (i) {
      var fib = function fib (x, previous, current) {
        if (x === 1) {
          return previous + current;
        }

        return fib(x - 1, current, previous + current);
      };

      if (i < 1) {
        return null;
      }

      return fib(i, 1, 0);
    },

    // 再帰(メモ化)版
    fibonacci4: function (i) {
      var fibList = [];
      var fib = function fib (x) {
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
    },

    // 整数nの階乗n!の値を算出する。
    // nが負の数の場合、nullを返却する。
    // ループ版
    factorial: function (n) {
      var product = 1;
      var i;

      if (n < 0) {
        return null;
      }

      for (i = 2; i <= n; i += 1) {
        product *= i;
      }
      return product;
    },

    // 再帰版
    factorial2: function factorial2 (n) {
      if (n < 0) {
        return null;
      } else if (n === 0 || n === 1) {
        return 1;
      }

      return n * factorial2(n - 1);
    },

    // 末尾再帰版
    factorial3: function (n) {
      var fact = function fact (x, product) {
        if (x === 0 || x === 1) {
          return product;
        }

        return fact(x - 1, product * x);
      };

      if (n < 0) {
        return null;
      }

      return fact(n, 1);
    },

    // 畳み込み版
    factorial4: function (n) {
      if (n < 0) {
        return null;
      }

      return _.reduce(_.range(2, n + 1), function (product, i) {
        return product * i;
      }, 1);
    }
  };
}());
