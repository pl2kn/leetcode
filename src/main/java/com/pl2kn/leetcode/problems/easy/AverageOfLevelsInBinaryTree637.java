package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree637 {

  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      double sum = 0;
      for (int i = 0; i < queueSize; i++) {
        TreeNode node = queue.remove();

        sum += node.val;

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      result.add(sum / queueSize);
    }

    return result;
  }
}
