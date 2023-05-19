package com.pl2kn.leetcode.problems.medium;

public class IsGraphBipartite785 {

  public boolean isBipartite(int[][] graph) {
    int n = graph.length;
    int[] sets = new int[n];

    for (int i = 0; i < n; i++) {
      if (sets[i] == 0 && !isBipartite(graph, i, sets, 1)) {
        return false;
      }
    }

    return true;
  }

  public boolean isBipartite(int[][] graph, int node, int[] sets, int set) {
    if (sets[node] != 0) {
      return sets[node] == set;
    }

    sets[node] = set;

    for (int neighbor : graph[node]) {
      if (!isBipartite(graph, neighbor, sets, -set)) {
        return false;
      }
    }

    return true;
  }
}
