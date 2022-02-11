package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseWordsInAString151 {

  public String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    Queue<Integer> queue = new ArrayDeque<>();
    int length = s.length();
    int wordStart;
    int wordEnd = length - 1;
    while (wordEnd >= 0) {
      while (wordEnd >= 0 && s.charAt(wordEnd) == ' ') {
        wordEnd--;
      }
      wordStart = wordEnd;
      while (wordStart >= 0 && s.charAt(wordStart) != ' ') {
        wordStart--;
      }
      if (wordEnd >= 0) {
        if (!result.toString().equals("")) {
          result.append(" ");
        }
        result.append(s, wordStart + 1, wordEnd + 1);
      }
      wordEnd = wordStart;
    }
    return result.toString();
  }
}
