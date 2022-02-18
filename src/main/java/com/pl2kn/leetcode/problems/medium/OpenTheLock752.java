package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class OpenTheLock752 {

  public int openLock(String[] deadends, String target) {
    Set<String> visited = new HashSet<>(Arrays.asList(deadends));
    Queue<String> queue = new LinkedList<>();
    queue.add("0000");
    int depth = 0;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        String code = queue.remove();
        if (code.equals(target)) {
          return depth;
        }
        if (visited.contains(code)) {
          continue;
        }
        visited.add(code);
        for (int j = 0; j < 4; j++) {
          char c = code.charAt(j);
          queue.add(code.substring(0, j) + (c == '9' ? 1 : c - '0' + 1) + code.substring(j + 1));
          queue.add(code.substring(0, j) + (c == '0' ? 9 : c - '0' - 1) + code.substring(j + 1));
        }
      }
      depth++;
    }
    return -1;
  }
}
