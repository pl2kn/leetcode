package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.Stack;

public class KthSmallestElementInABST230 {

  public int kthSmallest(TreeNode root, int k) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.push(current);
        current = current.left;
      }

      TreeNode node = stack.pop();

      if (--k == 0) {
        return node.val;
      }

      current = node.right;
    }

    return -1;
  }
}
