package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class ClosestBinarySearchTreeValue270 {

  private int closestValue;

  public int closestValue(TreeNode root, double target) {
    int result = root.val;
    while (root != null) {
      int value = root.val;
      if (Math.abs(value - target) < Math.abs(result - target)) {
        result = value;
      }
      root = target < value ? root.left : root.right;
    }
    return result;
  }
}
