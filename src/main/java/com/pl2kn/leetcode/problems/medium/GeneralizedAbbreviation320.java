package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class GeneralizedAbbreviation320 {

  public List<String> generateAbbreviations(String word) {
    List<String> result = new ArrayList<>();

    backtrack(result, new StringBuilder(), word, 0, 0);

    return result;
  }

  private void backtrack(List<String> result, StringBuilder builder, String word, int i, int k) {
    int len = builder.length();
    if (i == word.length()) {
      if (k > 0) {
        builder.append(k);
      }

      result.add(builder.toString());
    } else {
      backtrack(result, builder, word, i + 1, k + 1);

      if (k > 0) {
        builder.append(k);
      }

      builder.append(word.charAt(i));
      backtrack(result, builder, word, i + 1, 0);
    }

    builder.setLength(len);
  }
}
