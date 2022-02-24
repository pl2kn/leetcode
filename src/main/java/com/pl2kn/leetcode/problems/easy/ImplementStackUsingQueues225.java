package com.pl2kn.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues225 {

  class MyStack {

    private final Queue<Integer> queue;

    public MyStack() {
      queue = new LinkedList<>();
    }

    public void push(int x) {
      queue.add(x);
      int queueSize = queue.size();
      for (int i = 0; i < queueSize - 1; i++) {
        queue.add(queue.remove());
      }
    }

    public int pop() {
      return queue.remove();
    }

    public int top() {
      return queue.peek();
    }

    public boolean empty() {
      return queue.isEmpty();
    }
  }
}
