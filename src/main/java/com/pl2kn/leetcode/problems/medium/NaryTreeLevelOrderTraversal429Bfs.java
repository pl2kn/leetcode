package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NaryTreeLevelOrderTraversal429Bfs {

  class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val, List<Node> _children) {
      val = _val;
      children = _children;
    }
  }

  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> result = new ArrayList<>();

    if (root == null) {
      return result;
    }

    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int queueSize = queue.size();
      List<Integer> level = new ArrayList<>();

      while (queueSize > 0) {
        Node node = queue.remove();
        level.add(node.val);
        for (Node child : node.children) {
          queue.add(child);
        }
        queueSize--;
      }

      result.add(level);
    }

    return result;
  }
}
