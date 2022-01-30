package com.pl2kn.leetcode.problems.medium;

public class FlattenAMultilevelDoublyLinkedList430 {

  static class Node {

    public int val;
    public Node prev;
    public Node next;
    public Node child;
  }

  public Node flatten(Node head) {
    Node current = head;
    while (current != null) {
      handle(current);
      current = current.next;
    }
    return head;
  }

  private Node handle(Node head) {
    if (head == null) {
      return null;
    }
    while (head.next != null) {
      Node next = head.next;
      if (head.child != null) {
        head.next = head.child;
        head.child.prev = head;
        Node childEnd = handle(head.child);
        childEnd.next = next;
        next.prev = childEnd;
      }
      head = next;
    }
    return head;
  }
}
