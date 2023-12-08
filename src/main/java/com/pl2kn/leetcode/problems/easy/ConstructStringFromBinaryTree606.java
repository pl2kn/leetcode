package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class ConstructStringFromBinaryTree606 {

  public String tree2str(TreeNode root) {
    StringBuilder stringBuilder = new StringBuilder();
    traverse(root, stringBuilder);
    return stringBuilder.toString();
  }

  private void traverse(TreeNode node, StringBuilder stringBuilder) {
    stringBuilder.append(node.val);

    if (node.left != null) {
      stringBuilder.append('(');
      traverse(node.left, stringBuilder);
      stringBuilder.append(')');
    } else if (node.right != null) {
      stringBuilder.append('(');
      stringBuilder.append(')');
    }

    if (node.right != null) {
      stringBuilder.append('(');
      traverse(node.right, stringBuilder);
      stringBuilder.append(')');
    }
  }
}
