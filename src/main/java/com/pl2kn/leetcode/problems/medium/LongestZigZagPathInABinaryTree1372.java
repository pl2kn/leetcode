package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class LongestZigZagPathInABinaryTree1372 {

  private int longestZigZagPath = 0;

  public int longestZigZag(TreeNode root) {
    longestZigZag(root, true, 0);
    longestZigZag(root, false, 0);
    return longestZigZagPath;
  }

  private void longestZigZag(TreeNode node, boolean isLeft, int currentZigZagPath) {
    if (node == null) {
      return;
    }

    longestZigZagPath = Math.max(longestZigZagPath, currentZigZagPath);

    if (isLeft) {
      longestZigZag(node.left, false, currentZigZagPath + 1);
      longestZigZag(node.right, true, 1);
    } else {
      longestZigZag(node.right, true, currentZigZagPath + 1);
      longestZigZag(node.left, false, 1);
    }
  }

}
