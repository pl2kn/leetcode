package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class BalancedBinaryTree110 {

  private boolean isBalanced = true;

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    maxDepth(root);

    return isBalanced;
  }

  private int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    if (Math.abs(left - right) > 1) {
      isBalanced = false;
    }

    return 1 + Math.max(left, right);
  }
}
