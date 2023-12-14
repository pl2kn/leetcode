package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CarFleet853 {

  public int carFleet(int target, int[] position, int[] speed) {
    int n = position.length;

    Map<Integer, Integer> positionsSpeed = new HashMap<>();
    for (int i = 0; i < n; i++) {
      positionsSpeed.put(position[i], speed[i]);
    }

    Arrays.sort(position);

    double[] times = new double[n];
    for (int i = 0; i < n; i++) {
      times[i] = (double)(target - position[i]) / positionsSpeed.get(position[i]);
    }

    Stack<Double> stack = new Stack<>();
    for (double time : times) {
      while (!stack.isEmpty() && time >= stack.peek()) {
        stack.pop();
      }
      stack.push(time);
    }

    return stack.size();
  }
}
