package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams49 {

  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String string : strs) {
      String key = getKey(string);
      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(string);
    }

    return new ArrayList<>(map.values());
  }

  private String getKey(String string) {
    char[] chars = string.toCharArray();

    Arrays.sort(chars);

    return new String(chars);
  }
}
