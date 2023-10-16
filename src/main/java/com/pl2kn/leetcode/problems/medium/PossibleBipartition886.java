package com.pl2kn.leetcode.problems.medium;

public class PossibleBipartition886 {

  public boolean possibleBipartition(int n, int[][] dislikes) {
    Map<Integer, List<Integer>> adj = new HashMap<>();
    for (int i = 1; i <= n; i++) {
      adj.put(i, new ArrayList<>());
    }

    for (int[] dislike : dislikes) {
      adj.get(dislike[0]).add(dislike[1]);
      adj.get(dislike[1]).add(dislike[0]);
    }

    UnionFind unionFind = new UnionFind(n);
    for (int i = 1; i <= n; i++) {
      for (int neighbor : adj.get(i)) {
        if (unionFind.isConnected(i, neighbor)) {
          return false;
        }

        unionFind.union(adj.get(i).get(0), neighbor);
      }
    }

    return true;
  }

  static class UnionFind {

    private final int[] roots;
    private final int[] weights;

    public UnionFind(int n) {
      roots = new int[n + 1];
      weights = new int[n + 1];

      for (int i = 0; i <= n; i++) {
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

      if (weights[pRoot] > weights[qRoot]) {
        roots[qRoot] = pRoot;
        weights[pRoot] += weights[qRoot];
      } else {
        roots[pRoot] = qRoot;
        weights[qRoot] += weights[pRoot];
      }
    }

    public int find(int p) {
      while (p != roots[p]) {
        p = roots[p];
      }
      return p;
    }

    public boolean isConnected(int p, int q) {
      return find(p) == find(q);
    }
  }
}
