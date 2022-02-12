package com.pl2kn.leetcode.problems.easy.movingaveragefromdatastream356;

public class MovingAverage {

  private int head;

  private int sum;

  private int size;

  private final int[] queue;

  public MovingAverage(int size) {
    queue = new int[size];
    size = 0;
    head = 0;
  }

  public double next(int val) {
    if (size < queue.length) {
      size++;
    }
    sum -= queue[head];
    sum += val;
    queue[head] = val;
    head = (head + 1) % queue.length;
    return (double) sum / size;
  }
}
