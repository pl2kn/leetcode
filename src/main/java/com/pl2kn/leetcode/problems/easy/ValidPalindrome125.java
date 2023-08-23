package com.pl2kn.leetcode.problems.easy;

public class ValidPalindrome125 {

  public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
      if (!Character.isLetterOrDigit(s.charAt(left))) {
        left++;
      } else if (!Character.isLetterOrDigit(s.charAt(right))) {
        right--;
      } else if (Character.toLowerCase(s.charAt(left++)) != Character.toLowerCase(s.charAt(right--))) {
        return false;
      }
    }

    return true;
  }
}
