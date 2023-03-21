package com.pl2kn.leetcode.problems.medium;

public class NumberOfZeroFilledSubarrays2348 {

  public long zeroFilledSubarray(int[] nums) {
    long subarrayCount = 0;
    int zeroCount = 0;
    for (int num : nums) {
      if (num == 0) {
        subarrayCount += ++zeroCount;
      } else {
        zeroCount = 0;
      }
    }
    return subarrayCount;
  }
}
