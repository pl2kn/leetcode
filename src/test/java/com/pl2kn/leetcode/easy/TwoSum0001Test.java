package com.pl2kn.leetcode.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TwoSum0001Test {

  @Test
  public void Three_Elements_Test() {
    TwoSum0001 solution = new TwoSum0001();

    int[] array = {3, 2, 4};
    int target = 6;

    int[] result = solution.twoSum(array, target);

    assertArrayEquals(new int[]{2, 1}, result);
  }

  @Test
  public void Two_Elements_Test() {
    TwoSum0001 solution = new TwoSum0001();

    int[] array = {2, 4};
    int target = 6;

    int[] result = solution.twoSum(array, target);

    assertArrayEquals(new int[]{1, 0}, result);
  }

  @Test
  public void Duplicate_Test() {
    TwoSum0001 solution = new TwoSum0001();

    int[] array = {1, 2, 3, 3};
    int target = 6;

    int[] result = solution.twoSum(array, target);

    assertArrayEquals(new int[]{3, 2}, result);
  }
}
