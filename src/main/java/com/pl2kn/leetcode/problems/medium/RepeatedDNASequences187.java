package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences187 {

  public List<String> findRepeatedDnaSequences(String s) {
    Set<String> seen = new HashSet<>();
    Set<String> result = new HashSet<>();

    for (int i = 0; i < s.length() - 9; i++) {
      String sequence = s.substring(i, i + 10);
      if (seen.contains(sequence)) {
        result.add(sequence);
      } else {
        seen.add(sequence);
      }
    }

    return new ArrayList<>(result);
  }
}
