package com.pl2kn.leetcode.problems.medium;

public class GetEqualSubstringsWithinBudget1208 {

  public int equalSubstring(String s, String t, int maxCost) {
    int left = 0;
    int cost = 0;
    int max = 0;
    for (int right = 0; right < s.length(); right++) {
      cost += Math.abs(s.charAt(right) - t.charAt(right));
      while (cost > maxCost) {
        cost -= Math.abs(s.charAt(left) - t.charAt(left));
        left++;
      }
      max = Math.max(max, right - left + 1);
    }
    return max;
  }
}
