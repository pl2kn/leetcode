package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class PathSum112Recursive {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    return hasPathSum(root, 0, targetSum);
  }

  private boolean hasPathSum(TreeNode node, int currentSum, int targetSum) {
    if (node == null) {
      return false;
    }
    currentSum += node.val;
    if (node.left == null && node.right == null) {
      return currentSum == targetSum;
    }
    return hasPathSum(node.left, currentSum, targetSum)
        || hasPathSum(node.right, currentSum, targetSum);
  }
}
