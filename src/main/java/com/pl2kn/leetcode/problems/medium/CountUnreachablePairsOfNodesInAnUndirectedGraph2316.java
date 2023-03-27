package com.pl2kn.leetcode.problems.medium;

public class CountUnreachablePairsOfNodesInAnUndirectedGraph2316 {

  private int[] roots;
  private int[] weights;

  public long countPairs(int n, int[][] edges) {
    roots = new int[n];
    weights = new int[n];
    for (int i = 0; i < n; i++) {
      roots[i] = i;
      weights[i] = 1;
    }

    for (int[] edge : edges) {
      union(edge[0], edge[1]);
    }

    long result = 0;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (find(i) != find(j)) {
          result++;
        }
      }
    }

    return result;
  }

  private void union(int p, int q) {
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
  }

  private int find(int p) {
    while (p != roots[p]) {
      p = roots[p];
    }
    return p;
  }
}
