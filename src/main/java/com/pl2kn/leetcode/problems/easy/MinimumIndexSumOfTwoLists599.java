package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists599 {

  public String[] findRestaurant(String[] list1, String[] list2) {
    Map<String, Integer> map = new HashMap<>();

    for (int i = 0; i < list1.length; i++) {
      map.put(list1[i], i);
    }

    int minSum = Integer.MAX_VALUE;
    List<String> result = new LinkedList<>();

    for (int i = 0; i < list2.length; i++) {
      Integer j = map.get(list2[i]);
      if (j != null && i + j <= minSum) {
        if (i + j < minSum) {
          result = new LinkedList<>();
          minSum = i + j;
        }
        result.add(list2[i]);
      }
    }

    return result.toArray(new String[result.size()]);
  }
}
