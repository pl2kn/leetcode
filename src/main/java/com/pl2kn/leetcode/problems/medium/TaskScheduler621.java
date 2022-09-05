package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TaskScheduler621 {

  public int leastInterval(char[] tasks, int n) {
    Map<Character, Integer> counts = new HashMap<>();
    for (char task : tasks) {
      counts.put(task, counts.getOrDefault(task, 0) + 1);
    }

    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue()
    );
    maxHeap.addAll(counts.entrySet());

    int result = 0;
    while (!maxHeap.isEmpty()) {
      List<Map.Entry<Character, Integer>> waitList = new ArrayList<>();
      int k = n + 1;
      while (k > 0 && !maxHeap.isEmpty()) {
        result++;
        Map.Entry<Character, Integer> entry = maxHeap.poll();
        if (entry.getValue() > 0) {
          entry.setValue(entry.getValue() - 1);
          waitList.add(entry);
        }
        k--;
      }
      maxHeap.addAll(waitList);

      if (!maxHeap.isEmpty()) {
        result += k;
      }
    }

    return result;
  }
}
