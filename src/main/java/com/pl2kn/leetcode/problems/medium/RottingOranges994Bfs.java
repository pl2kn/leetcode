package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994Bfs {

  public int orangesRotting(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int freshCount = 0;
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

    int[][] directions = new int[][]{{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    int minuteCount = 0;

    while (!queue.isEmpty() && freshCount > 0) {
      int queueSize = queue.size();

      while (queueSize > 0) {
        int[] rottingOrange = queue.remove();
        int row = rottingOrange[0];
        int col = rottingOrange[1];

        for (int[] direction : directions) {
          int newRow = row + direction[0];
          int newCol = col + direction[1];

          if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || grid[newRow][newCol] != 1) {
            continue;
          }

          grid[newRow][newCol] = 2;
          queue.add(new int[]{newRow, newCol});
          freshCount--;
        }

        queueSize--;
      }

      minuteCount++;
    }

    return freshCount == 0 ? minuteCount : -1;
  }
}
