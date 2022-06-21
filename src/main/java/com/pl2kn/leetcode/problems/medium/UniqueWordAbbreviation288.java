package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordAbbreviation288 {

  class ValidWordAbbr {

    private final Map<String, Set<String>> map;

    public ValidWordAbbr(String[] dictionary) {
      map = new HashMap<>();
      for (String word : dictionary) {
        String key = getKey(word);

        if (!map.containsKey(key)) {
          map.put(key, new HashSet<>());
        }

        map.get(key).add(word);
      }
    }

    public boolean isUnique(String word) {
      String key = getKey(word);

      if (!map.containsKey(key)) {
        return true;
      }

      for (String string : map.get(key)) {
        if (!string.equals(word)) {
          return false;
        }
      }

      return true;
    }

    private String getKey(String word) {
      int length = word.length();

      if (length <= 2) {
        return word;
      }

      return word.charAt(0) + String.valueOf(length - 2) + word.charAt(length - 1);
    }
  }
}
