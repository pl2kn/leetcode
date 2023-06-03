package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeNeededToInformAllEmployees1376 {

  private int numberOfMinutes = Integer.MIN_VALUE;

  public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int i = 0; i < n; i++) {
      adj.put(i, new ArrayList<>());
    }

    for (int i = 0; i < n; i++) {
      if (i == headID) {
        continue;
      }

      adj.get(manager[i]).add(i);
    }

    dfs(adj, informTime, headID, 0);

    return numberOfMinutes;
  }

  private void dfs(Map<Integer, List<Integer>> adj, int[] informTime, int employee,
      int currentTime) {
    currentTime += informTime[employee];
    numberOfMinutes = Math.max(numberOfMinutes, currentTime);

    for (int subordinate : adj.get(employee)) {
      dfs(adj, informTime, subordinate, currentTime);
    }
  }
}
