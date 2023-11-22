package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraverseII1424 {
  public int[] findDiagonalOrder(List<List<Integer>> nums) {
    Map<Integer, List<Integer>> diagonals = new HashMap<>();
    int n = 0;
    int maxDiagonalIndex = 0;
    for (int i = 0; i < nums.size(); i++) {
      List<Integer> row = nums.get(i);
      for (int j = 0; j < row.size(); j++) {
        int diagonalIndex = i + j;
        diagonals.computeIfAbsent(diagonalIndex, k -> new ArrayList<>()).add(row.get(j));
        n++;
        maxDiagonalIndex = Math.max(maxDiagonalIndex, diagonalIndex);
      }
    }

    int[] result = new int[n];
    int k = 0;
    for (int i = 0; i <= maxDiagonalIndex; i++) {
      List<Integer> diagonal = diagonals.get(i);

      if (diagonal == null) {
        continue;
      }

      for (int j = diagonal.size() - 1; j >= 0; j--) {
        result[k++] = diagonal.get(j);
      }
    }

    return result;
  }
}
