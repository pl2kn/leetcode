package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII219 {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];

      if (map.containsKey(num) && Math.abs(i - map.get(num)) <= k) {
        return true;
      }

      map.put(num, i);
    }

    return false;
  }
}
