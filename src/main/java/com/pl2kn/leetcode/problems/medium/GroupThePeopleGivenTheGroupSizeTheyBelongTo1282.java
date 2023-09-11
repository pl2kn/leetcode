package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupThePeopleGivenTheGroupSizeTheyBelongTo1282 {

  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    for (int i = 0; i < groupSizes.length; i++) {
      map.computeIfAbsent(groupSizes[i], key -> new ArrayList<>()).add(i);
    }

    List<List<Integer>> result = new ArrayList<>();
    for (int groupSize : map.keySet()) {
      List<Integer> group = new ArrayList<>();
      for (int personId : map.get(groupSize)) {
        group.add(personId);
        if (group.size() == groupSize) {
          result.add(new ArrayList<>(group));
          group.clear();
        }
      }
    }

    return result;
  }
}
