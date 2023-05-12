package com.pl2kn.leetcode.problems.medium;

public class UncrossedLines1035 {

  public int maxUncrossedLines(int[] nums1, int[] nums2) {
    return maxUncrossedLines(nums1, nums2, 0, 0, new Integer[nums1.length][nums2.length]);
  }

  public int maxUncrossedLines(int[] nums1, int[] nums2, int i, int j, Integer[][] memo) {
    if (i == nums1.length || j == nums2.length) {
      return 0;
    }

    if (memo[i][j] != null) {
      return memo[i][j];
    }

    if (nums1[i] == nums2[j]) {
      return memo[i][j] = 1 + maxUncrossedLines(nums1, nums2, i + 1, j + 1, memo);
    }

    return memo[i][j] = Math.max(
        maxUncrossedLines(nums1, nums2, i + 1, j, memo),
        maxUncrossedLines(nums1, nums2, i, j + 1, memo)
    );
  }
}
