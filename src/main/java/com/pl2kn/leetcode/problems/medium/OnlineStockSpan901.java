package com.pl2kn.leetcode.problems.medium;

import java.util.Stack;

public class OnlineStockSpan901 {

  class StockSpanner {

    private final Stack<int[]> stack;

    public StockSpanner() {
      stack = new Stack<>();
    }

    public int next(int price) {
      int count = 1;
      while (!stack.isEmpty() && stack.peek()[0] <= price) {
        count += stack.pop()[1];
      }
      stack.push(new int[]{price, count});
      return count;
    }
  }
}
