package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.easy.FindNumbersWithEvenNumberOfDigits1295;
import org.junit.jupiter.api.Test;

public class FindNumbersWithEvenNumberOfDigits1295Test {

  @Test
  public void Simple_Test() {
    FindNumbersWithEvenNumberOfDigits1295 solution = new FindNumbersWithEvenNumberOfDigits1295();
    assertEquals(2, solution.findNumbers(new int[]{12,345,2,6,7896}));
  }
}
