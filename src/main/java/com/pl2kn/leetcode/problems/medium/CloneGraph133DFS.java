package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.Node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph133DFS {

  private final Map<Node, Node> visited = new HashMap<>();

  public Node cloneGraph(Node node) {
    if (node == null) {
      return null;
    }
    if (visited.containsKey(node)) {
      return visited.get(node);
    }
    Node clonedNode = new Node(node.val, new ArrayList<>());
    visited.put(node, clonedNode);
    for (Node neighbour : node.neighbors) {
      clonedNode.neighbors.add(cloneGraph(neighbour));
    }
    return clonedNode;
  }
}
