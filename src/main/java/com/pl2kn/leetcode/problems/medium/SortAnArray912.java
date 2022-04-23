package com.pl2kn.leetcode.problems.medium;

public class SortAnArray912 {

  public int[] sortArray(int[] nums) {
    if (nums == null || nums.length == 0) {
      return nums;
    }

    sort(nums, 0, nums.length - 1);

    return nums;
  }

  private void sort(int[] nums, int left, int right) {
    if (right <= left) {
      return;
    }

    int mid = left + (right - left) / 2;
    sort(nums, left, mid);
    sort(nums, mid + 1, right);
    merge(nums, left, right, mid);
  }

  private void merge(int[] nums, int left, int right, int mid) {
    int[] tmp = new int[right - left + 1];

    int i = left;
    int j = mid + 1;
    for (int k = 0; k < tmp.length; k++) {
      if (i > mid) {
        tmp[k] = nums[j++];
      } else if (j > right) {
        tmp[k] = nums[i++];
      } else if (nums[i] < nums[j]) {
        tmp[k] = nums[i++];
      } else {
        tmp[k] = nums[j++];
      }
    }

    int m = 0;
    for (int k = left; k <= right; k++) {
      nums[k] = tmp[m++];
    }
  }
}
