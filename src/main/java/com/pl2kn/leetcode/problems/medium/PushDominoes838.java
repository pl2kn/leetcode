package com.pl2kn.leetcode.problems.medium;

public class PushDominoes838 {

  public String pushDominoes(String dominoes) {
    char[] chars = dominoes.toCharArray();
    int right = -1;
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == 'L') {
        if (right == -1) {
          for (int j = i - 1; j >= 0 && chars[j] == '.'; j--) {
            chars[j] = 'L';
          }
        } else {
          for (int j = right + 1, k = i - 1; j < k; j++, k--) {
            chars[j] = 'R';
            chars[k] = 'L';
          }
          right = -1;
        }
      } else if (chars[i] == 'R') {
        if (right != -1) {
          for (int j = right + 1; j < i; ++j) chars[j] = 'R';
        }
        right = i;
      }
    }

    if (right != -1) {
      for (int j = right + 1; j < chars.length; ++j) chars[j] = 'R';
    }

    return new String(chars);
  }
}
