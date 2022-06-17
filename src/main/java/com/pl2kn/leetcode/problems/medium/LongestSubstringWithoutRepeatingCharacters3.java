package com.pl2kn.leetcode.problems.medium;

public class LongestSubstringWithoutRepeatingCharacters3 {

  public int lengthOfLongestSubstring(String s) {
    int[] counts = new int[128];
    int length = s.length();
    int right = 0;
    int left = 0;
    int result = 0;

    while (right < length) {
      char rightChar = s.charAt(right);
      counts[rightChar]++;

      while (counts[left] > 1) {
        char leftChar = s.charAt(left);
        counts[leftChar]--;
        left++;
      }

      result = Math.max(result, right - left + 1);
      right++;
    }

    return result;
  }
}
