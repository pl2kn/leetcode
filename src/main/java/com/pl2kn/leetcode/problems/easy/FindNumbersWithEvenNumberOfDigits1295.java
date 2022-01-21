package com.pl2kn.leetcode.problems.easy;

public class FindNumbersWithEvenNumberOfDigits1295 {

  public int findNumbers(int[] nums) {
    int evenDigitNumberCount = 0;
    for (int num : nums) {
      if (String.valueOf(num).length() % 2 == 0) {
        evenDigitNumberCount++;
      }
    }
    return evenDigitNumberCount;
  }
}
