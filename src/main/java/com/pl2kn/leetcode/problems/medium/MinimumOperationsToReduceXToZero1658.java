package com.pl2kn.leetcode.problems.medium;

public class MinimumOperationsToReduceXToZero1658 {

  public int minOperations(int[] nums, int x) {
    int target = -x;
    for (int num : nums) {
      target += num;
    }

    int n = nums.length;

    if (target == 0) {
      return n;
    }

    int currentSum = 0;
    int maxLength = 0;
    for (int left = 0, right = 0; right < n; right++) {
      currentSum += nums[right];;

      while (left <= right && currentSum > target) {
        currentSum -= nums[left++];
      }

      if (currentSum == target) {
        maxLength = Math.max(maxLength, right - left + 1);
      }
    }

    return maxLength != 0 ? n - maxLength : -1;
  }
}
