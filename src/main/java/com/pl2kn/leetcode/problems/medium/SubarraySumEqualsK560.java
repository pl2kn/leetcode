package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK560 {

  public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> counts = new HashMap<>();
    int result = 0;
    int prefixSum = 0;
    counts.put(0, 1);
    for (int num : nums) {
      prefixSum += num;
      result += counts.getOrDefault(prefixSum - k, 0);
      counts.put(prefixSum, counts.getOrDefault(prefixSum, 0) + 1);
    }

    return result;
  }
}
