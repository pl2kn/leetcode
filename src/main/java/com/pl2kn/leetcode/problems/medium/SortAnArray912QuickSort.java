package com.pl2kn.leetcode.problems.medium;

public class SortAnArray912QuickSort {

  public int[] sortArray(int[] nums) {
    quickSort(nums, 0, nums.length - 1);
    return nums;
  }

  private void quickSort(int[] nums, int left, int right) {
    if (left < right) {
      int partition = partition(nums, left, right);
      quickSort(nums, left, partition - 1);
      quickSort(nums, partition + 1, right);
    }
  }

  private int partition(int[] nums, int left, int right) {
    int pivot = nums[left];
    int index = left;
    for (int i = index + 1; i <= right; i++) {
      if (nums[i] < pivot) {
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
