package com.pl2kn.leetcode.problems.medium;

public class NumberOfDiceRollsWithTargetSum1155 {

  private static final int MOD = 1000000007;

  public int numRollsToTarget(int n, int k, int target) {
    return numRollsToTarget(n, k, target, 0, new Integer[n][target + 1]);
  }

  private int numRollsToTarget(int n, int k, int target, int index, Integer[][] memo) {
    if (index == n) {
      return target == 0 ? 1 : 0;
    }

    if (memo[index][target] != null) {
      return memo[index][target];
    }

    int result = 0;
    for (int i = 1; i <= Math.min(k, target); i++) {
      result = (result + numRollsToTarget(n, k, target - i, index + 1, memo)) % MOD;
    }

    return memo[index][target] = result;
  }
}
