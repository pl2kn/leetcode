package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReorderRoutesToMakeAllPathsLeadToTheCityZero1466 {

  private int changeCount = 0;

  public int minReorder(int n, int[][] connections) {
    List<List<Integer>> adj = new ArrayList<>();
    Map<Integer, Set<Integer>> directionMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      adj.add(i, new ArrayList<>());
      directionMap.put(i, new HashSet<>());
    }

    for (int[] connection : connections) {
      directionMap.get(connection[1]).add(connection[0]);
      adj.get(connection[0]).add(connection[1]);
      adj.get(connection[1]).add(connection[0]);
    }

    boolean[] visited = new boolean[n];

    dfs(0, adj, directionMap, visited);

    return changeCount;
  }

  private void dfs(int city, List<List<Integer>> adj, Map<Integer, Set<Integer>> directionMap, boolean[] visited) {
    visited[city] = true;

    for (int neighborCity : adj.get(city)) {
      if (!visited[neighborCity]) {
        if (!directionMap.get(city).contains(neighborCity)) {
          changeCount++;
        }
        dfs(neighborCity, adj, directionMap, visited);
      }
    }
  }
}
