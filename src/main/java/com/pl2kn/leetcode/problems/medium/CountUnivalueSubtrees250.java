package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class CountUnivalueSubtrees250 {

  private int count = 0;

  public int countUnivalSubtrees(TreeNode root) {
    if (root == null) {
      return count;
    }
    isUnivalSubtree(root, root.val);
    return count;
  }

  public boolean isUnivalSubtree(TreeNode root, int value) {
    if (root == null) {
      return true;
    }
    boolean isLeftUnival = isUnivalSubtree(root.left, root.val);
    boolean isRightUnival = isUnivalSubtree(root.right, root.val);
    if (!isLeftUnival || !isRightUnival) {
      return false;
    }
    count++;
    return root.val == value;
  }
}
