package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ArrayReader;

public class SearchInASortedArrayOfUnknownSize702 {

  public int search(ArrayReader reader, int target) {
    int left = 0;
    int right = 1;

    while (reader.get(right) < target) {
      right *= 2;
    }

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (reader.get(mid) == target) {
        return mid;
      }
      if (reader.get(mid) < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
