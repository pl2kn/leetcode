package com.pl2kn.leetcode.problems.medium;

public class TwoSumII167 {

  public int[] twoSum(int[] numbers, int target) {
    int length = numbers.length;
    int left = 0;
    int right = length - 1;
    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum > target) {
        right--;
      } else if (sum < target) {
        left++;
      } else {
        return new int[]{left + 1, right + 1};
      }
    }
    return null;
  }
}
