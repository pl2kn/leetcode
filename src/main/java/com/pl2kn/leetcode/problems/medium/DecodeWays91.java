package com.pl2kn.leetcode.problems.medium;

public class DecodeWays91 {

  public int numDecodings(String s) {
    return numDecodings(s, 0, new int[s.length()]);
  }

  private int numDecodings(String s, int i, int[] memo) {
    if (i == s.length()) {
      return 1;
    }

    if (memo[i] != 0) {
      return memo[i];
    }

    int result = 0;
    char digit = s.charAt(i);

    if (digit != '0') {
      result += numDecodings(s, i + 1, memo);
    }

    if (i + 1 < s.length() && (digit == '1' || digit == '2' && s.charAt(i + 1) <= '6')) {
      result += numDecodings(s, i + 2, memo);
    }

    return memo[i] = result;
  }
}
