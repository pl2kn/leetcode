package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class MinimizeDeviationInArray1675 {

  public int minimumDeviation(int[] nums) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    int minNum = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num % 2 == 1) {
        num *= 2;
      }
      maxHeap.add(num);
      minNum = Math.min(minNum, num);
    }

    int minDeviation = Integer.MAX_VALUE;
    while (true) {
      int maxNum = maxHeap.remove();
      minDeviation = Math.min(minDeviation, maxNum - minNum);

      if (maxNum % 2 == 1) {
        break;
      }

      maxHeap.add(maxNum / 2);
      minNum = Math.min(minNum, maxNum / 2);
    }

    return minDeviation;
  }
\
}
