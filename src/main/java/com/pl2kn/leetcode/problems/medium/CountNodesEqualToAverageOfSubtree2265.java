package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class CountNodesEqualToAverageOfSubtree2265 {

  private int result;

  public int averageOfSubtree(TreeNode root) {
    traverse(root);
    return result;
  }

  private int[] traverse(TreeNode node) {
    if (node == null) {
      return new int[]{0, 0};
    }

    int[] left = traverse(node.left);
    int[] right = traverse(node.right);

    int count = 1 + left[0] + right[0];
    int sum = node.val + left[1] + right[1];

    if (sum / count == node.val) {
      result++;
    }

    return new int[]{count, sum};
  }
}
