package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class PathSum112Recursive {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    targetSum -= root.val;
    if (root.left == null && root.right == null) {
      return targetSum == 0;
    }
    return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
  }
}
