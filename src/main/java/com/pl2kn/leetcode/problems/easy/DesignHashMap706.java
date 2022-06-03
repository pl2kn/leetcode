package com.pl2kn.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.List;

public class DesignHashMap706 {

  class MyHashMap {

    private static final int CAPACITY = 10000;
    private Bucket[] buckets;

    public MyHashMap() {
      buckets = new Bucket[CAPACITY];
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new Bucket();
      }
    }

    public void put(int key, int value) {
      buckets[hash(key)].upsert(key, value);
    }

    public int get(int key) {
      return buckets[hash(key)].get(key);
    }

    public void remove(int key) {
      buckets[hash(key)].delete(key);
    }

    private int hash(int key) {
      return key % CAPACITY;
    }

    class Bucket {
      private final List<Node> container;

      public Bucket() {
        container = new LinkedList<>();
      }

      public void upsert(int key, int value) {
        for (Node node : container) {
          if (node.key == key) {
            node.value = value;
            return;
          }
        }
        container.add(new Node(key, value));
      }

      public int get(int key) {
        for (Node node : container) {
          if (node.key == key) {
            return node.value;
          }
        }
        return -1;
      }

      public void delete(int key) {
        for (Node node : container) {
          if (node.key == key) {
            container.remove(node);
            break;
          }
        }
      }
    }

    class Node {

      private final int key;
      private int value;

      public Node(int key, int value) {
        this.key = key;
        this.value = value;
      }
    }
  }
}
