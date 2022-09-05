package com.pl2kn.leetcode.problems.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RearrangeStringKDistanceApart358 {

  public String rearrangeString(String s, int k) {
    Map<Character, Integer> counts = new HashMap<>();
    for (char c : s.toCharArray()) {
      counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
        (a, b) -> b.getValue() - a.getValue());
    maxHeap.addAll(counts.entrySet());

    StringBuilder builder = new StringBuilder(s.length());
    Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();
    while (!maxHeap.isEmpty()) {
      Map.Entry<Character, Integer> entry = maxHeap.poll();
      builder.append(entry.getKey());
      entry.setValue(entry.getValue() - 1);
      queue.add(entry);

      if (k == 0 || queue.size() == k) {
        Map.Entry<Character, Integer> queueEntry = queue.poll();
        if (queueEntry.getValue() > 0) {
          maxHeap.add(queueEntry);
        }
      }
    }

    return builder.length() == s.length() ? builder.toString() : "";
  }
}
