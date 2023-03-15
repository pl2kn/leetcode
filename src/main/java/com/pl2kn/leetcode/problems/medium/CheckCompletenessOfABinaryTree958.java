package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessOfABinaryTree958 {

  public boolean isCompleteTree(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    TreeNode leftMost = root;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        TreeNode node = queue.remove();

        if (node.left != null) {
          queue.add(node.left);
          if (leftMost == null) {
            return false;
          }
        }
        leftMost = node.left;

        if (node.right != null) {
          queue.add(node.right);
          if (leftMost == null) {
            return false;
          }
        }
        leftMost = node.right;
      }
    }

    return true;
  }
}
