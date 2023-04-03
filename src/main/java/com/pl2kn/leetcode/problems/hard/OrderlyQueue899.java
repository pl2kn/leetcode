package com.pl2kn.leetcode.problems.hard;

import java.util.Arrays;

public class OrderlyQueue899 {

  public String orderlyQueue(String s, int k) {
    if (k > 1) {
      char[] chars = s.toCharArray();
      Arrays.sort(chars);
      return new String(chars);
    }

    String result = s;
    for (int i = 0; i < s.length(); i++) {
      s = s.substring(1) + s.charAt(0);
      result = result.compareTo(s) < 0 ? result : s;
    }

    return result;
  }
}
