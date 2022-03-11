package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KThSymbolInGrammar779Test {

  @Test
  public void Two_Two_Test() {
    KThSymbolInGrammar779 solution = new KThSymbolInGrammar779();
    assertEquals(1, solution.kthGrammar(2, 2));
  }

  @Test
  public void Three_Two_Test() {
    KThSymbolInGrammar779 solution = new KThSymbolInGrammar779();
    assertEquals(1, solution.kthGrammar(3, 2));
  }
}
