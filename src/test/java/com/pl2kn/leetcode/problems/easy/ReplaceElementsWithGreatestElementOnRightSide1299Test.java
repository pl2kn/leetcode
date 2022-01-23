package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReplaceElementsWithGreatestElementOnRightSide1299Test {

  @Test
  public void Simple_Test() {
    int[] arr = {17, 18, 5, 4, 6, 1};
    ReplaceElementsWithGreatestElementOnRightSide1299 solution = new ReplaceElementsWithGreatestElementOnRightSide1299();
    assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, solution.replaceElements(arr));
  }
}
