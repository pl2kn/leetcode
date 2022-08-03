package com.pl2kn.leetcode.problems.medium;

public class CircularArrayLoop457 {

  public boolean circularArrayLoop(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int slow = i;
      int fast = i;

      do {
        slow = getNextIndex(nums, slow);
        fast = getNextIndex(nums, fast);
        if (fast != -1) {
          fast = getNextIndex(nums, fast);
        }
      } while (slow != - 1 && fast != -1 && slow != fast);

      if (slow != -1 && slow == fast) {
        return true;
      }
    }

    return false;
  }

  private int getNextIndex(int[] nums, int currentIndex) {
    int n = nums.length;

    int nextIndex = (currentIndex + nums[currentIndex]) % n;
    if (nextIndex < 0) {
      nextIndex += n;
    }

    if (nextIndex == currentIndex || nums[currentIndex] * nums[nextIndex] < 0) {
      return - 1;
    }

    return nextIndex;
  }
}
