package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree1161 {

  public int maxLevelSum(TreeNode root) {
    if (root == null) {
      return -1;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    int currentLevel = 1;
    int result = currentLevel;
    int maxLevelSum = Integer.MIN_VALUE;
    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      int currentLevelSum = 0;
      for (int i = 0; i < queueSize; i++) {
        TreeNode node = queue.poll();
        currentLevelSum += node.val;

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      if (currentLevelSum > maxLevelSum) {
        maxLevelSum = currentLevelSum;
        result = currentLevel;
      }

      currentLevel++;
    }

    return result;
  }
}
