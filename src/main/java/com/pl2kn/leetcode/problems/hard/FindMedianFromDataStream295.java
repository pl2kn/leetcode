package com.pl2kn.leetcode.problems.hard;

import java.util.PriorityQueue;
import java.util.Queue;

public class FindMedianFromDataStream295 {

  class MedianFinder {

    private final Queue<Integer> left;

    private final Queue<Integer> right;

    public MedianFinder() {
      left = new PriorityQueue<>();
      right = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
      left.add(num);
      right.add(left.remove());
      if (left.size() < right.size()) {
        left.add(right.remove());
      }
    }

    public double findMedian() {
      return left.size() > right.size() ? left.peek() : (left.peek() + right.peek()) / 2.0;
    }
  }
}
