// リストの探索とソートのアルゴリズムのテスト

QUnit.test("sequentialSearchで先頭の要素の位置が返却される", function (assert) {
  var list = [8, 2, 7, 5, 9, 4, 1, 10, 6, 3];
  var target = 8;

  var expected = 0;
  var actual = AlgorithmInJavaScript2.sequentialSearch(list, target);
  assert.strictEqual(actual, expected);
});
