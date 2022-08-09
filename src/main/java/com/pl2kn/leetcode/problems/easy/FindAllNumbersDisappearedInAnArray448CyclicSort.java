package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448CyclicSort {

  public List<Integer> findDisappearedNumbers(int[] nums) {
    int n = nums.length;
    int i = 0;
    while (i < n) {
      int j = nums[i] - 1;
      if (nums[i] != nums[j]) {
        swap(nums, i, j);
      } else {
        i++;
      }
    }

    List<Integer> result = new ArrayList<>();
    for (i = 0; i < n; i++) {
      if (nums[i] != i + 1) {
        result.add(i + 1);
      }
    }

    return result;
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
