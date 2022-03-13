package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTreesII95 {

  public List<TreeNode> generateTrees(int n) {
    return generateTrees(1, n);
  }

  private List<TreeNode> generateTrees(int start, int end) {
    List<TreeNode> result = new LinkedList<TreeNode>();
    if (start > end) {
      result.add(null);
      return result;
    }
    for (int i = start; i <= end; i++) {
      List<TreeNode> leftTrees = generateTrees(start, i - 1);
      List<TreeNode> rightTrees = generateTrees(i + 1, end);
      for (TreeNode left : leftTrees) {
        for (TreeNode right : rightTrees) {
          TreeNode root = new TreeNode(i);
          root.left = left;
          root.right = right;
          result.add(root);
        }
      }
    }
    return result;
  }
}
