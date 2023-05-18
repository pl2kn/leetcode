package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes1557 {

  public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    boolean[] isIncoming = new boolean[n];

    for (List<Integer> edge : edges) {
      isIncoming[edge.get(1)] = true;
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      if (!isIncoming[i]) {
        result.add(i);
      }
    }

    return result;
  }
}
