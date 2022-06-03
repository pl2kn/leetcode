package com.pl2kn.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.List;

public class DesignHashSet705 {

  class MyHashSet {

    private static final int CAPACITY = 10000;
    private final Bucket[] buckets;

    public MyHashSet() {
      buckets = new Bucket[CAPACITY];
      for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new Bucket();
      }
    }

    public void add(int key) {
      buckets[hash(key)].insert(key);
    }

    public void remove(int key) {
      buckets[hash(key)].delete(key);
    }

    public boolean contains(int key) {
      return buckets[hash(key)].exists(key);
    }

    private int hash(int key) {
      return key % CAPACITY;
    }

    class Bucket {

      private final List<Integer> container;

      public Bucket() {
        container = new LinkedList<>();
      }

      public void insert(Integer key) {
        if (!container.contains(key)) {
          container.add(key);
        }
      }

      public boolean exists(Integer key) {
        return container.contains(key);
      }

      public void delete(Integer key) {
        container.remove(key);
      }
    }
  }
}
