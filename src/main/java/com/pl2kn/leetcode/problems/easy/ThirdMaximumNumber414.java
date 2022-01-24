package com.pl2kn.leetcode.problems.easy;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber414 {

  public int thirdMax(int[] nums) {
    Set<Integer> maxes = new HashSet<>();
    for (int num : nums) {
      maxes.add(num);
      if (maxes.size() > 3) {
        maxes.remove(Collections.min(maxes));
      }
    }
    if (maxes.size() == 3) {
      return Collections.min(maxes);
    }
    return Collections.max(maxes);
  }
}
