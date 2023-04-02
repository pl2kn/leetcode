package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuccessfulPairsOfSpellsAndPotions2300Test {

  @Test
  public void Test_Case_1() {
    SuccessfulPairsOfSpellsAndPotions2300 solution = new SuccessfulPairsOfSpellsAndPotions2300();
    assertArrayEquals(
        new int[]{4, 0, 3},
        solution.successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7)
    );
  }
}