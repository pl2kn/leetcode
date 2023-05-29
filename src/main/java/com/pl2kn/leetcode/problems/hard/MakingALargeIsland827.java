package com.pl2kn.leetcode.problems.hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakingALargeIsland827 {

  private final Map<Integer, Integer> islands = new HashMap<>();
  private final int[][] directions = new int[][]{{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

  public int largestIsland(int[][] grid) {
    int n = grid.length;
    int color = 2;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          dfs(grid, i, j, color++);
        }
      }
    }

    int maxSize = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] != 0) {
          continue;
        }

        Set<Integer> connected = new HashSet<>();
        int currentSize = 1;
        for (int[] direction : directions) {
          int newRow = i + direction[0];
          int newCol = j + direction[1];

          if (!checkBounds(grid, newRow, newCol)) {
            continue;
          }

          if (grid[newRow][newCol] != 0 && !connected.contains(grid[newRow][newCol])) {
            currentSize += islands.get(grid[newRow][newCol]);
            connected.add(grid[newRow][newCol]);
          }
        }

        maxSize = Math.max(maxSize, currentSize);
        grid[i][j] = 0;
      }
    }

    return maxSize;
  }

  private void dfs(int[][] grid, int i, int j, int color) {
    if (!checkBounds(grid, i, j) || grid[i][j] != 1) {
      return;
    }

    grid[i][j] = color;
    islands.put(color, islands.getOrDefault(color, 0) + 1);

    for (int[] direction : directions) {
      dfs(grid, i + direction[0], j + direction[1], color);
    }
  }

  private boolean checkBounds(int[][] grid, int i, int j) {
    return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length;
  }
}
