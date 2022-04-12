package com.pl2kn.leetcode.problems.medium;

public class GameOfLife298 {

  public void gameOfLife(int[][] board) {
    int m = board.length;
    int n = board[0].length;

    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        int liveNeighbors = 0;

        for (int i = -1; i <= 1; i++) {
          for (int j = -1; j <= 1; j++) {
            if (i == 0 && j == 0) {
              continue;
            }

            int neighborRow = row + i;
            int neighborCol = col + j;

            if (neighborRow < 0 || neighborRow > m - 1 || neighborCol < 0 || neighborCol > n - 1) {
              continue;
            }

            if (Math.abs(board[neighborRow][neighborCol]) == 1) {
              liveNeighbors++;
            }
          }
        }

        if (board[row][col] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
          board[row][col] = -1;
        }

        if (board[row][col] == 0 && liveNeighbors == 3) {
          board[row][col] = 2;
        }
      }
    }

    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        board[row][col] = board[row][col] > 0 ? 1 : 0;
      }
    }
  }
}
