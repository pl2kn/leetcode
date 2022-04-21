package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AllPathsFromSourceToTarget797 {

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();

    Stack<List<Integer>> stack = new Stack<>();
    stack.add(Arrays.asList(0));

    while (!stack.isEmpty()) {
      List<Integer> path = stack.pop();
      int lastVertex = path.get(path.size() - 1);

      if (lastVertex == graph.length - 1) {
        result.add(new ArrayList<>(path));
      } else {
        for (int neighbor : graph[lastVertex]) {
          List<Integer> newPath = new ArrayList<>(path);
          newPath.add(neighbor);
          stack.add(newPath);
        }
      }
    }

    return result;
  }
}
