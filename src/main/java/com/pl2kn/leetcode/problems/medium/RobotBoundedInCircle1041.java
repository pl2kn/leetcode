package com.pl2kn.leetcode.problems.medium;

public class RobotBoundedInCircle1041 {

  public boolean isRobotBounded(String instructions) {
    int[][] directions = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    int i = 0;
    int x = 0;
    int y = 0;

    for (char instruction : instructions.toCharArray()) {
      if (instruction == 'L') {
        i = (i + 1) % 4;
      } else if (instruction == 'R') {
        i = (i + 3) % 4;
      } else {
        x += directions[i][0];
        y += directions[i][1];
      }
    }

    return x == 0 && y == 0 || i != 0;
  }
}
