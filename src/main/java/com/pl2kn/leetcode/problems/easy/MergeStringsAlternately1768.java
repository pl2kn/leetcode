package com.pl2kn.leetcode.problems.easy;

public class MergeStringsAlternately1768 {

  public String mergeAlternately(String word1, String word2) {
    int word1Length = word1.length();
    int word2Length = word2.length();
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < Math.max(word1Length, word2Length); i++) {
      if (i < word1Length) {
        stringBuilder.append(word1.charAt(i));
      }

      if (i < word2Length) {
        stringBuilder.append(word2.charAt(i));
      }
    }

    return stringBuilder.toString();
  }
}
