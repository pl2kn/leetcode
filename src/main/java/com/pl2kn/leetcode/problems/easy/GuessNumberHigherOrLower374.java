package com.pl2kn.leetcode.problems.easy;

public abstract class GuessNumberHigherOrLower374 {

  public int guessNumber(int n) {
    int left = 0;
    int right = n;
    int mid;
    int guessResult;
    while (left <= right) {
      mid = left + (right - left) / 2;
      guessResult = guess(mid);
      if (guessResult == 0) {
        return mid;
      }
      if (guessResult == -1) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }

  public abstract int guess(int num);
}
