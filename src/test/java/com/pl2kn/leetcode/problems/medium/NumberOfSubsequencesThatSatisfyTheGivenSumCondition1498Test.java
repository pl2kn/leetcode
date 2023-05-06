package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498Test {

  @Test
  public void Test_Case_1() {
    NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498 solution = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498();
    assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
  }

  @Test
  public void Test_Case_2() {
    NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498 solution = new NumberOfSubsequencesThatSatisfyTheGivenSumCondition1498();
    assertEquals(4, solution.numSubseq(new int[]{3,3,6,8}, 10));
  }
}