package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3HashMap {

  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> map = new HashMap<>();
    int result = 0;

    for (int left = 0, right = 0; right < s.length(); right++) {
      char c = s.charAt(right);
      if (map.containsKey(c)) {
        left = Math.max(map.get(c), left);
      }

      result = Math.max(result, right - left + 1);
      map.put(c, right + 1);
    }

    return result;
  }
}
