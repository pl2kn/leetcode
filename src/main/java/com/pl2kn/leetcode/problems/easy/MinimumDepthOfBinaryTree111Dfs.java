package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class MinimumDepthOfBinaryTree111Dfs {

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left == null) {
      return minDepth(root.right) + 1;
    }

    if (root.right == null) {
      return minDepth(root.left) + 1;
    }

    return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
  }
}
