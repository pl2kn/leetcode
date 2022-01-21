package com.pl2kn.leetcode.problems.easy;

public class SquaresOfASortedArray977 {

  public int[] sortedSquares(int[] nums) {
    int length = nums.length;
    int[] result = new int[length];
    int left = 0;
    int right = length - 1;
    for (int i = length - 1; i >= 0; i--) {
      int num;
      if (Math.abs(nums[left]) < nums[right]) {
        num = nums[right--];
      } else {
        num = nums[left++];
      }
      result[i] = num * num;
    }
    return result;
  }
}
