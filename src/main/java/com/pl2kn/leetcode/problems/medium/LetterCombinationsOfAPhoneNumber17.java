package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber17 {

  private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();

    if (digits == null || digits.length() == 0) {
      return result;
    }

    dfs("", digits, 0, result);

    return result;
  }

  private void dfs(String prefix, String digits, int current, List<String> result) {
    if (current == digits.length()) {
      result.add(prefix);
    } else {
      String letters = KEYS[digits.charAt(current) - '0'];
      for (int i = 0; i < letters.length(); i++) {
        dfs(prefix + letters.charAt(i), digits, current + 1, result);
      }
    }
  }
}
