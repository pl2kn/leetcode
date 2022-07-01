package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;

class SmallestStringWithSwaps1202Test {

  @Test
  void Simple_Test() {
    SmallestStringWithSwaps1202 solution = new SmallestStringWithSwaps1202();
    int[][] pairs = {{8,6},{3,4},{5,2},{5,5},{3,5},{7,10},{6,0},{10,0},{7,1},{4,8},{6,2}};
    List<List<Integer>> list = new LinkedList<>();
    for (int[] pair : pairs) {
      List<Integer> pairList = new LinkedList<>();
      pairList.add(pair[0]);
      pairList.add(pair[1]);
      list.add(pairList);
    }
    solution.smallestStringWithSwaps("vbjjxgdfnru", list);
  }
}