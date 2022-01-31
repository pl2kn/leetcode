package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal94Iterative {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      if (current != null) {
        stack.push(current);
        current = current.left;
      } else {
        TreeNode node = stack.pop();
        result.add(node.val);
        current = node.right;
      }
    }
    return result;
  }
}
