package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands200BFS {

  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }
    int count = 0;
    int rowCount = grid.length;
    int colCount = grid[0].length;
    for (int i = 0; i < rowCount; i++) {
      for (int j = 0; j < colCount; j++) {
        if (grid[i][j] != '1') {
          continue;
        }
        count++;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
          int[] pair = queue.remove();
          int row = pair[0];
          int col = pair[1];
          if (row > 0 && grid[row - 1][col] == '1') {
            queue.add(new int[]{row - 1, col});
            grid[row - 1][col] = '0';
          }
          if (row < rowCount - 1 && grid[row + 1][col] == '1') {
            queue.add(new int[]{row + 1, col});
            grid[row + 1][col] = '0';
          }
          if (col > 0 && grid[row][col - 1] == '1') {
            queue.add(new int[]{row, col - 1});
            grid[row][col - 1] = '0';
          }
          if (col < colCount - 1 && grid[row][col + 1] == '1') {
            queue.add(new int[]{row, col + 1});
            grid[row][col + 1] = '0';
          }
        }
      }
    }
    return count;
  }
}
