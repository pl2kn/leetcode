package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.Stack;

public class MaximumDepthOfBinaryTree104IterativeDfs {

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Stack<TreeNode> stack = new Stack<>();
    Stack<Integer> depths = new Stack<>();
    int maxDepth = 0;
    stack.push(root);
    depths.push(1);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      int depth = depths.pop();
      maxDepth = Math.max(maxDepth, depth);
      if (node.left != null) {
        stack.push(node.left);
        depths.push(depth + 1);
      }
      if (node.right != null) {
        stack.push(node.right);
        depths.push(depth + 1);
      }
    }
    return maxDepth;
  }
}
