package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix1091 {

  public int shortestPathBinaryMatrix(int[][] grid) {
    int n = grid.length;

    if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) {
      return -1;
    }

    int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    Queue<int[]> queue = new LinkedList<>();

    grid[0][0] = 1;
    queue.add(new int[]{0, 0});

    while (!queue.isEmpty()) {
      int[] cell = queue.remove();
      int row = cell[0];
      int col = cell[1];

      if (row == n - 1 && col == n - 1) {
        return grid[row][col];
      }

      for (int[] direction : directions) {
        int newRow = row + direction[0];
        int newCol = col + direction[1];

        if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= n || grid[newRow][newCol] != 0) {
          continue;
        }

        queue.add(new int[]{newRow, newCol});
        grid[newRow][newCol] = grid[row][col] + 1;
      }
    }

    return -1;
  }
}
