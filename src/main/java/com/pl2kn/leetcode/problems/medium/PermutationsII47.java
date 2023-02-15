package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII47 {

  public List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> permutations = new ArrayList<>();
    Arrays.sort(nums);
    backtrack(permutations, new ArrayList<>(), nums, new boolean[nums.length]);
    return permutations;
  }

  private void backtrack(List<List<Integer>> permutations, List<Integer> permutation, int[] nums,
      boolean[] used) {
    if (permutation.size() == nums.length) {
      permutations.add(new ArrayList<>(permutation));
    } else {
      for (int i = 0; i < nums.length; i++) {
        if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
          continue;
        }

        permutation.add(nums[i]);
        used[i] = true;
        backtrack(permutations, permutation, nums, used);
        permutation.remove(permutation.size() - 1);
        used[i] = false;
      }
    }
  }
}
