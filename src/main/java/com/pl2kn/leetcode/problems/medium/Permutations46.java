package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations46 {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    backtrack(result, new ArrayList<>(), new HashSet<>(), nums);

    return result;
  }

  private void backtrack(List<List<Integer>> result, List<Integer> permutation, Set<Integer> used, int[] nums) {
    int n = nums.length;

    if (permutation.size() == n) {
      result.add(new ArrayList<>(permutation));

      return;
    }

    for (int num : nums) {
      if (used.contains(num)) {
        continue;
      }

      permutation.add(num);
      used.add(num);

      backtrack(result, permutation, used, nums);

      int lastIndex = permutation.size() - 1;
      used.remove(permutation.get(lastIndex));
      permutation.remove(lastIndex);
    }
  }
}
