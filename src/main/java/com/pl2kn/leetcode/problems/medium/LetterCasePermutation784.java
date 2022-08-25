package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784 {

  public List<String> letterCasePermutation(String s) {
    List<String> permutations = new ArrayList<>();
    permutations.add(s);

    for (int i = 0; i < s.length(); i++) {
      if (Character.isLetter(s.charAt(i))) {
        int n = permutations.size();
        for (int j = 0; j < n; j++) {
          char[] chars = permutations.get(j).toCharArray();
          char c = chars[i];

          chars[i] = Character.isLowerCase(c)
              ? Character.toUpperCase(c)
              : Character.toLowerCase(c);

          permutations.add(String.valueOf(chars));
        }
      }
    }

    return permutations;
  }
}
