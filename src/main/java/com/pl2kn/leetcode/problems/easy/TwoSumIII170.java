package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIII170 {

  class TwoSum {

    private final Map<Integer, Integer> map;

    public TwoSum() {
      map = new HashMap<>();
    }

    public void add(int number) {
      map.put(number, map.getOrDefault(number, 0) + 1);
    }

    public boolean find(int value) {
      for (int number : map.keySet()) {
        int key = value - number;
        if (map.containsKey(key)) {
          if (key != number) {
            return true;
          } else if (map.get(key) > 1) {
            return true;
          }
        }
      }

      return false;
    }
  }
}
