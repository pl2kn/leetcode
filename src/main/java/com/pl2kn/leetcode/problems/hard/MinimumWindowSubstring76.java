package com.pl2kn.leetcode.problems.hard;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring76 {

  public String minWindow(String s, String t) {
    Map<Character, Integer> charFrequencies = new HashMap<>();
    for (char c : t.toCharArray()) {
      charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
    }

    int minLength = s.length() + 1;
    int minSubstringStart = 0;
    int matchCount = 0;

    for (int left = 0, right = 0; right < s.length(); right++) {
      char rightChar = s.charAt(right);
      if (charFrequencies.containsKey(rightChar)) {
        charFrequencies.put(rightChar, charFrequencies.get(rightChar) - 1);
        if (charFrequencies.get(rightChar) >= 0) {
          matchCount++;
        }
      }

      while (matchCount == t.length()) {
        if (right - left + 1 < minLength) {
          minLength = right - left + 1;
          minSubstringStart = left;
        }

        char leftChar = s.charAt(left++);
        if (charFrequencies.containsKey(leftChar)) {
          if (charFrequencies.get(leftChar) == 0) {
            matchCount--;
          }

          charFrequencies.put(leftChar, charFrequencies.get(leftChar) + 1);
        }
      }
    }

    return minLength > s.length() ? "" : s.substring(minSubstringStart, minSubstringStart + minLength);
  }
}
