package com.pl2kn.leetcode.problems.easy;

public class KthMissingPositiveNumber1539 {

  public int findKthPositive(int[] arr, int k) {
    int left = 0;
    int right = arr.length;

    while (left < right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] - (mid + 1) < k) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }

    return left + k;
  }
}
