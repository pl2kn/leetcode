package com.pl2kn.leetcode.problems.hard;

public class NumberOfWaysToStayInTheSamePlaceAfterSomeSteps1269 {

  private final static int MOD = 1000000007;

  public int numWays(int steps, int arrLen) {
    return numWays(steps, arrLen, 0, new Integer[steps][steps + 1]);
  }

  private int numWays(int steps, int arrLen, int index, Integer[][] memo) {
    if (index < 0 || index == arrLen) {
      return 0;
    }

    if (steps == 0) {
      if (index == 0) {
        return 1;
      }

      return 0;
    }

    if (memo[index][steps] != null) {
      return memo[index][steps];
    }

    int result = numWays(steps - 1, arrLen, index, memo) % MOD;
    result = (result + numWays(steps - 1, arrLen, index - 1, memo)) % MOD;
    result = (result + numWays(steps - 1, arrLen, index + 1, memo)) % MOD;

    return memo[index][steps] = result;
  }
}
