package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreesWithFactors823 {

  private static final int MOD = 1000000007;

  public int numFactoredBinaryTrees(int[] arr) {
    Arrays.sort(arr);

    Map<Integer, Long> map = new HashMap<>();
    for (int num : arr) {
      long count = 1;
      for (int divider : map.keySet()) {
        if (num % divider == 0 && map.containsKey(num / divider)) {
          count += map.get(divider) * map.get(num / divider);
        }
      }
      map.put(num, count);
    }

    long sum = 0;
    for (long count : map.values()) {
      sum = sum + count;
    }

    return (int) (sum % MOD);
  }
}
