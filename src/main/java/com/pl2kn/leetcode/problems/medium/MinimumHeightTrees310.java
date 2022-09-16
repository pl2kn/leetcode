package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class MinimumHeightTrees310 {

  public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    List<Integer> result = new ArrayList<>();

    if (n < 2) {
      for (int i = 0; i < n; i++) {
        result.add(i);
      }

      return result;
    }

    Map<Integer, Integer> inDegree = new HashMap<>();
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < n; i++) {
      inDegree.put(i, 0);
      graph.put(i, new ArrayList<>());
    }

    for (int[] edge : edges) {
      int node1 = edge[0];
      int node2 = edge[1];

      inDegree.put(node1, inDegree.get(node1) + 1);
      inDegree.put(node2, inDegree.get(node2) + 1);

      graph.get(node1).add(node2);
      graph.get(node2).add(node1);
    }

    Queue<Integer> leaves = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 1) {
        leaves.add(entry.getKey());
      }
    }

    while (n > 2) {
      int leaveSize = leaves.size();
      n -= leaveSize;
      for (int i = 0; i < leaveSize; i++) {
        int vertex = leaves.poll();
        for (int child : graph.get(vertex)) {
          inDegree.put(child, inDegree.get(child) - 1);
          if (inDegree.get(child) == 1) {
            leaves.add(child);
          }
        }
      }
    }

    result.addAll(leaves);

    return result;
  }
}
