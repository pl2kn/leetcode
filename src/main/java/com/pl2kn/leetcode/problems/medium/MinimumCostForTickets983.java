package com.pl2kn.leetcode.problems.medium;

public class MinimumCostForTickets983 {

  public int mincostTickets(int[] days, int[] costs) {
    return mincostTickets(days, costs, 0, new int[days.length]);
  }

  private int mincostTickets(int[] days, int[] costs, int i, int[] dp) {
    int dayCount = days.length;

    if (i >= dayCount) {
      return 0;
    }

    if (dp[i] != 0) {
      return dp[i];
    }

    int costDay = costs[0] + mincostTickets(days, costs, i + 1, dp);

    int j;

    for (j = i; j < dayCount && days[j] < days[i] + 7; j++);
    int costWeek = costs[1] + mincostTickets(days, costs, j, dp);

    for (j = i; j < dayCount && days[j] < days[i] + 30; j++);
    int costMonth = costs[2] + mincostTickets(days, costs, j, dp);

    return dp[i] = Math.min(costDay, Math.min(costWeek, costMonth));
  }
}
