package com.pl2kn.leetcode.problems.hard;

public class FindInMountainArray1095 {

  public int findInMountainArray(int target, MountainArray mountainArr) {
    int left = 0;
    int right = mountainArr.length() - 1;
    while (left < right) {
      int mid = left + (right - left) / 2;

      if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    int peak = left;

    left = 0;
    right = peak;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (mountainArr.get(mid) == target) {
        return mid;
      }

      if (mountainArr.get(mid) > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    left = peak;
    right = mountainArr.length() - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (mountainArr.get(mid) == target) {
        return mid;
      }

      if (mountainArr.get(mid) > target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }

  interface MountainArray {

    int get(int index);

    int length();
  }
}
