package com.pl2kn.leetcode.problems.medium;

import java.util.Stack;

public class DailyTemperatures739 {

  public int[] dailyTemperatures(int[] temperatures) {
    int length = temperatures.length;
    int[] result = new int[length];
    Stack<Integer> stack = new Stack<>();
    for (int currDay = 0; currDay < length; currDay++) {
      int currTemp = temperatures[currDay];
      while (!stack.isEmpty() && temperatures[stack.peek()] < currTemp) {
        int prevDay = stack.pop();
        result[prevDay] = currDay - prevDay;
      }
      stack.push(currDay);
    }
    return result;
  }
}
