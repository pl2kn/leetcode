package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class NumberOfConnectedComponentsInAnUndirectedGraph323DFS {

  public int countComponents(int n, int[][] edges) {
    List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    boolean[] visited = new boolean[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(adj, visited, i);
        count++;
      }
    }

    return count;
  }

  private void dfs(List<List<Integer>> adj, boolean[] visited, int i) {
    visited[i] = true;

    for (int neighbour : adj.get(i)) {
      if (!visited[neighbour]) {
        dfs(adj, visited, neighbour);
      }
    }
  }
}
