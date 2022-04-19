package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class TheEarliestMomentWhenEveryoneBecomeFriends1101 {

  private class UnionFind {

    private final int[] roots;
    private final int[] weights;
    private int componentCount;

    public UnionFind(int n) {
      roots = new int[n];
      weights = new int[n];
      componentCount = n;
      for (int i = 0; i < n; i++) {
        roots[i] = i;
        weights[i] = 1;
      }
    }

    public int find(int p) {
      while (p != roots[p]) {
        roots[p] = roots[roots[p]];
        p = roots[p];
      }

      return p;
    }

    public void connect(int p, int q) {
      int pRoot = find(p);
      int qRoot = find(q);

      if (pRoot == qRoot) {
        return;
      }

      if (weights[pRoot] > weights[qRoot]) {
        roots[qRoot] = pRoot;
        weights[qRoot] += weights[pRoot];
      } else {
        roots[pRoot] = qRoot;
        weights[pRoot] += weights[qRoot];
      }

      componentCount--;
    }

    public int getComponentCount() {
      return componentCount;
    }
  }

  public int earliestAcq(int[][] logs, int n) {
    Arrays.sort(logs, (a, b) -> a[0] - b[0]);

    UnionFind unionFind = new UnionFind(n);

    for (int[] log : logs) {
      unionFind.connect(log[1], log[2]);
      if (unionFind.getComponentCount() == 1) {
        return log[0];
      }
    }

    return -1;
  }
}
