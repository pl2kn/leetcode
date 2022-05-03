package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsFromSourceToTarget797Bfs {

  public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    List<List<Integer>> result = new ArrayList<>();

    Queue<List<Integer>> queue = new LinkedList<>();
    queue.add(Arrays.asList(0));

    while (!queue.isEmpty()) {
      List<Integer> path = queue.remove();
      int lastVertex = path.get(path.size() - 1);

      if (lastVertex == graph.length - 1) {
        result.add(path);
      } else {
        for (int neighbor : graph[lastVertex]) {
          List<Integer> newPath = new ArrayList<>(path);
          newPath.add(neighbor);
          queue.add(newPath);
        }
      }
    }

    return result;
  }
}
