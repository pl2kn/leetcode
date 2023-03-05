package com.pl2kn.leetcode.problems.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JumpGameIV1345Test {

  @Test
  public void Test_Case_1() {
    JumpGameIV1345 solution = new JumpGameIV1345();
    assertEquals(3, solution.minJumps(new int[]{100, -23, -23, 404, 100, 23, 23, 23, 3, 404}));
  }
}
