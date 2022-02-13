package com.pl2kn.leetcode.problems.easy.movingaveragefromdatastream356;

public class MovingAverage {

  private final int size;
  private int head;
  private int sum = 0;
  private int count = 0;
  int[] queue;

  public MovingAverage(int size) {
    this.size = size;
    queue = new int[size];
  }

  public double next(int val) {
    ++count;
    int tail = (head + 1) % size;
    sum = sum - queue[tail] + val;
    head = (head + 1) % size;
    queue[head] = val;
    return sum * 1.0 / Math.min(size, count);
  }
}
