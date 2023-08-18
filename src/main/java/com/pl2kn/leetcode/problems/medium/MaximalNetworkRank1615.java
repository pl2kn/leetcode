package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaximalNetworkRank1615 {

  public int maximalNetworkRank(int n, int[][] roads) {
    Map<Integer, Set<Integer>> adj = new HashMap<>();
    for (int i = 0; i < n; i++) {
      adj.put(i, new HashSet<>());
    }

    for (int[] road : roads) {
      adj.get(road[0]).add(road[1]);
      adj.get(road[1]).add(road[0]);
    }

    int maxRank = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int rank = adj.get(i).size() + adj.get(j).size();
        if (adj.get(i).contains(j)) {
          rank--;
        }
        maxRank = Math.max(maxRank, rank);
      }
    }

    return maxRank;
  }
}
