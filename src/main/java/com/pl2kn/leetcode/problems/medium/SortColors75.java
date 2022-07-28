package com.pl2kn.leetcode.problems.medium;

public class SortColors75 {

  public void sortColors(int[] nums) {
    int n = nums.length;
    int left = 0;
    int right = n - 1;
    int i = 0;

    while (i <= right) {
      if (nums[i] == 0) {
        swap(nums, i++, left++);
      } else if (nums[i] == 2) {
        swap(nums, i, right--);
      } else {
        i++;
      }
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
