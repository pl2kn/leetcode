package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII90 {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> subsets = new ArrayList<>();
    subsets.add(new ArrayList<>());

    int startIndex = 0;
    int endIndex = 0;
    for (int i = 0; i < nums.length; i++) {
      startIndex = 0;

      if (i > 0 && nums[i] == nums[i - 1]) {
        startIndex = endIndex + 1;
      }

      endIndex = subsets.size() - 1;
      for (int j = startIndex; j <= endIndex; j++) {
        List<Integer> subset = new ArrayList<>(subsets.get(j));
        subset.add(nums[i]);
        subsets.add(subset);
      }
    }

    return subsets;
  }
}
