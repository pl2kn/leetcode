package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindEventualSafeStates802 {

  public List<Integer> eventualSafeNodes(int[][] graph) {
    int n = graph.length;

    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(i, new ArrayList<>());
    }

    int[] outDegree = new int[n];
    for (int i = 0; i < n; i++) {
      for (int neighbor : graph[i]) {
        adj.get(neighbor).add(i);
        outDegree[i]++;
      }
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      if (outDegree[i] == 0) {
        queue.add(i);
      }
    }

    boolean[] isSafe = new boolean[n];
    while (!queue.isEmpty()) {
      int node = queue.poll();
      isSafe[node] = true;

      for (int neighbor : adj.get(node)) {
        outDegree[neighbor]--;
        if (outDegree[neighbor] == 0) {
          queue.add(neighbor);
        }
      }
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (isSafe[i]) {
        result.add(i);
      }
    }

    return result;
  }
}
