package com.pl2kn.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class OptimalPartitionOfString2405 {

  public int partitionString(String s) {
    int count = 0;
    Set<Character> chars = new HashSet<>();
    for (char c : s.toCharArray()) {
      if (chars.contains(c)) {
        count++;
        chars.clear();
      }
      chars.add(c);
    }

    return count + (chars.size() > 0 ? 1 : 0);
  }
}
