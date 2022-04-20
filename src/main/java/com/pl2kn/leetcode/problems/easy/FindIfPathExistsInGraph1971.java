package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindIfPathExistsInGraph1971 {

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    Stack<Integer> stack = new Stack<>();
    boolean[] marked = new boolean[n];
    stack.add(source);

    while (!stack.isEmpty()) {
      int vertex = stack.pop();

      if (vertex == destination) {
        return true;
      }

      marked[vertex] = true;
      for (int neighbor : adj.get(vertex)) {
        if (!marked[neighbor]) {
          stack.add(neighbor);
        }
      }
    }

    return false;
  }
}
