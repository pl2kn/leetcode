package com.pl2kn.leetcode.problems.hard;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum239 {

  public int[] maxSlidingWindow(int[] nums, int k) {
    Deque<Integer> deque = new ArrayDeque<>();

    for (int i = 0; i < k; i++) {
      while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
        deque.removeLast();
      }
      deque.add(i);
    }

    List<Integer> result = new ArrayList<>();
    result.add(nums[deque.peekFirst()]);

    for (int i = k; i < nums.length; i++) {
      if (deque.peekFirst() == i - k) {
        deque.removeFirst();
      }

      while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
        deque.removeLast();
      }
      deque.add(i);
      result.add(nums[deque.peekFirst()]);
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}
