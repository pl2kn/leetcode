package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcelSheetColumnTitle168Test {

  @Test
  public void Test_Case_1() {
    ExcelSheetColumnTitle168 solution = new ExcelSheetColumnTitle168();
    assertEquals("A", solution.convertToTitle(1));
  }

  @Test
  public void Test_Case_2() {
    ExcelSheetColumnTitle168 solution = new ExcelSheetColumnTitle168();
    assertEquals("AB", solution.convertToTitle(28));
  }

  @Test
  public void Test_Case_3() {
    ExcelSheetColumnTitle168 solution = new ExcelSheetColumnTitle168();
    assertEquals("ZY", solution.convertToTitle(701));
  }
}