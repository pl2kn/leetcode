package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class PathSumIII437 {

  private int targetSum;

  private int count;

  private Map<Long, Integer> counts;

  public int pathSum(TreeNode root, int targetSum) {
    this.targetSum = targetSum;
    counts = new HashMap<>();

    counts.put(0L, 1);

    traverse(root, 0);

    return count;
  }

  private void traverse(TreeNode node, long currentSum) {
    if (node == null) {
      return;
    }

    currentSum += node.val;
    count += counts.getOrDefault(currentSum - targetSum, 0);
    counts.put(currentSum, counts.getOrDefault(currentSum, 0) + 1);

    traverse(node.left, currentSum);
    traverse(node.right, currentSum);

    counts.put(currentSum, counts.get(currentSum) - 1);
  }
}
