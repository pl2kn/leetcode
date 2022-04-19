package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.Stack;

public class RecoverBinarySearchTree99 {

  public void recoverTree(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode previous = null;
    TreeNode firstNode = null;
    TreeNode secondNode = null;
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      while (current != null) {
        stack.add(current);
        current = current.left;
      }
      TreeNode node = stack.pop();
      if (previous != null && node.val < previous.val) {
        secondNode = node;
        if (firstNode == null) {
          firstNode = node;
        } else {
          break;
        }
      }
      previous = node;
      current = node.right;
    }

    int tmp = firstNode.val;
    firstNode.val = secondNode.val;
    secondNode.val = tmp;
  }
}
