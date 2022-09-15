package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class SequenceReconstruction444 {

  public boolean sequenceReconstruction(int[] nums, List<List<Integer>> sequences) {
    Map<Integer, Integer> inDegree = new HashMap<>();
    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int num : nums) {
      inDegree.put(num, 0);
      adj.put(num, new ArrayList<>());
    }

    for (List<Integer> sequence : sequences) {
      for (int i = 0; i < sequence.size() - 1; i++) {
        int parent = sequence.get(i);
        int child = sequence.get(i + 1);
        inDegree.put(child, inDegree.get(child) + 1);
        adj.get(parent).add(child);
      }
    }

    Queue<Integer> sources = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        sources.add(entry.getKey());
      }
    }

    List<Integer> sorted = new ArrayList<>();
    while (!sources.isEmpty()) {
      if (sources.size() > 1) {
        return false;
      }

      if (nums[sorted.size()] != sources.peek()) {
        return false;
      }

      int num = sources.poll();
      sorted.add(num);
      for (int childNum : adj.get(num)) {
        inDegree.put(childNum, inDegree.get(childNum) - 1);
        if (inDegree.get(childNum) == 0) {
          sources.add(childNum);
        }
      }
    }

    return sorted.size() == nums.length;
  }
}
