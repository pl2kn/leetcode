package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AddBinary67Test {

  @Test
  public void Same_Length_Numbers_Test() {
    AddBinary67 solution = new AddBinary67();
    assertEquals("10101", solution.addBinary("1010", "1011"));
  }

  @Test
  public void Different_Length_Numbers_Test() {
    AddBinary67 solution = new AddBinary67();
    assertEquals("1000001", solution.addBinary("1", "1000000"));
  }
}
