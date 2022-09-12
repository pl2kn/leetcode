package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule207 {

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    if (numCourses <= 0) {
      return false;
    }

    Map<Integer, Integer> inDegree = new HashMap<>();
    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int i = 0; i < numCourses; i++) {
      inDegree.put(i, 0);
      adj.put(i, new ArrayList<>());
    }

    for (int[] edge : prerequisites) {
      adj.get(edge[0]).add(edge[1]);
      inDegree.put(edge[1], inDegree.getOrDefault(edge[1], 0) + 1);
    }

    Queue<Integer> sources = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        sources.add(entry.getKey());
      }
    }

    List<Integer> sorted = new ArrayList<>();
    while (!sources.isEmpty()) {
      int vertex = sources.poll();
      sorted.add(vertex);
      for (int child : adj.get(vertex)) {
        inDegree.put(child, inDegree.get(child) - 1);
        if (inDegree.get(child) == 0) {
          sources.add(child);
        }
      }
    }

    return sorted.size() == numCourses;
  }
}
