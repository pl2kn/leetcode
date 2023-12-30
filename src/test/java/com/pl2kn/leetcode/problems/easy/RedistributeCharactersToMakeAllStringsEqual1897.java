package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqual1897 {

  public boolean makeEqual(String[] words) {
    Map<Character, Integer> freqs = new HashMap<>();
    for (String word : words) {
      for (char c : word.toCharArray()) {
        freqs.put(c, freqs.getOrDefault(c, 0) + 1);
      }
    }

    for (int freq : freqs.values()) {
      if (freq % words.length != 0) {
        return false;
      }
    }

    return true;
  }
}
