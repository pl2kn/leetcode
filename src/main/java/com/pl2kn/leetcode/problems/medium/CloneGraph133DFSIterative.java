package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CloneGraph133DFSIterative {

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }

    Map<Node, Node> visited = new HashMap<>();
    Stack<Node> stack = new Stack<>();

    stack.add(node);
    visited.put(node, new Node(node.val, new ArrayList<>()));

    while (!stack.isEmpty()) {
      Node current = stack.pop();
      for (Node neighbor : current.neighbors) {
        if (!visited.containsKey(neighbor)) {
          visited.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
          stack.add(neighbor);
        }
        visited.get(current).neighbors.add(visited.get(neighbor));
      }
    }

    return visited.get(node);
  }
}
