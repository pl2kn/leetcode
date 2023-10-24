package com.pl2kn.leetcode.problems.medium;

public class ZigzagConversion6 {

  public String convert(String s, int numRows) {
    StringBuilder[] stringBuilders = new StringBuilder[numRows];
    for (int j = 0; j < numRows; j++) {
      stringBuilders[j] = new StringBuilder();
    }

    int length = s.length();
    int i = 0;
    while (i < length) {
      for (int j = 0; j < numRows && i < length; j++) {
        stringBuilders[j].append(s.charAt(i++));
      }

      for (int j = numRows - 2; j >= 1 && i < length; j--) {
        stringBuilders[j].append(s.charAt(i++));
      }
    }

    for (int j = 1; j < numRows; j++) {
      stringBuilders[0].append(stringBuilders[j]);
    }

    return stringBuilders[0].toString();
  }
}
