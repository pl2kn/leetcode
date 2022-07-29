package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {

  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);

    return kSum(nums, 0, 4, target);
  }

  private List<List<Integer>> kSum(int[] nums, int start, int k, long target) {
    int n = nums.length;
    List<List<Integer>> result = new ArrayList<>();

    if (k == 2) {
      int left = start;
      int right = n - 1;

      while (left < right) {
        int sum = nums[left] + nums[right];

        if (sum == target) {
          List<Integer> group = new ArrayList<>();
          group.add(nums[left++]);
          group.add(nums[right--]);

          result.add(group);

          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }

          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    } else {
      for (int i = start; i < n - k + 1; i++) {
        if (i > start && nums[i] == nums[i - 1]) {
          continue;
        }

        List<List<Integer>> nextResult = kSum(nums, i + 1, k - 1, target - nums[i]);
        for (List<Integer> r : nextResult) {
          r.add(0, nums[i]);
        }

        result.addAll(nextResult);
      }

    }

    return result;
  }
}
