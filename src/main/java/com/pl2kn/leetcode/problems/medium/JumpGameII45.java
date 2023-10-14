package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class JumpGameII45 {

  public int jump(int[] nums) {
    if (nums.length < 2) {
      return 0;
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(0);

    boolean[] visited = new boolean[nums.length];
    visited[0] = true;

    int level = 0;
    while (!queue.isEmpty()) {
      level++;
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int index = queue.poll();
        for (int j = 1; j <= nums[index]; j++) {
          int newIndex = index + j;
          if (visited[newIndex]) {
            continue;
          }

          if (newIndex >= nums.length - 1) {
            return level;
          }

          visited[newIndex] = true;
          queue.add(newIndex);
        }
      }
    }

    return -1;
  }
}
