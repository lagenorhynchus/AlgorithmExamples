// 数値計算のアルゴリズムのテスト

QUnit.test("isLeapYearで2012がtrueと判定される", function (assert) {
  var year = 2012;

  var expected = true;
  var actual = AlgorithmInJavaScript1.isLeapYear(year);
  assert.strictEqual(actual, expected);
});
