package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal103 {

  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    boolean isReversed = false;

    while (!queue.isEmpty()) {
      List<Integer> levelResult = new LinkedList<>();
      int queueSize = queue.size();

      for (int i = 0; i < queueSize; i++) {
        TreeNode node = queue.remove();
        int value = node.val;

        if (isReversed) {
          levelResult.add(0, value);
        } else {
          levelResult.add(value);
        }

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      isReversed = !isReversed;
      result.add(levelResult);
    }

    return result;
  }
}
