package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique1647 {

  public int minDeletions(String s) {
    Map<Character, Integer> freqs = new HashMap<>();
    for (char letter : s.toCharArray()) {
      freqs.put(letter, freqs.getOrDefault(letter, 0) + 1);
    }

    Set<Integer> uniqueFreqs = new HashSet<>();
    int deletions = 0;
    for (int freq : freqs.values()) {
      while (uniqueFreqs.contains(freq)) {
        freq--;
        deletions++;
      }

      if (freq > 0) {
        uniqueFreqs.add(freq);
      }
    }

    return deletions;
  }
}
