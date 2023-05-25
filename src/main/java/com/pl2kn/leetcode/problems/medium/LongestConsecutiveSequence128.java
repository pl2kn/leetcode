package com.pl2kn.leetcode.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence128 {

  public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }

    int longestSeq = 0;
    for (int num : nums) {
      if (set.contains(num - 1)) {
        continue;
      }

      int currentNum = num;
      int currentSeq = 1;

      while (set.contains(currentNum + 1)) {
        currentNum++;
        currentSeq++;
      }

      longestSeq = Math.max(longestSeq, currentSeq);
    }

    return longestSeq;
  }
}
