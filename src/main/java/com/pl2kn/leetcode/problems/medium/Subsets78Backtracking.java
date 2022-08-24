package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets78Backtracking {

  private int n;

  private int k;

  private List<List<Integer>> result;

  public List<List<Integer>> subsets(int[] nums) {
    n = nums.length;
    result = new ArrayList<>();

    for (k = 0; k <= n; k++) {
      backtrack(0, new ArrayList<>(), nums);
    }

    return result;
  }

  private void backtrack(int first, List<Integer> subset, int[] nums) {
    if (subset.size() == k) {
      result.add(new ArrayList<>(subset));
    }

    for (int i = first; i < n; i++) {
      subset.add(nums[i]);
      backtrack(i + 1, subset, nums);
      subset.remove(subset.size() - 1);
    }
  }
}
