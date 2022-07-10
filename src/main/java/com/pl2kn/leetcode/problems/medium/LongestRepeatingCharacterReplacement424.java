package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement424 {

  public int characterReplacement(String s, int k) {
    int result = 0;
    int maxCount = 0;
    Map<Character, Integer> frequencies = new HashMap<>();

    for (int left = 0, right = 0; right < s.length(); right++) {
      char rightChat = s.charAt(right);
      frequencies.put(rightChat, frequencies.getOrDefault(rightChat, 0) + 1);
      maxCount = Math.max(maxCount, frequencies.get(rightChat));

      while (right - left + 1 - maxCount > k) {
        char leftChar = s.charAt(left++);
        frequencies.put(leftChar, frequencies.get(leftChar) - 1);
      }

      maxCount = 0;
      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}
