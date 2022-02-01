package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class MaximumDepthOfBinaryTree104RecursiveBottomToTop {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftMaxDepth = maxDepth(root.left);
    int rightMaxDepth = maxDepth(root.right);
    return Math.max(leftMaxDepth, rightMaxDepth) + 1;
  }
}
