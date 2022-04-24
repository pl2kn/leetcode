package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class ValidateBinarySearchTree98 {

  public boolean isValidBST(TreeNode root) {
    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private boolean validate(TreeNode node, long low, long high) {
    if (node == null) {
      return true;
    }

    if (node.val <= low || node.val >= high) {
      return false;
    }

    return validate(node.left, low, node.val) && validate(node.right, node.val, high);
  }
}
