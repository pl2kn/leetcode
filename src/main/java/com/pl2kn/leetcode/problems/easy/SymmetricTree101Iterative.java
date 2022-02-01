package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree101Iterative {

  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode node1 = queue.poll();
      TreeNode node2 = queue.poll();
      if (node1 == null && node2 == null) {
        continue;
      }
      if (node1 == null || node2 == null) {
        return false;
      }
      if (node1.val != node2.val) {
        return false;
      }
      queue.add(node1.left);
      queue.add(node2.right);
      queue.add(node1.right);
      queue.add(node2.left);
    }
    return true;
  }
}
