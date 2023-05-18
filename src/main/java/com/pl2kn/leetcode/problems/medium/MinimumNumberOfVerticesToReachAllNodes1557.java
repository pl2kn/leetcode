package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumNumberOfVerticesToReachAllNodes1557 {

  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    Map<Integer, Integer> inDegrees = new HashMap<>();
    for (int i = 0; i < n; i++) {
      inDegrees.put(i, 0);
    }

    for (List<Integer> edge : edges) {
      inDegrees.put(edge.get(1), inDegrees.get(edge.get(1)) + 1);
    }

    List<Integer> result = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : inDegrees.entrySet()) {
      if (entry.getValue() == 0) {
        result.add(entry.getKey());
      }
    }

    return result;
  }
}
