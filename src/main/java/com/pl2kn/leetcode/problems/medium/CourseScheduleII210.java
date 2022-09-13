package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseScheduleII210 {

  public int[] findOrder(int numCourses, int[][] prerequisites) {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    Map<Integer, Integer> inDegree = new HashMap<>();
    for (int course = 0; course < numCourses; course++) {
      inDegree.put(course, 0);
      adj.put(course, new ArrayList<>());
    }

    for (int[] prerequisite : prerequisites) {
      int previousCourse = prerequisite[1];
      int nextCourse = prerequisite[0];
      adj.get(previousCourse).add(nextCourse);
      inDegree.put(nextCourse, inDegree.get(nextCourse) + 1);
    }

    Queue<Integer> queue = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        queue.add(entry.getKey());
      }
    }

    List<Integer> sortedCourses = new ArrayList<>();
    while (!queue.isEmpty()) {
      int course = queue.poll();
      sortedCourses.add(course);
      for (int nextCourse : adj.get(course)) {
        inDegree.put(nextCourse, inDegree.get(nextCourse) - 1);
        if (inDegree.get(nextCourse) == 0) {
          queue.add(nextCourse);
        }
      }
    }

    if (sortedCourses.size() != numCourses) {
      return new int[]{};
    }

    int[] result = new int[numCourses];
    int i = 0;
    for (int course : sortedCourses) {
      result[i++] = course;
    }

    return result;
  }
}
