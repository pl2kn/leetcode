package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class CountGoodNodesInBinaryTree1448 {

  private int goodCount;

  public int goodNodes(TreeNode root) {
    goodCount = 0;
    dfs(root, Integer.MIN_VALUE);
    return goodCount;
  }

  private void dfs(TreeNode root, int currentMax) {
    if (root.val >= currentMax) {
      goodCount++;
      currentMax = root.val;
    }

    if (root.left != null) {
      dfs(root.left, currentMax);
    }

    if (root.right != null) {
      dfs(root.right, currentMax);
    }
  }
}
