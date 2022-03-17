package com.pl2kn.leetcode.problems.medium;

public class SearchInRotatedSortedArray33TwoPass {

  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return -1;
    }
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] > nums[right]) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    int pivot = left;
    left = 0;
    right = nums.length - 1;
    if (target >= nums[pivot] && target <= nums[right]) {
      left = pivot;
    } else {
      right = pivot;
    }
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (target == nums[mid]) {
        return mid;
      }
      if (target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }
}
