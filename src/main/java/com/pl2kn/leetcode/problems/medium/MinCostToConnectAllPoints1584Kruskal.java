package com.pl2kn.leetcode.problems.medium;

import java.util.PriorityQueue;

public class MinCostToConnectAllPoints1584Kruskal {

  public int minCostConnectPoints(int[][] points) {
    if (points == null || points.length == 0) {
      return 0;
    }

    int pointCount = points.length;
    PriorityQueue<Edge> priorityQueue = new PriorityQueue<>((a, b) -> a.distance - b.distance);

    for (int i = 0; i < pointCount; i++) {
      int[] point1 = points[i];
      for (int j = i + 1; j < pointCount; j++) {
        int[] point2 = points[j];
        int distance = Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
        priorityQueue.add(new Edge(i, j, distance));
      }
    }

    UnionFind unionFind = new UnionFind(pointCount);
    int result = 0;
    int count = 0;

    while (!priorityQueue.isEmpty() && count < pointCount - 1) {
      Edge edge = priorityQueue.remove();
      if (!unionFind.isConnected(edge.point1, edge.point2)) {
        unionFind.union(edge.point1, edge.point2);
        result += edge.distance;
        count++;
      }
    }

    return result;
  }

  private static class Edge {

    private int point1;
    private int point2;
    private int distance;

    public Edge(int point1, int point2, int distance) {
      this.point1 = point1;
      this.point2 = point2;
      this.distance = distance;
    }
  }

  private static class UnionFind {

    private int[] roots;
    private int[] weights;

    public UnionFind(int n) {
      roots = new int[n];
      weights = new int[n];

      for (int i = 0; i < n; i++) {
        roots[i] = i;
        weights[i] = 1;
      }
    }

    public int find(int p) {
      while (p != roots[p]) {
        p = roots[p];
      }

      return p;
    }

    public void union(int p, int q) {
      int pRoot = find(p);
      int qRoot = find(q);

      if (pRoot == qRoot) {
        return;
      }

      if (weights[pRoot] > weights[qRoot]) {
        roots[qRoot] = pRoot;
        weights[pRoot] += weights[qRoot];
      } else {
        roots[pRoot] = qRoot;
        weights[qRoot] += weights[pRoot];
      }
    }

    public boolean isConnected(int p, int q) {
      return find(p) == find(q);
    }
  }
}
