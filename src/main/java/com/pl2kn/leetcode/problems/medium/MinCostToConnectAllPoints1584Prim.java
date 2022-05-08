package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class MinCostToConnectAllPoints1584Prim {

  public int minCostConnectPoints(int[][] points) {
    if (points == null || points.length == 0) {
      return 0;
    }

    int pointCount = points.length;

    PriorityQueue<Edge> minHeap = new PriorityQueue<>((a, b) -> a.distance - b.distance);

    int[] point1 = points[0];
    for (int i = 1; i < pointCount; i++) {
      int[] point2 = points[i];
      int distance = Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
      minHeap.add(new Edge(0, i, distance));
    }

    boolean[] visited = new boolean[pointCount];
    int count = 0;
    int result = 0;

    visited[0] = true;

    while (!minHeap.isEmpty() && count < pointCount - 1) {
      Edge edge = minHeap.remove();
      int pointIndex2 = edge.pointIndex2;

      if (visited[pointIndex2]) {
        continue;
      }

      result += edge.distance;
      visited[pointIndex2] = true;
      count++;

      for (int i = 0; i < pointCount; i++) {
        if (visited[i]) {
          continue;
        }

        int distance = Math.abs(points[pointIndex2][0] - points[i][0]) + Math.abs(
            points[pointIndex2][1] - points[i][1]);
        minHeap.add(new Edge(pointIndex2, i, distance));
      }
    }

    return result;
  }

  private static class Edge {

    private int pointIndex1;
    private int pointIndex2;
    private int distance;

    public Edge(int point1, int point2, int distance) {
      this.pointIndex1 = point1;
      this.pointIndex2 = point2;
      this.distance = distance;
    }
  }
}
