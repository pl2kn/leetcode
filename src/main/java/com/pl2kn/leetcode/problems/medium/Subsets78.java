package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> subsets = new ArrayList<>();
    subsets.add(new ArrayList<>());

    for (int num : nums) {
      int subsetCount = subsets.size();
      for (int i = 0; i < subsetCount; i++) {
        List<Integer> subset = new ArrayList<>(subsets.get(i));
        subset.add(num);
        subsets.add(subset);
      }
    }

    return subsets;
  }
}
