package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {

  public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    List<List<Integer>> result = new ArrayList<>();
    helper(root, targetSum, new ArrayList<>(), result);

    return result;
  }

  public void helper(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> paths) {
    if (node == null) {
      return;
    }

    int currentValue = node.val;
    currentPath.add(currentValue);
    targetSum -= currentValue;

    if (node.left == null && node.right == null && targetSum == 0) {
      paths.add(new ArrayList<>(currentPath));
    } else {
      helper(node.left, targetSum, currentPath, paths);
      helper(node.right, targetSum, currentPath, paths);
    }

    currentPath.remove(currentPath.size() - 1);
  }
}
