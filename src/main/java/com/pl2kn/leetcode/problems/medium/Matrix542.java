package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix542 {

  public int[][] updateMatrix(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 0) {
          queue.add(new int[]{i, j});
        } else {
          mat[i][j] = -1;
        }
      }
    }
    int[][] distances = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    while (!queue.isEmpty()) {
      int[] cell = queue.remove();
      int row = cell[0];
      int col = cell[1];
      for (int[] distance : distances) {
        int newRow = row + distance[0];
        int newCol = col + distance[1];
        if (newRow < 0 || newCol < 0 || newRow >= m || newCol >= n || mat[newRow][newCol] != -1) {
          continue;
        }
        mat[newRow][newCol] = mat[row][col] + 1;
        queue.add(new int[]{newRow, newCol});
      }
    }
    return mat;
  }
}
