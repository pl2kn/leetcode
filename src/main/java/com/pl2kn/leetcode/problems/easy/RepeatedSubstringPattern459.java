package com.pl2kn.leetcode.problems.easy;

public class RepeatedSubstringPattern459 {

  public boolean repeatedSubstringPattern(String s) {
    int length = s.length();

    for (int i = 1; i <= length / 2; i++) {
      if (length % i != 0) {
        continue;
      }

      String substring = s.substring(0, i);
      StringBuilder stringBuilder = new StringBuilder();
      for (int j = 0; j < length / i; j++) {
        stringBuilder.append(substring);
      }

      if (s.contentEquals(stringBuilder)) {
        return true;
      }
    }

    return false;
  }
}
