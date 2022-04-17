package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GraphValidTree261 {

  public boolean validTree(int n, int[][] edges) {
    List<List<Integer>> adj = new ArrayList<>();
    Stack<Integer> stack = new Stack<>();
    Map<Integer, Integer> parents = new HashMap<>();

    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    stack.add(0);
    parents.put(0, -1);

    while (!stack.isEmpty()) {
      int node = stack.pop();
      for (int neighbor : adj.get(node)) {
        if (parents.get(node) == neighbor) {
          continue;
        }

        if (parents.containsKey(neighbor)) {
          return false;
        }

        stack.add(neighbor);
        parents.put(neighbor, node);
      }
    }

    return parents.size() == n;
  }
}
