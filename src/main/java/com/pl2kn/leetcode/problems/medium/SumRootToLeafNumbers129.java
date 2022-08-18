package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class SumRootToLeafNumbers129 {

  private int sum;

  public int sumNumbers(TreeNode root) {
    helper(root, 0);

    return sum;
  }

  private void helper(TreeNode node, int currentNumber) {
    if (node == null) {
      return;
    }

    currentNumber = currentNumber * 10 + node.val;

    if (node.left == null && node.right == null) {
      sum += currentNumber;
    } else {
      helper(node.left, currentNumber);
      helper(node.right, currentNumber);
    }
  }
}
