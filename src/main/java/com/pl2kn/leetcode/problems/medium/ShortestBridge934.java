package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge934 {

  public int shortestBridge(int[][] grid) {
    int n = grid.length;
    int[][] directions = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    Queue<int[]> queue = new LinkedList<>();
    boolean isIslandFound = false;
    for (int i = 0; i < n && !isIslandFound; i++) {
      for (int j = 0; j < n && !isIslandFound; j++) {
        if (grid[i][j] == 1) {
          dfs(grid, i, j, queue, directions);
          isIslandFound = true;
        }
      }
    }

    int bridgeLength = 0;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int[] cell = queue.remove();

        for (int[] direction : directions) {
          int newRow = cell[0] + direction[0];
          int newCol = cell[1] + direction[1];
          if (checkBounds(grid, newRow, newCol) && grid[newRow][newCol] != 2) {
            if (grid[newRow][newCol] == 1) {
              return bridgeLength;
            }

            queue.add(new int[]{newRow, newCol});
            grid[newRow][newCol] = 2;
          }
        }
      }
      bridgeLength++;
    }

    return -1;
  }

  private void dfs(int[][] grid, int i, int j, Queue<int[]> queue, int[][] directions) {
    if (!checkBounds(grid, i, j) || grid[i][j] != 1) {
      return;
    }

    grid[i][j] = 2;
    queue.add(new int[]{i, j});

    for (int[] direction : directions) {
      dfs(grid, i + direction[0], j + direction[1], queue, directions);
    }
  }

  private boolean checkBounds(int[][] grid, int i, int j) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid.length;
  }
}
