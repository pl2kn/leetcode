package com.pl2kn.leetcode.problems.easy;

public class DuplicateZeros1089 {

  public void duplicateZeros(int[] arr) {
    int length = arr.length;
    for (int i = 0; i < length - 1; i++) {
      if (arr[i] == 0) {
        for (int j = length - 1; j > i; j--) {
          arr[j] = arr[j - 1];
        }
        arr[++i] = 0;
      }
    }
  }
}
