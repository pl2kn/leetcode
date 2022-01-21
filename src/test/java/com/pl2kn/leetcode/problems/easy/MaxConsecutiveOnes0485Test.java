package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.easy.MaxConsecutiveOnes0485;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnes0485Test {

  @Test
  public void One_Sequence_In_Beginning_Test() {
    MaxConsecutiveOnes0485 mco = new MaxConsecutiveOnes0485();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 0}));
  }

  @Test
  public void One_Sequence_In_Middle_Test() {
    MaxConsecutiveOnes0485 mco = new MaxConsecutiveOnes0485();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0}));
  }

  @Test
  public void One_Sequence_In_End_Test() {
    MaxConsecutiveOnes0485 mco = new MaxConsecutiveOnes0485();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1}));
  }

  @Test
  public void One_Long_First_Test() {
    MaxConsecutiveOnes0485 mco = new MaxConsecutiveOnes0485();
    assertEquals(3, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 0}));
  }

  @Test
  public void One_Long_Last_Test() {
    MaxConsecutiveOnes0485 mco = new MaxConsecutiveOnes0485();
    assertEquals(4, mco.findMaxConsecutiveOnes(new int[]{0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0}));
  }
}
