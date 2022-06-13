package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupShiftedStrings249 {

  public List<List<String>> groupStrings(String[] strings) {
    Map<String, List<String>> map = new HashMap<>();

    for (String string : strings) {
      String key = getHashKey(string);

      if (!map.containsKey(key)) {
        map.put(key, new ArrayList<>());
      }

      map.get(key).add(string);
    }

    return new ArrayList<>(map.values());
  }

  private String getHashKey(String string) {
    char[] chars = string.toCharArray();
    int shift = chars[0] - 'a';

    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char)((string.charAt(i) - shift + 26) % 26);
    }

    return new String(chars);
  }
}
