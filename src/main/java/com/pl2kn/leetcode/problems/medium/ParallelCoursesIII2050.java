package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ParallelCoursesIII2050 {

  public int minimumTime(int n, int[][] relations, int[] time) {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int i = 0; i < n; i++) {
      adj.put(i, new ArrayList<>());
    }

    int[] indegree = new int[n];
    for (int[] relation : relations) {
      int u = relation[0] - 1;
      int v = relation[1] - 1;

      adj.get(u).add(v);

      indegree[v]++;
    }

    Queue<Integer> queue = new LinkedList<>();
    int[] maxTime = new int[n];
    for (int i = 0; i < n; i++) {
      if (indegree[i] == 0) {
        queue.add(i);
        maxTime[i] = time[i];
      }
    }

    while (!queue.isEmpty()) {
      int course = queue.poll();
      for(int neighbor : adj.get(course)) {
        maxTime[neighbor] = Math.max(maxTime[neighbor], maxTime[course] + time[neighbor]);
        indegree[neighbor]--;
        if (indegree[neighbor] == 0) {
          queue.add(neighbor);
        }
      }
    }

    int result = 0;
    for (int maxCourseTime : maxTime) {
      result = Math.max(maxCourseTime, result);
    }

    return result;
  }
}
