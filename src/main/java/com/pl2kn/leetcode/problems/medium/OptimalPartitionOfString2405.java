package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class OptimalPartitionOfString2405 {

  public int partitionString(String s) {
    int[] lastSeen = new int[26];
    Arrays.fill(lastSeen, -1);
    int count = 1;
    int start = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (lastSeen[c - 'a'] >= start) {
        count++;
        start = i;
      }
      lastSeen[c - 'a'] = i;
    }

    return count;
  }
}
