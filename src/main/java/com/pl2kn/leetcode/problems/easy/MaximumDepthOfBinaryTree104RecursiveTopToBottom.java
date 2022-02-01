package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class MaximumDepthOfBinaryTree104RecursiveTopToBottom {

  private int maxDepth;

  public int maxDepth(TreeNode root) {
    maxDepth = 0;
    if (root == null) {
      return maxDepth;
    }
    maxDepth(root, 1);
    return maxDepth;
  }

  private void maxDepth(TreeNode node, int depth) {
    if (node == null) {
      return;
    }
    maxDepth = Math.max(maxDepth, depth);
    maxDepth(node.left, depth + 1);
    maxDepth(node.right, depth + 1);
  }
}
