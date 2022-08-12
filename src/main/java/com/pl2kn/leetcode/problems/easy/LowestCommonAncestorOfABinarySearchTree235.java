package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class LowestCommonAncestorOfABinarySearchTree235 {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    int parentValue = root.val;
    int pValue = p.val;
    int qValue = q.val;

    if (pValue < parentValue && qValue < parentValue) {
      return lowestCommonAncestor(root.left, p, q);
    } else if (pValue > parentValue && qValue > parentValue) {
      return lowestCommonAncestor(root.right, p, q);
    } else {
      return root;
    }
  }
}
