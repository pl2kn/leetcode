package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach1642 {

  public int furthestBuilding(int[] heights, int bricks, int ladders) {
    PriorityQueue<Integer> usedBricks = new PriorityQueue<>((a, b) -> b - a);

    for (int i = 0; i < heights.length - 1; i++) {
      int jump = heights[i + 1] - heights[i];

      if (jump <= 0) {
        continue;
      }

      bricks -= jump;
      usedBricks.add(jump);

      if (bricks < 0 && ladders == 0) {
        return i;
      }

      if (bricks < 0) {
        bricks += usedBricks.remove();
        ladders--;
      }
    }

    return heights.length - 1;
  }
}
