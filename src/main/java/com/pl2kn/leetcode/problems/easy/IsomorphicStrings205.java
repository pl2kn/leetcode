package com.pl2kn.leetcode.problems.easy;

import java.util.Arrays;

public class IsomorphicStrings205 {

  public boolean isIsomorphic(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] sMap = new int[256];
    Arrays.fill(sMap, -1);
    int[] tMap = new int[256];
    Arrays.fill(tMap, -1);

    for (int i = 0; i < s.length(); i++) {
      int sChar = s.charAt(i);
      int tChar = t.charAt(i);

      if (sMap[sChar] == -1 && tMap[tChar] == -1) {
        sMap[sChar] = tChar;
        tMap[tChar] = sChar;
      } else if (sMap[sChar] != tChar || tMap[tChar] != sChar) {
        return false;
      }
    }

    return true;
  }
}
