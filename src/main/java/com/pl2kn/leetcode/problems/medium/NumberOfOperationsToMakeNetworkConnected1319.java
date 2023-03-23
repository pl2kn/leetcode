package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfOperationsToMakeNetworkConnected1319 {

  public int makeConnected(int n, int[][] connections) {
    if (connections.length < n - 1) {
      return -1;
    }

    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(i, new ArrayList<>());
    }
    for (int[] connection : connections) {
      adj.get(connection[0]).add(connection[1]);
      adj.get(connection[1]).add(connection[0]);
    }

    boolean[] visited = new boolean[n];
    int clusterCount = 0;
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(i, adj, visited);
        clusterCount++;
      }
    }

    return clusterCount - 1;
  }

  public void dfs(int computer, List<List<Integer>> adj, boolean[] visited) {
    visited[computer] = true;
    for (int neighbor : adj.get(computer)) {
      if (!visited[neighbor]) {
        dfs(neighbor, adj, visited);
      }
    }
  }
}
