package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class MinimumDistanceBetweenBSTNodes783 {

  int minDiff = Integer.MAX_VALUE;
  TreeNode previous;

  public int minDiffInBST(TreeNode root) {
    if (root.left != null) {
      minDiffInBST(root.left);
    }

    if (previous != null) {
      minDiff = Math.min(minDiff, root.val - previous.val);
    }
    previous = root;

    if (root.right != null) {
      minDiffInBST(root.right);
    }

    return minDiff;
  }
}
