package com.pl2kn.leetcode.problems.hard;

import com.sun.tools.javac.util.Pair;
import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner489 {

  interface Robot {

    public boolean move();

    public void turnLeft();

    public void turnRight();

    public void clean();
  }

  private final int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
  private final Set<String> visited = new HashSet<>();
  private Robot robot;

  public void cleanRoom(Robot robot) {
    this.robot = robot;
    backtrack(0, 0, 0);
  }

  private void backtrack(int row, int col, int direction) {
    visited.add(row + " " + col);
    robot.clean();

    for (int i = 0; i < 4; i++) {
      int newDirection = (direction + i) % 4;
      int newRow = row + directions[newDirection][0];
      int newCol = col + directions[newDirection][1];

      if (!visited.contains(newRow + " " + newCol) && robot.move()) {
        backtrack(newRow, newCol, newDirection);
        goBack();
      }

      robot.turnRight();
    }
  }

  private void goBack() {
    robot.turnRight();
    robot.turnRight();
    robot.move();
    robot.turnRight();
    robot.turnRight();
  }
}
