package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {

  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), n, k, 1);
    return result;
  }

  private void backtrack(List<List<Integer>> result, List<Integer> current, int n, int k, int start) {
    if (k == 0) {
      result.add(new ArrayList<>(current));
      return;
    }

    for (int i = start; i <= n; i++) {
      current.add(i);
      backtrack(result, current, n, k - 1, i + 1);
      current.remove(current.size() - 1);
    }
  }
}
