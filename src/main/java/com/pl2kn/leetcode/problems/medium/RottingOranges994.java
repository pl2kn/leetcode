package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994 {

  public int orangesRotting(int[][] grid) {
    int freshCount = 0;
    int m = grid.length;
    int n = grid[0].length;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 2) {
          queue.add(new int[]{i, j});
        } else if (grid[i][j] == 1) {
          freshCount++;
        }
      }
    }
    if (freshCount == 0) {
      return 0;
    }
    int minuteCount = 0;
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    while (!queue.isEmpty() && freshCount > 0) {
      minuteCount++;
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int[] rottingOrange = queue.remove();
        for (int[] direction : directions) {
          int row = rottingOrange[0] + direction[0];
          int col = rottingOrange[1] + direction[1];
          if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] != 1) {
            continue;
          }
          grid[row][col] = 2;
          queue.add(new int[]{row, col});
          freshCount--;
        }
      }
    }
    return freshCount == 0 ? minuteCount : -1;
  }
}
