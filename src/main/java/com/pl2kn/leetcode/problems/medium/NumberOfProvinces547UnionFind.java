package com.pl2kn.leetcode.problems.medium;

public class NumberOfProvinces547UnionFind {

  private int[] roots;
  private int[] weights;

  public int findCircleNum(int[][] isConnected) {
    int m = isConnected.length;

    roots = new int[m];
    weights = new int[m];

    for (int i = 0; i < m; i++) {
      roots[i] = i;
      weights[i] = 1;
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < m; j++) {
        if (isConnected[i][j] == 1 && i != j) {
          union(i, j);
        }
      }
    }

    int count = 0;
    for (int i = 0; i < m; i++) {
      if (i == roots[i]) {
        count++;
      }
    }

    return count;
  }

  private void union(int x, int y) {
    int xRoot = find(x);
    int yRoot = find(y);

    if (xRoot == yRoot) {
      return;
    }

    if (weights[xRoot] > weights[yRoot]) {
      roots[yRoot] = xRoot;
      weights[yRoot] += weights[xRoot];
    } else {
      roots[xRoot] = yRoot;
      weights[xRoot] += weights[yRoot];
    }
  }

  private int find(int x) {
    if (x == roots[x]) {
      return x;
    }

    return roots[x] = find(roots[x]);
  }
}
