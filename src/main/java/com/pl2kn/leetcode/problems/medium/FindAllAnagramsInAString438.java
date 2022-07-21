package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString438 {

  public List<Integer> findAnagrams(String s, String p) {
    Map<Character, Integer> charFrequencies = new HashMap<>();

    for (char c : p.toCharArray()) {
      charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
    }

    List<Integer> result = new ArrayList<>();
    int matchCount = 0;


    for (int left = 0, right = 0; right < s.length(); right++) {
      char rightChar = s.charAt(right);
      if (charFrequencies.containsKey(rightChar)) {
        charFrequencies.put(rightChar, charFrequencies.get(rightChar) - 1);
        if (charFrequencies.get(rightChar) == 0) {
          matchCount++;
        }
      }

      if (matchCount == charFrequencies.size()) {
        result.add(left);
      }

      if (right >= p.length() - 1) {
        char leftChar = s.charAt(left++);
        if (charFrequencies.containsKey(leftChar)) {
          if (charFrequencies.get(leftChar) == 0) {
            matchCount--;
          }
          charFrequencies.put(leftChar, charFrequencies.get(leftChar) + 1);
        }
      }
    }

    return result;
  }
}
