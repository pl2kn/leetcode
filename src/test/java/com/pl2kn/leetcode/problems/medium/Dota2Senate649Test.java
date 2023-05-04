package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Dota2Senate649Test {

  @Test
  public void Test_Case_1() {
    Dota2Senate649 solution = new Dota2Senate649();
    assertEquals("Radiant", solution.predictPartyVictory("RD"));
  }

  @Test
  public void Test_Case_2() {
    Dota2Senate649 solution = new Dota2Senate649();
    assertEquals("Dire", solution.predictPartyVictory("RDD"));
  }
}