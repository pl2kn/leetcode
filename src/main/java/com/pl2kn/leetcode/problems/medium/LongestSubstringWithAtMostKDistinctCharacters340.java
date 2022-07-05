package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacters340 {

  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    Map<Character, Integer> map = new HashMap<>();
    int result = 0;

    for (int left = 0, right = 0; right < s.length(); right++) {
      char c = s.charAt(right);

      map.put(c, map.getOrDefault(c, 0) + 1);

      while (map.size() > k) {
        char leftC = s.charAt(left++);
        map.put(leftC, map.get(leftC) - 1);
        if (map.get(leftC) == 0) {
          map.remove(leftC);
        }
      }

      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}
