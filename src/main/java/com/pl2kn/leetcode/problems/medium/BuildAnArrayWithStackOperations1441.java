package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations1441 {

  public List<String> buildArray(int[] target, int n) {
    List<String> stack = new ArrayList<>();
    for (int i = 1, j = 0; i <= n && j < target.length; i++) {
      if (target[j] == i) {
        stack.add("Push");
        j++;
      } else {
        stack.add("Push");
        stack.add("Pop");
      }
    }
    return stack;
  }
}
