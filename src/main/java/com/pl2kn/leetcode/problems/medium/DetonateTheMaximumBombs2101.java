package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetonateTheMaximumBombs2101 {

  public int maximumDetonation(int[][] bombs) {
    int bombCount = bombs.length;

    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int i = 0; i < bombCount; i++) {
      if (!adj.containsKey(i)) {
        adj.put(i, new ArrayList<>());
      }

      for (int j = 0; j < bombCount; j++) {
        if (i == j) {
          continue;
        }

        if (getDistance(bombs[i], bombs[j]) <= bombs[i][2]) {
          adj.get(i).add(j);
        }
      }
    }

    int result = 0;
    for (int i = 0; i < bombCount; i++) {
      result = Math.max(result, dfs(adj, i, new boolean[bombCount]));
    }

    return result;
  }

  private int dfs(Map<Integer, List<Integer>> adj, int bomb, boolean[] visited) {
    visited[bomb] = true;

    int count = 1;
    for (int neighbor : adj.get(bomb)) {
      if (!visited[neighbor]) {
        count += dfs(adj, neighbor, visited);
      }
    }

    return count;
  }

  private double getDistance(int[] bomb1, int[] bomb2) {
    return Math.sqrt(Math.pow(bomb1[0] - bomb2[0], 2) + Math.pow(bomb1[1] - bomb2[1], 2));
  }
}
