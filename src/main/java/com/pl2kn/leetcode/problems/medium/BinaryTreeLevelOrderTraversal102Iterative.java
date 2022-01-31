package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102Iterative {

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    int level = 0;
    while (!queue.isEmpty()) {
      result.add(level, new ArrayList<>());
      int levelSize = queue.size();
      for (int i = 0; i < levelSize; i++) {
        TreeNode node = queue.remove();
        result.get(level).add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      level++;
    }
    return result;
  }
}
