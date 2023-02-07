package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
public class ContiguousArray525 {

  public int findMaxLength(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int max = 0;

    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      count = count + (nums[i] == 1 ? 1 : -1);
      if (map.containsKey(count)) {
        max = Math.max(max, i - map.get(count));
      } else {
        map.put(count, i);
      }
    }

    return max;
  }
}
