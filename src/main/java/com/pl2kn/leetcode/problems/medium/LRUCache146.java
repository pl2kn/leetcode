package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;
public class LRUCache146 {

  static class LRUCache {
    class Node {

      private final int key;
      private int value;
      private Node previous;
      private Node next;

      public Node(int key, int value) {
        this.key = key;
        this.value = value;
      }
    }

    private final Map<Integer, Node> map;
    private final Node head;
    private final Node tail;
    private final int capacity;
    private int count;


    public LRUCache(int c) {
      map = new HashMap<>();
      head = new Node(0, 0);
      tail = new Node(0, 0);
      head.next = tail;
      tail.previous = head;
      capacity = c;
    }

    public int get(int key) {
      Node node = map.get(key);

      if (node == null) {
        return -1;
      }

      moveToHead(node);

      return node.value;
    }

    public void put(int key, int value) {
      if (map.containsKey(key)) {
        Node node = map.get(key);
        node.value = value;
        moveToHead(node);
      } else {
        if (count == capacity) {
          map.remove(pop().key);
          count--;
        }

        Node node = new Node(key, value);

        addToHead(node);
        map.put(key, node);
        count++;
      }
    }

    private void addToHead(Node node) {
      node.previous = head;
      node.next = head.next;

      head.next.previous = node;
      head.next = node;
    }

    private Node pop() {
      Node node = tail.previous;
      removeNode(node);

      return node;
    }

    private void removeNode(Node node) {
      node.previous.next = node.next;
      node.next.previous = node.previous;
    }

    private void moveToHead(Node node) {
      removeNode(node);
      addToHead(node);
    }
  }
}
