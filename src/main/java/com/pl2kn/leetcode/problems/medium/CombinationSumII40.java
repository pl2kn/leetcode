package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII40 {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    backtrack(candidates, target, 0, 0, new ArrayList<>(), result);
    return result;
  }

  private void backtrack(int[] candidates, int target, int sum, int start, List<Integer> current, List<List<Integer>> result) {
    if (sum > target) {
      return;
    }

    if (sum == target) {
      result.add(new ArrayList<>(current));
    }

    for (int i = start; i < candidates.length; i++) {
      if (i > start && candidates[i] == candidates[i - 1]) {
        continue;
      }

      current.add(candidates[i]);
      backtrack(candidates, target, sum + candidates[i], i + 1, current, result);
      current.remove(current.size() - 1);
    }
  }
}
