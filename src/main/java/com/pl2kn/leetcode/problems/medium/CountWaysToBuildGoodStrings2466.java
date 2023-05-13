package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class CountWaysToBuildGoodStrings2466 {

  private static int MOD = 1_000_000_007;

  public int countGoodStrings(int low, int high, int zero, int one) {
    int[] memo = new int[high + 1];
    Arrays.fill(memo, -1);

    int result = 0;

    for (int target = low; target <= high; target++) {
      result = result % MOD + countGoodStrings(target, zero, one, memo) % MOD;
    }

    return result % MOD;
  }

  private int countGoodStrings(int target, int zero, int one, int[] memo) {
    if (memo[target] != -1) {
      return memo[target];
    }

    if (target == 0) {
      return 1;
    }

    int count = 0;

    if (target >= zero) {
      count += countGoodStrings(target - zero, zero, one, memo) % MOD;
    }

    if (target >= one) {
      count += countGoodStrings(target - one, zero, one, memo) % MOD;
    }

    return memo[target] = count % MOD;
  }
}
