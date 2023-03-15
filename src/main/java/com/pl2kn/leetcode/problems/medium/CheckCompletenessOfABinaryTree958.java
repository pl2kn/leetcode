package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfABinaryTree958 {

  public boolean isCompleteTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    boolean isNullNodeFound = false;
    while (!queue.isEmpty()) {
      TreeNode node = queue.remove();

      if (node == null) {
        isNullNodeFound = true;
      } else {
        if (isNullNodeFound) {
          return false;
        }

        queue.add(node.left);
        queue.add(node.right);
      }
    }

    return true;
  }
}
