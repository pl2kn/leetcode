package com.pl2kn.leetcode.explore.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesTest {

  @Test
  public void One_Sequence_In_Beginning_Test() {
    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 0}));
  }

  @Test
  public void One_Sequence_In_Middle_Test() {
    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0}));
  }

  @Test
  public void One_Sequence_In_End_Test() {
    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1}));
  }

  @Test
  public void One_Long_First_Test() {
    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 0}));
  }

  @Test
  public void One_Long_Last_Test() {
    MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
    assertEquals(4, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}));
  }
}
