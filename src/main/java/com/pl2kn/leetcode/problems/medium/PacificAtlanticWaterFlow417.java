package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow417 {

  public List<List<Integer>> pacificAtlantic(int[][] heights) {
    int m = heights.length;
    int n = heights[0].length;

    boolean[][] pacific = new boolean[m][n];
    boolean[][] atlantic = new boolean[m][n];

    for (int i = 0; i < m; i++) {
      dfs(heights, i, 0, pacific);
      dfs(heights, i, n - 1, atlantic);
    }

    for (int j = 0; j < n; j++) {
      dfs(heights, 0, j, pacific);
      dfs(heights, m - 1, j, atlantic);
    }

    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (pacific[i][j] && atlantic[i][j]) {
          result.add(Arrays.asList(i, j));
        }
      }
    }

    return result;
  }

  private void dfs(int[][] heights, int i, int j, boolean[][] visited) {
    visited[i][j] = true;
    int[][] directions = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    for (int[] direction : directions) {
      int newRow = i + direction[0];
      int newCol = j + direction[1];
      if (checkBounds(heights, newRow, newCol) && !visited[newRow][newCol] && heights[newRow][newCol] >= heights[i][j]) {
        dfs(heights, newRow, newCol, visited);
      }
    }
  }

  private boolean checkBounds(int[][] heights, int i, int j) {
    return i >= 0 && i < heights.length && j >= 0 && j < heights[0].length;
  }
}
