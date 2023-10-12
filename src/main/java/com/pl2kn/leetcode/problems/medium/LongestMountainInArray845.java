package com.pl2kn.leetcode.problems.medium;

public class LongestMountainInArray845 {

  public int longestMountain(int[] arr) {
    if (arr.length < 3) {
      return 0;
    }

    int n = arr.length;
    int result = 0;

    for (int i = 1; i < n; i++) {
      int left = i;
      int right = i;
      if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
        while (left > 0 && arr[left] > arr[left - 1]) {
          left--;
        }

        while (right < n - 1 && arr[right] > arr[right + 1]) {
          right++;
        }

        if (right - left + 1 >= 3) {
          result = Math.max(result, right - left + 1);
        }

        i = right;
      }
    }

    return result;
  }
}
