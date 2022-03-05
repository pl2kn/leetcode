package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;

public class FibonacciNumber59 {

  HashMap<Integer, Integer> cache = new HashMap<>();

  public int fib(int n) {
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    if (n < 2) {
      return n;
    }
    int result = fib(n - 1) + fib(n - 2);
    cache.put(n, result);
    return result;
  }
}
