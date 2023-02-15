package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum39 {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    backtrack(candidates, result, new ArrayList<>(), 0, target, 0);
    return result;
  }

  private void backtrack(int[] candidates, List<List<Integer>> result, List<Integer> current, int sum, int target, int start) {
    if (sum > target) {
      return;
    }

    if (sum == target) {
      result.add(new ArrayList<>(current));
      return;
    }

    for (int i = start; i < candidates.length; i++) {
      current.add(candidates[i]);
      backtrack(candidates, result, current, sum + candidates[i], target, i);
      current.remove(current.size() - 1);
    }
  }

}
