package com.pl2kn.leetcode.problems.medium;

public class GetEqualSubstringsWithinBudget1208 {

  public int equalSubstring(String s, String t, int maxCost) {
    int left = 0;
    int right = 0;
    while (right < s.length()) {
      maxCost -= Math.abs(s.charAt(right) - t.charAt(right++));
      if (maxCost < 0) {
        maxCost += Math.abs(s.charAt(left) - t.charAt(left++));
      }
    }
    return right - left;
  }
}
