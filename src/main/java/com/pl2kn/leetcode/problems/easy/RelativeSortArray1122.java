package com.pl2kn.leetcode.problems.easy;

public class RelativeSortArray1122 {

  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int max = 0;
    for (int num1 : arr1) {
      max = Math.max(max, num1);
    }

    int[] counts = new int[max + 1];

    for (int num1 : arr1) {
      counts[num1]++;
    }

    int[] result = new int[arr1.length];
    int k = 0;
    for (int num2 : arr2) {
      while (counts[num2]-- > 0) {
        result[k++] = num2;
      }
    }

    for (int i = 0; i < counts.length; i++) {
      while (counts[i]-- > 0) {
        result[k++] = i;
      }
    }

    return result;
  }
}
