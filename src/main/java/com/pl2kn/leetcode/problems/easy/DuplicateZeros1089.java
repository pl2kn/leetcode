package com.pl2kn.leetcode.problems.easy;

public class DuplicateZeros1089 {

  public void duplicateZeros(int[] arr) {
    int zeroCount = 0;
    for (int j : arr) {
      if (j == 0) {
        zeroCount++;
      }
    }
    int length = arr.length;
    int i = length - 1;
    int j = length + zeroCount - 1;
    while (i < j) {
      if (arr[i] != 0) {
        if (j < length) {
          arr[j] = arr[i];
        }
      } else {
        if (j < length) {
          arr[j] = arr[i];
        }
        j--;
        if (j < length) {
          arr[j] = arr[i];
        }
      }
      i--;
      j--;
    }
  }
}
