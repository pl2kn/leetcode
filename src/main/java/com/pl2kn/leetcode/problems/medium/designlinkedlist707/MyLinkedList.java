package com.pl2kn.leetcode.problems.medium.designlinkedlist707;

class MyLinkedList {

  private static class Node {

    private final int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private final Node head;
  private int size;

  public MyLinkedList() {
    head = new Node(0);
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    Node currentNode = head;
    for (int i = 0; i <= index; i++) {
      currentNode = currentNode.next;
    }
    return currentNode.value;
  }

  public void addAtHead(int val) {
    addAtIndex(0, val);
  }

  public void addAtTail(int val) {
    addAtIndex(size, val);
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }
    Node previousNode = head;
    for (int i = 0; i < index; i++) {
      previousNode = previousNode.next;
    }
    Node node = new Node(val);
    node.next = previousNode.next;
    previousNode.next = node;
    size++;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    Node previousNode = head;
    for (int i = 0; i < index; i++) {
      previousNode = previousNode.next;
    }
    previousNode.next = previousNode.next.next;
    size --;
  }
}
