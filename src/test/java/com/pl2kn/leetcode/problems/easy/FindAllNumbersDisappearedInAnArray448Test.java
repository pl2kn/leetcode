package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedInAnArray448Test {

  @Test
  public void Simple_Test() {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    FindAllNumbersDisappearedInAnArray448 solution = new FindAllNumbersDisappearedInAnArray448();
    List<Integer> expected = new ArrayList<>();
    expected.add(5);
    expected.add(6);
    int count = 0;
    for (Integer num : solution.findDisappearedNumbers(nums)) {
      count++;
      assertTrue(expected.contains(num));
    }
    assertEquals(2, count);
  }
}
