package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges228 {

  public List<String> summaryRanges(int[] nums) {
    int n = nums.length;
    List<String> result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int start = nums[i];

      while (i < n - 1 && nums[i] + 1 == nums[i + 1]) {
        i++;
      }

      if (start != nums[i]) {
        result.add(start + "->" + nums[i]);
      } else {
        result.add(String.valueOf(start));
      }
    }

    return result;
  }
}
