package com.pl2kn.leetcode.problems.medium;

public class KthLargestElementInAnArray215QuickSelect {

  public int findKthLargest(int[] nums, int k) {
    int left = 0;
    int right = nums.length - 1;
    k--;

    while (left <= right) {
      int index = partition(nums, left, right);

      if (index == k) {
        break;
      }

      if (index > k) {
        right = index - 1;
      } else {
        left = index + 1;
      }
    }

    return nums[k];
  }

  private int partition(int[] nums, int left, int right) {
    int pivot = nums[left];
    int index = left;

    for (int i = left + 1; i <= right; i++) {
      if (nums[i] > pivot) {
        swap(nums, i, ++index);
      }
    }

    swap(nums, left, index);

    return index;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
