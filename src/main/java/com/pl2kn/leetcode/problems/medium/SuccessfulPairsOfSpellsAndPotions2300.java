package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions2300 {

  public int[] successfulPairs(int[] spells, int[] potions, long success) {
    Arrays.sort(potions);

    int n = spells.length;
    int m = potions.length;
    int[] pairs = new int[n];

    for (int i = 0; i < n; i++) {
      int left = 0;
      int right = potions.length - 1;

      while (left <= right) {
        int mid = left + (right - left) / 2;

        if ((long) potions[mid] * spells[i] < success) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }

      pairs[i] = m - left;
    }

    return pairs;
  }
}
