package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MaximumWidthOfBinaryTree662 {

  public int widthOfBinaryTree(TreeNode root) {
    Map<TreeNode, Integer> positions = new HashMap<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    positions.put(root, 1);

    int maxWidth = 0;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      int leftmost = 0;
      int rightmost = 0;
      for (int i = 0; i < queueSize; i++) {
        TreeNode node = queue.remove();

        if (i == 0) {
          leftmost = positions.get(node);
        }

        if (i == queueSize - 1) {
          rightmost = positions.get(node);
        }

        if (node.left != null) {
          positions.put(node.left, positions.get(node) * 2);
          queue.add(node.left);
        }

        if (node.right != null) {
          positions.put(node.right, positions.get(node) * 2 + 1);
          queue.add(node.right);
        }
      }

      maxWidth = Math.max(maxWidth, rightmost - leftmost + 1);
    }

    return maxWidth;
  }
}
