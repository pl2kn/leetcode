package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class DiameterOfBinaryTree543 {

  private int diameter;

  public int diameterOfBinaryTree(TreeNode root) {
    traverse(root);

    return diameter;
  }

  private int traverse(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int leftDiameter = traverse(node.left);
    int rightDiameter = traverse(node.right);

    diameter = Math.max(diameter, leftDiameter + rightDiameter);

    return Math.max(leftDiameter, rightDiameter) + 1;
  }
}
