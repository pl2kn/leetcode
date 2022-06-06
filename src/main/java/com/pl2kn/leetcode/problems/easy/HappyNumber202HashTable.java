package com.pl2kn.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber202HashTable {

  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<>();

    while (n != 1 && !set.contains(n)) {
      set.add(n);
      n = getNext(n);
    }

    return n == 1;
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
