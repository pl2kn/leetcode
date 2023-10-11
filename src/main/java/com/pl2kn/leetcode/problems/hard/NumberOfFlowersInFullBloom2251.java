package com.pl2kn.leetcode.problems.hard;

import java.util.Arrays;

public class NumberOfFlowersInFullBloom2251 {

  public int[] fullBloomFlowers(int[][] flowers, int[] people) {
    int flowerCount = flowers.length;
    int[] starts = new int[flowerCount];
    int[] ends = new int[flowerCount];
    for (int i = 0; i < flowerCount; i++) {
      starts[i] = flowers[i][0];
      ends[i] = flowers[i][1] + 1;
    }

    Arrays.sort(starts);
    Arrays.sort(ends);

    int peopleCount = people.length;
    int[] result = new int[peopleCount];
    for (int i = 0; i < peopleCount; i++) {
      result[i] = binarySearch(starts, people[i]) - binarySearch(ends, people[i]);
    }

    return result;
  }

  private int binarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (target < nums[mid]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
