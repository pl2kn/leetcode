package com.pl2kn.leetcode.problems.easy.movingaveragefromdatastream356;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {

  private final Queue<Integer> queue;

  private int sum;

  private int size;

  public MovingAverage(int size) {
    queue = new LinkedList<>();
    this.size = size;
  }

  public double next(int val) {
    if (queue.size() >= size) {
      sum -= queue.remove();
    }
    queue.add(val);
    sum += val;
    return 1.0 * sum / queue.size();
  }
}
