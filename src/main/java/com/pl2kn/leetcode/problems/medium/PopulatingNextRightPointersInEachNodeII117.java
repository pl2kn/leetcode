package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.medium.PopulatingNextRightPointersInEachNode116Iterative.Node;

public class PopulatingNextRightPointersInEachNodeII117 {

  public Node connect(Node root) {
    if (root == null) {
      return null;
    }

    Node levelHead = new Node();
    Node current = root;
    Node previous = levelHead;
    while (current != null) {
      if (current.left != null) {
        previous.next = current.left;
        previous = previous.next;
      }

      if (current.right != null) {
        previous.next = current.right;
        previous = previous.next;
      }

      current = current.next;
      if (current == null) {
        previous = levelHead;
        current = levelHead.next;
        levelHead.next = null;
      }
    }

    return root;
  }
}
