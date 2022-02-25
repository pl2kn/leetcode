package com.pl2kn.leetcode.problems.easy;

public class FloodFill733DFS {

  public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
    if (image[sr][sc] == newColor) {
      return image;
    }
    dfs(image, sr, sc, image[sr][sc], newColor);
    return image;
  }

  private void dfs(int[][] image, int row, int col, int targetColor, int newColor) {
    if (row < 0 || col < 0 || row >= image.length || col >= image[0].length
        || image[row][col] != targetColor) {
      return;
    }
    image[row][col] = newColor;
    dfs(image, row - 1, col, targetColor, newColor);
    dfs(image, row + 1, col, targetColor, newColor);
    dfs(image, row, col - 1, targetColor, newColor);
    dfs(image, row, col + 1, targetColor, newColor);
  }
}
