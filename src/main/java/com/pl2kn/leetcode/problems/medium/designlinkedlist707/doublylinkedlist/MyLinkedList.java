package com.pl2kn.leetcode.problems.medium.designlinkedlist707.doublylinkedlist;

public class MyLinkedList {

  private static class Node {

    private final int value;
    private Node next;
    private Node previous;

    public Node(int value) {
      this.value = value;
    }
  }

  private final Node head;
  private final Node tail;
  private int size;

  public MyLinkedList() {
    head = new Node(0);
    tail = new Node(0);
    head.next = tail;
    tail.previous = head;
    size = 0;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    Node current;
    if (index < size - index - 1) {
      current = head;
      for (int i = 0; i <= index; i++) {
        current = current.next;
      }
    } else {
      current = tail;
      for (int i = 0; i <= size - index - 1; i++) {
        current = current.previous;
      }
    }
    return current.value;
  }

  public void addAtHead(int val) {
    Node newNode = new Node(val);
    newNode.previous = head;
    newNode.next = head.next;
    head.next.previous = newNode;
    head.next = newNode;
    size++;
  }

  public void addAtTail(int val) {
    Node newNode = new Node(val);
    newNode.previous = tail.previous;
    newNode.next = tail;
    tail.previous.next = newNode;
    tail.previous = newNode;
    size++;
  }

  public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
      return;
    }
    Node previous;
    if (index < size - index - 1) {
      previous = head;
      for (int i = 0; i < index; i++) {
        previous = previous.next;
      }
    } else {
      previous = tail;
      for (int i = 0; i <= size - index; i++) {
        previous = previous.previous;
      }
    }
    Node newNode = new Node(val);
    newNode.previous = previous;
    newNode.next = previous.next;
    previous.next.previous = newNode;
    previous.next = newNode;
    size++;
  }

  public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
      return;
    }
    Node current;
    if (index < size - index - 1) {
      current = head;
      for (int i = 0; i <= index; i++) {
        current = current.next;
      }
    } else {
      current = tail;
      for (int i = 0; i <= size - index - 1; i++) {
        current = current.previous;
      }
    }
    current.previous.next = current.next;
    current.next.previous = current.previous;
    size--;
  }
}
