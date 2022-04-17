package com.pl2kn.leetcode.problems.medium;

public class GraphValidTree251UnionFind {

  private int[] roots;

  public boolean validTree(int n, int[][] edges) {
    roots = new int[n];

    for (int i = 0; i < n; i++) {
      roots[i] = i;
    }

    for (int[] edge : edges) {
      int aRoot = find(edge[0]);
      int bRoot = find(edge[1]);

      if (aRoot == bRoot) {
        return false;
      }

      roots[aRoot] = bRoot;
    }

    return edges.length == n - 1;
  }

  private int find(int i) {
    while (i != roots[i]) {
      i = roots[i];
    }

    return i;
  }
}
