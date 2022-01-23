package com.pl2kn.leetcode.problems.easy;

public class ReplaceElementsWithGreatestElementOnRightSide1299 {

  public int[] replaceElements(int[] arr) {
    int max = -1;
    for (int i = arr.length - 1; i >= 0; i--) {
      max = Math.max(arr[i], arr[i] = max);
    }
    return arr;
  }
}
