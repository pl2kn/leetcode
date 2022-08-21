package com.pl2kn.leetcode.problems.hard;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class BinaryTreeMaximumPathSum124 {

  private int maxPathSum = Integer.MIN_VALUE;

  public int maxPathSum(TreeNode root) {
    traverse(root);

    return maxPathSum;
  }

  private int traverse(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int leftMax = Math.max(traverse(node.left), 0);
    int rightMax = Math.max(traverse(node.right), 0);

    maxPathSum = Math.max(maxPathSum, node.val + leftMax + rightMax);

    return node.val + Math.max(leftMax, rightMax);

  }
}
