package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class KClosestPointsToOrigin973 {

  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    List<List<Integer>> result = new ArrayList<>();
    int m = grid.length;
    int n = grid[0].length;

    for (int i = 0; i < m; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < n; j++) {
        row.add(0);
      }
      result.add(row);
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int col = (j + k) % n;
        int rowWrap = (j + k) / n;
        int row = (i + rowWrap) % m;
        result.get(row).set(col, grid[i][j]);
      }
    }

    return result;
  }
}
