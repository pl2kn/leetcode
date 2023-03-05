package com.pl2kn.leetcode.problems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class JumpGameIV1345 {

  public int minJumps(int[] arr) {
    int n = arr.length;

    Map<Integer, List<Integer>> positionMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      positionMap.computeIfAbsent(arr[i], num -> new ArrayList<>()).add(i);
    }

    boolean[] visited = new boolean[n];
    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);

    int stepCount = 0;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int index = queue.remove();
        visited[index] = true;

        if (index == n - 1) {
          return stepCount;
        }

        List<Integer> jumps = positionMap.get(arr[index]);
        jumps.add(index - 1);
        jumps.add(index + 1);

        for (int nextIndex : jumps) {
          if (nextIndex >= 0 && nextIndex < n && !visited[nextIndex]) {
            queue.add(nextIndex);
          }
        }

        jumps.clear();
      }

      stepCount++;
    }

    return 0;
  }
}
