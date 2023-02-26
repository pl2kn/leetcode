package com.pl2kn.leetcode.problems.hard;

public class EditDistance72 {

  public int minDistance(String word1, String word2) {
    if (word1 == null || word1.length() == 0) {
      return word2.length();
    }

    if (word2 == null || word2.length() == 0) {
      return word1.length();
    }

    int[][] memo = new int[word1.length()][word2.length()];
    for (int i = 0; i < word1.length(); i++) {
      for (int j = 0; j < word2.length(); j++) {
        memo[i][j] = -1;
      }
    }

    return match(word1, 0, word2, 0, memo);
  }

  private int match(String s, int i, String t, int j, int[][] memo) {
    if (i == s.length()) {
      return t.length() - j;
    }

    if (j == t.length()) {
      return s.length() - i;
    }

    if (memo[i][j] != -1) {
      return memo[i][j];
    }

    if (s.charAt(i) == t.charAt(j)) {
      memo[i][j] = match(s, i + 1, t, j + 1, memo);
    } else {
      int insert = match(s, i, t, j + 1, memo);
      int delete = match(s, i + 1, t, j, memo);
      int replace = match(s, i + 1, t, j + 1, memo);
      memo[i][j] = Math.min(insert, Math.min(delete, replace)) + 1;
    }

    return memo[i][j];
  }
}
