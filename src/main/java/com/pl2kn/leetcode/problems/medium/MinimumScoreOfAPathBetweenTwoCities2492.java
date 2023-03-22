package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class MinimumScoreOfAPathBetweenTwoCities2492 {

  private int minScore = Integer.MAX_VALUE;

  public int minScore(int n, int[][] roads) {
    List<List<int[]>> adj = new ArrayList<>();
    for (int i = 0; i <= n; i++) {
      adj.add(i, new ArrayList<>());
    }

    for (int[] road : roads) {
      adj.get(road[0]).add(new int[]{road[1], road[2]});
      adj.get(road[1]).add(new int[]{road[0], road[2]});
    }

    boolean[] visited = new boolean[n + 1];

    dfs(1, adj, visited);

    return minScore;
  }

  private void dfs(int city, List<List<int[]>> adj, boolean[] visited) {
    visited[city] = true;

    for (int[] edge : adj.get(city)) {
      minScore = Math.min(minScore, edge[1]);
      if (!visited[edge[0]]) {
        dfs(edge[0], adj, visited);
      }
    }
  }
}
