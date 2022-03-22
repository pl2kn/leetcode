package com.pl2kn.leetcode.problems.medium;

public class FindFirstAndLastPositionOfElementInSortedArray34 {

  public int[] searchRange(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return new int[]{-1, -1};
    }
    int[] result = new int[2];
    result[0] = findLeftIndex(nums, target);
    result[1] = findRightIndex(nums, target);
    return result;
  }

  private int findLeftIndex(int[] nums, int target) {
    int result = -1;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        result = mid;
      }
      if (nums[mid] >= target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return result;
  }

  private int findRightIndex(int[] nums, int target) {
    int result = -1;
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] == target) {
        result = mid;
      }
      if (nums[mid] <= target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return result;
  }
}
