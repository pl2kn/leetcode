package com.pl2kn.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill733BFS {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    int m = image.length;
    int n = image[0].length;
    int targetColor = image[sr][sc];
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[]{sr, sc});
    while (!queue.isEmpty()) {
      int[] pixel = queue.remove();
      int row = pixel[0];
      int col = pixel[1];
      image[row][col] = newColor;
      int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
      for (int[] direction : directions) {
        int newRow = pixel[0] + direction[0];
        int newCol = pixel[1] + direction[1];
        if (newRow < 0 || newCol < 0 || newRow >= m || newCol >= n
            || image[newRow][newCol] != targetColor || image[newRow][newCol] == newColor) {
          continue;
        }
        queue.add(new int[]{newRow, newCol});
      }
    }
    return image;
  }
}
