package com.pl2kn.leetcode.problems.hard;

public class PaintingTheWalls2742 {

  public int paintWalls(int[] cost, int[] time) {
    int wallCount = cost.length;
    return paintWalls(cost, time, 0, wallCount, new Integer[wallCount][wallCount + 1]);
  }

  private int paintWalls(int[] cost, int[] time, int i, int remain, Integer[][] memo) {
    if (remain <= 0) {
      return 0;
    }

    if (i == cost.length) {
      return (int) 1e9;
    }

    if (memo[i][remain] != null) {
      return memo[i][remain];
    }

    return memo[i][remain] = Math.min(
        cost[i] + paintWalls(cost, time, i + 1, remain - 1 - time[i], memo),
        paintWalls(cost, time, i + 1, remain, memo)
    );
  }
}
