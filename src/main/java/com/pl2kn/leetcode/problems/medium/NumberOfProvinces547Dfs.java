package com.pl2kn.leetcode.problems.medium;

public class NumberOfProvinces547Dfs {

  public int findCircleNum(int[][] isConnected) {
    int m = isConnected.length;
    boolean[]visited = new boolean[m];
    int count = 0;
    for (int i = 0; i < m; i++) {
      if (!visited[i]) {
        dfs(isConnected, visited, i);
        count++;
      }
    }
    return count;
  }

  private void dfs(int[][] isConnected, boolean[] visited, int i) {
    visited[i] = true;
    for (int j = 0; j < isConnected[i].length; j++) {
      if (isConnected[i][j] == 1 && !visited[j]) {
        dfs(isConnected, visited, j);
      }
    }
  }
}
