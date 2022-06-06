package com.pl2kn.leetcode.problems.easy;

public class HappyNumber202Floyd {

  public boolean isHappy(int n) {
    int slow = n;
    int fast = getNext(n);

    while (slow != 1 && slow != fast) {
      slow = getNext(slow);
      fast = getNext(getNext(fast));
    }

    return slow == 1;
  }

  private int getNext(int n) {
    int result = 0;

    while (n > 0) {
      int d = n % 10;
      result += d * d;
      n /= 10;
    }

    return result;
  }
}
