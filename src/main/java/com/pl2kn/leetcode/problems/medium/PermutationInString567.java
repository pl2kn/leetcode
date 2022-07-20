package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString567 {

  public boolean checkInclusion(String s1, String s2) {
    Map<Character, Integer> charFreq = new HashMap<>();
    for (char c : s1.toCharArray()) {
      charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
    }

    int matchCount = 0;

    for (int left = 0, right = 0; right < s2.length(); right++) {
      char rightChar = s2.charAt(right);
      if (charFreq.containsKey(rightChar)) {
        charFreq.put(rightChar, charFreq.get(rightChar) - 1);
        if (charFreq.get(rightChar) == 0) {
          matchCount++;
        }
      }

      if (charFreq.size() == matchCount) {
        return true;
      }

      if (right >= s1.length() - 1) {
        char leftChar = s2.charAt(left++);
        if (charFreq.containsKey(leftChar)) {
          if (charFreq.get(leftChar) == 0) {
            matchCount--;
          }
          charFreq.put(leftChar, charFreq.get(leftChar) + 1);
        }
      }
    }

    return false;
  }
}
