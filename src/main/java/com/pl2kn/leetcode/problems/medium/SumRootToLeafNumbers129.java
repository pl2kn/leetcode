package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class SumRootToLeafNumbers129 {

  public int sumNumbers(TreeNode root) {
    return sumNumbers(root, 0);
  }

  private int sumNumbers(TreeNode node, int sum) {
    if (node == null) {
      return 0;
    }

    sum = sum * 10 + node.val;

    if (node.left == null && node.right == null) {
      return sum;
    }

    return sumNumbers(node.left, sum) + sumNumbers(node.right, sum);
  }
}
