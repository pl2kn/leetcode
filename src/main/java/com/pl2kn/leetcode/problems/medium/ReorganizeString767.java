package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString767 {

  public String reorganizeString(String s) {
    Map<Character, Integer> counts = new HashMap<>();
    for (char c : s.toCharArray()) {
      counts.put(c, counts.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
    maxHeap.addAll(counts.entrySet());

    Map.Entry<Character, Integer> previous = null;
    StringBuilder builder = new StringBuilder(s.length());
    while (!maxHeap.isEmpty()) {
      Map.Entry<Character, Integer> current = maxHeap.poll();

      if (previous != null && previous.getValue() > 0) {
        maxHeap.add(previous);
      }

      builder.append(current.getKey());
      current.setValue(current.getValue() - 1);
      previous = current;
    }

    return builder.length() == s.length() ? builder.toString() : "";
  }
}
