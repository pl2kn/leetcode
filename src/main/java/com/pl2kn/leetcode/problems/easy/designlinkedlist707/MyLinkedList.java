package com.pl2kn.leetcode.problems.easy.designlinkedlist707;

class MyLinkedList {

  private static class Node {

    private final int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node head;
  private int size;

  public MyLinkedList() {
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    Node currentNode = head;
    for (int i = 0; i < index; i++) {
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
    Node node = new Node(val);
    if (index == 0) {
      node.next = head;
      head = node;
    } else {
      Node currentNode = head;
      for (int i = 0; i < index - 1; i++) {
        currentNode = currentNode.next;
      }
      node.next = currentNode.next;
      currentNode.next = node;
    }
    size++;
  }

  public void deleteAtIndex(int index) {
    if (size == 0 || index < 0 || index >= size) {
      return;
    }
    if (index == 0) {
      head = head.next;
    } else {
      Node previousNode = head;
      for (int i = 0; i < index - 1; i++) {
        previousNode = previousNode.next;
      }
      previousNode.next = previousNode.next.next;
    }
    size--;
  }
}
