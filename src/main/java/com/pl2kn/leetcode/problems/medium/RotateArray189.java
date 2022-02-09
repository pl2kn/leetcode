package com.pl2kn.leetcode.problems.medium;

public class RotateArray189 {

  public void rotate(int[] nums, int k) {
    int length = nums.length;
    k = k % length;
    int count = 0;
    for (int i = 0; count < length; i++) {
      int num = nums[i];
      int j = i;
      do {
        j = (j + k) % length;
        int tmp = nums[j];
        nums[j] = num;
        num = tmp;
        count++;
      } while (j != i);
    }
  }
}

