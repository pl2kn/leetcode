package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class AsFarFromLandAsPossible1162 {

  public int maxDistance(int[][] grid) {
    int n = grid.length;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          queue.add(new int[]{i, j});
        }
      }
    }

    if (queue.size() == n * n) {
      return -1;
    }

    int level = 0;
    int[][] directions = new int[][]{{0, -1}, {-1, 0}, {0, 1}, {1, 0}};
    while (!queue.isEmpty()) {
      level++;
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int[] cell = queue.poll();
        int row = cell[0];
        int col = cell[1];

        for (int[] direction : directions) {
          int newRow = row + direction[0];
          int newCol = col + direction[1];
          if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && grid[newRow][newCol] == 0) {
            grid[newRow][newCol] = level;
            queue.add(new int[]{newRow, newCol});
          }
        }
      }
    }

    return level - 1;
  }
}
