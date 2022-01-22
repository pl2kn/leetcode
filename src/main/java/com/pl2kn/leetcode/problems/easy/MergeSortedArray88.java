package com.pl2kn.leetcode.problems.easy;

public class MergeSortedArray88 {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (j >= 0 && i >= 0) {
      if (nums2[j] > nums1[i]) {
        nums1[k--] = nums2[j--];
      } else {
        nums1[k--] = nums1[i--];
      }
    }
    while (j >= 0) {
      nums1[k--] = nums2[j--];
    }
  }
}
