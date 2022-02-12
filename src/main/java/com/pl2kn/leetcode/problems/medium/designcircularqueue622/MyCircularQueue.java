package com.pl2kn.leetcode.problems.medium.designcircularqueue622;

public class MyCircularQueue {

  private int size;

  private int head;

  private int capacity;

  private final int[] queue;

  public MyCircularQueue(int k) {
    capacity = k;
    queue = new int[k];
    size = 0;
    head = 0;
  }

  public boolean enQueue(int value) {
    if (isFull()) {
      return false;
    }
    queue[(head + size) % capacity] = value;
    size++;
    return true;
  }

  public boolean deQueue() {
    if (isEmpty()) {
      return false;
    }
    head = (head + 1) % capacity;
    size--;
    return true;
  }

  public int Front() {
    return isEmpty() ? -1 : queue[head];
  }

  public int Rear() {
    return isEmpty() ? -1 : queue[(head + size - 1) % capacity];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public boolean isFull() {
    return size == capacity;
  }
}
