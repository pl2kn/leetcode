package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal145Iterative {

  public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current = root;
    while (current != null || !stack.isEmpty()) {
      if (current != null) {
        result.addFirst(current.val);
        stack.push(current);
        current = current.right;
      } else {
        TreeNode node = stack.pop();
        current = node.left;
      }
    }
    return result;
  }
}
