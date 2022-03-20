package com.pl2kn.leetcode.problems.easy;

abstract public class FirstBadVersion278 {

  public int firstBadVersion(int n) {
    int left = 0;
    int right = n;
    while (left < right) {
      int mid = left + (right - left) / 2;
      boolean result = isBadVersion(mid);
      if (result) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }
    return right;
  }

  abstract boolean isBadVersion(int version);
}
