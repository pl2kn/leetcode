package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MajorityElementII229Test {

  @Test
  public void Test_Case_86() {
    MajorityElementII229 solution = new MajorityElementII229();
    assertArrayEquals(new Integer[]{1},
        solution.majorityElement(new int[]{2, 1, 1, 3, 1, 4, 5, 6}).toArray());
  }
}