package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies1431 {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int maxCandyCount = 0;
    for (int candyCount : candies) {
      maxCandyCount = Math.max(maxCandyCount, candyCount);
    }

    List<Boolean> result = new ArrayList<>();
    for (int candyCount : candies) {
      result.add(candyCount + extraCandies >= maxCandyCount);
    }

    return result;
  }
}
