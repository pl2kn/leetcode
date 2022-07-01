package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class PathWithMinimumEffort1631 {

  public int minimumEffortPath(int[][] heights) {
    int rowCount = heights.length;
    int colCount = heights[0].length;

    int[][] distTo = new int[rowCount][colCount];
    for (int i = 0; i < rowCount; i++) {
      for (int j = 0; j < colCount; j++) {
        distTo[i][j] = Integer.MAX_VALUE;
      }
    }
    distTo[0][0] = 0;

    boolean[][] visited = new boolean[rowCount][colCount];

    PriorityQueue<Cell> minHeap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
    minHeap.add(new Cell(0, 0, distTo[0][0]));

    int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    while (!minHeap.isEmpty()) {
      Cell cell = minHeap.remove();
      int row = cell.row;
      int col = cell.col;

      visited[row][col] = true;

      for (int[] direction : directions) {
        int newRow = row + direction[0];
        int newCol = col + direction[1];

        if (newRow >= rowCount || newRow < 0 || newCol >= colCount || newCol < 0 || visited[newRow][newCol]) {
          continue;
        }

        int currentDiff = Math.abs(heights[row][col] - heights[newRow][newCol]);
        int maxDiff = Math.max(currentDiff, distTo[row][col]);
        if (maxDiff < distTo[newRow][newCol]) {
          distTo[newRow][newCol] = maxDiff;
          minHeap.add(new Cell(newRow, newCol, distTo[newRow][newCol]));
        }
      }
    }

    return distTo[rowCount - 1][colCount - 1];
  }


  public static class Cell {

    private int row;
    private int col;
    private int weight;

    public Cell(int row, int col, int weight) {
      this.row = row;
      this.col = col;
      this.weight = weight;
    }
  }
}
