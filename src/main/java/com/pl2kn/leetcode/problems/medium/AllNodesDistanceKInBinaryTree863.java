package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AllNodesDistanceKInBinaryTree863 {

  public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    if (root == null) {
      return new ArrayList<>();
    }

    Map<Integer, List<Integer>> adj = new HashMap<>();
    adj.put(root.val, new ArrayList<>());

    dfs(root, adj);

    LinkedList<Integer> queue = new LinkedList<>();
    Set<Integer> visited = new HashSet<>();

    queue.add(target.val);
    visited.add(target.val);

    int level = 0;
    while (!queue.isEmpty()) {
      if (level == k) {
        return queue;
      }

      int queueSize = queue.size();
      for (int i = 0; i < queueSize; i++) {
        int node = queue.poll();
        for (int neighbor : adj.get(node)) {
          if (!visited.contains(neighbor)) {
            queue.add(neighbor);
            visited.add(neighbor);
          }
        }
      }

      level++;
    }

    return new ArrayList<>();
  }

  private void dfs(TreeNode node, Map<Integer, List<Integer>> adj) {
    int nodeVal = node.val;

    if (node.left != null) {
      int leftVal = node.left.val;
      adj.get(nodeVal).add(leftVal);
      adj.computeIfAbsent(leftVal, k -> new ArrayList<>()).add(nodeVal);

      dfs(node.left, adj);
    }

    if (node.right != null) {
      int rightVal = node.right.val;
      adj.get(nodeVal).add(rightVal);
      adj.computeIfAbsent(rightVal, k -> new ArrayList<>()).add(nodeVal);

      dfs(node.right, adj);
    }
  }
}
