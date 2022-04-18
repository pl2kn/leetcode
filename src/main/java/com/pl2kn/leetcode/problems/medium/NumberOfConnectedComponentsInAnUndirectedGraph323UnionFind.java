package com.pl2kn.leetcode.problems.medium;

public class NumberOfConnectedComponentsInAnUndirectedGraph323UnionFind {

  private static class UnionFind {

    private final int[] roots;
    private final int[] weights;
    private int count;

    public UnionFind(int n) {
      roots = new int[n];
      weights = new int[n];
      count = n;
      for (int i = 0; i < n; i++) {
        roots[i] = i;
        weights[i] = 1;
      }
    }

    public void union(int p, int q) {
      int pRoot = find(p);
      int qRoot = find(q);

      if (pRoot == qRoot) {
        return;
      }

      if (weights[qRoot] > weights[pRoot]) {
        roots[pRoot] = qRoot;
        weights[qRoot] += weights[pRoot];
      } else {
        roots[qRoot] = pRoot;
        weights[pRoot] += weights[qRoot];
      }

      count--;
    }

    public int find(int p) {
      while (p != roots[p]) {
        roots[p] = roots[roots[p]];
        p = roots[p];
      }

      return p;
    }

    public int getCount() {
      return count;
    }
  }

  public int countComponents(int n, int[][] edges) {
    UnionFind unionFind = new UnionFind(n);

    for (int[] edge : edges) {
      unionFind.union(edge[0], edge[1]);
    }

    return unionFind.getCount();
  }
}
