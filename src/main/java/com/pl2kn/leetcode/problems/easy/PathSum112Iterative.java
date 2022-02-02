package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.Stack;

public class PathSum112Iterative {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }
    Stack<TreeNode> nodeStack = new Stack<>();
    Stack<Integer> sumStack = new Stack<>();
    nodeStack.push(root);
    sumStack.push(0);
    while (!nodeStack.isEmpty()) {
      TreeNode node = nodeStack.pop();
      int sum = sumStack.pop() + node.val;
      if (node.left == null && node.right == null && sum == targetSum) {
        return true;
      }
      if (node.right != null) {
        nodeStack.push(node.right);
        sumStack.push(sum);
      }
      if (node.left != null) {
        nodeStack.push(node.left);
        sumStack.push(sum);
      }
    }
    return false;
  }
}
