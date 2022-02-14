package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class WallsAndGates286 {

  public void wallsAndGates(int[][] rooms) {
    Queue<int[]> queue = new LinkedList<>();
    for (int i = 0; i < rooms.length; i++) {
      for (int j = 0; j < rooms[0].length; j++) {
        if (rooms[i][j] == 0) {
          queue.add(new int[]{i, j});
        }
      }
    }
    while (!queue.isEmpty()) {
      int[] room = queue.remove();
      int row = room[0];
      int col = room[1];
      if (row > 0 && rooms[row - 1][col] == Integer.MAX_VALUE) {
        rooms[row - 1][col] = rooms[row][col] + 1;
        queue.add(new int[]{row - 1, col});
      }
      if (row < rooms.length - 1 && rooms[row + 1][col] == Integer.MAX_VALUE) {
        rooms[row + 1][col] = rooms[row][col] + 1;
        queue.add(new int[]{row + 1, col});
      }
      if (col > 0 && rooms[row][col - 1] == Integer.MAX_VALUE) {
        rooms[row][col - 1] = rooms[row][col] + 1;
        queue.add(new int[]{row, col - 1});
      }
      if (col < rooms[0].length - 1 && rooms[row][col + 1] == Integer.MAX_VALUE) {
        rooms[row][col + 1] = rooms[row][col] + 1;
        queue.add(new int[]{row, col + 1});
      }
    }
  }
}
