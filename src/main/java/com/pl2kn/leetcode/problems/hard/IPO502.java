package com.pl2kn.leetcode.problems.hard;

import java.util.PriorityQueue;

public class IPO502 {

  public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    PriorityQueue<int[]> minCapitalHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
    for (int i = 0; i < profits.length; i++) {
      minCapitalHeap.add(new int[]{capital[i], profits[i]});
    }

    PriorityQueue<int[]> maxProfitHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
    for (int i = 0; i < k; i++) {
      while (!minCapitalHeap.isEmpty() && minCapitalHeap.peek()[0] <= w) {
        maxProfitHeap.add(minCapitalHeap.remove());
      }

      if (maxProfitHeap.isEmpty()) {
        break;
      }

      w += maxProfitHeap.remove()[1];
    }

    return w;
  }
}
