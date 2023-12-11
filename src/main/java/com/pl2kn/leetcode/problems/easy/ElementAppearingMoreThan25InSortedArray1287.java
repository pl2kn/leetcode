package com.pl2kn.leetcode.problems.easy;

public class ElementAppearingMoreThan25InSortedArray1287 {

  public int findSpecialInteger(int[] arr) {
    int n = arr.length;
    int[] candidates = new int[]{arr[n / 4], arr[n / 2], arr[3 * n / 4]};
    int target = n / 4;

    for (int candidate : candidates) {
      int left = getBound(arr, candidate, false);
      int right = getBound(arr, candidate, true);

      if (right - left + 1 > target) {
        return candidate;
      }
    }

    return -1;
  }

  private int getBound(int[] arr, int target, boolean isRight) {
    int left = 0;
    int right = arr.length - 1;
    int index = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        index = mid;

        if (isRight) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return index;
  }
}
