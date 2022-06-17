package com.pl2kn.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones771 {

  public int numJewelsInStones(String jewels, String stones) {
    Set<Character> jewelTypes = new HashSet<>();
    for (char jewelType : jewels.toCharArray()) {
      jewelTypes.add(jewelType);
    }

    int jewelCount = 0;
    for (char stone : stones.toCharArray()) {
      if (jewelTypes.contains(stone)) {
        jewelCount++;
      }
    }

    return jewelCount;
  }
}
