package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII350 {

  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums1) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    List<Integer> list = new ArrayList<>();
    for (int num : nums2) {
      if (map.containsKey(num) && map.get(num) > 0) {
        list.add(num);
        map.put(num, map.get(num) - 1);
      }
    }

    int[] result = new int[list.size()];
    int id = 0;
    for (int num : list) {
      result[id++] = num;
    }

    return result;
  }
}
