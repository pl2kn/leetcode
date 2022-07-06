package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets904 {

  public int totalFruit(int[] fruits) {
    Map<Integer, Integer> map = new HashMap<>();
    int result = 0;

    for (int left = 0, right = 0; right < fruits.length; right++) {
      int rightFruit = fruits[right];
      map.put(rightFruit, map.getOrDefault(rightFruit, 0) + 1);

      while (map.size() > 2) {
        int leftFruit = fruits[left++];
        map.put(leftFruit, map.get(leftFruit) - 1);
        if (map.get(leftFruit) == 0) {
          map.remove(leftFruit);
        }
      }

      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}
