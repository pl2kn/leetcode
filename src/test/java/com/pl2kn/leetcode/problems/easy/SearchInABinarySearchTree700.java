package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class SearchInABinarySearchTree700 {

  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || root.val == val) {
      return root;
    }
    return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
  }
}
