package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class ValidateBinaryTreeNodes1361 {

  public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
    int[] parents = new int[n];

    Arrays.fill(parents, -1);

    for (int i = 0; i < n; i++) {
      if (leftChild[i] != -1) {
        parents[leftChild[i]] = i;
      }

      if (rightChild[i] != - 1) {
        parents[rightChild[i]] = i;
      }
    }

    int root = -1;
    for (int i = 0; i < n; i++) {
      if (parents[i] == -1) {
        if (root != - 1) {
          return false;
        }

        root = i;
      }
    }

    if (root == -1) {
      return false;
    }

    boolean[] visited = new boolean[n];

    if (!check(root, leftChild, rightChild, visited)) {
      return false;
    }

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        return false;
      }
    }

    return true;
  }

  private boolean check(int i, int[] leftChild, int[] rightChild, boolean[] visited) {
    if (i == -1) {
      return true;
    }

    if (visited[i]) {
      return false;
    }

    visited[i] = true;

    return check(leftChild[i], leftChild, rightChild, visited) && check(rightChild[i], leftChild, rightChild, visited);
  }
}
