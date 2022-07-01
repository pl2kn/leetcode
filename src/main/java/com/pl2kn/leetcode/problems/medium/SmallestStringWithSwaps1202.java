package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SmallestStringWithSwaps1202 {


  public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
    int length = s.length();

    UnionFind unionFind = new UnionFind(length);
    for (List<Integer> pair : pairs) {
      unionFind.union(pair.get(0), pair.get(1));
    }

    Map<Integer, List<Integer>> components = new HashMap<>();
    for (int i = 0; i < length; i++) {
      int root = unionFind.find(i);
      components.putIfAbsent(root, new LinkedList<>());
      components.get(root).add(i);
    }

    char[] resultChars = new char[length];

    for (List<Integer> indexes : components.values()) {
      List<Character> characters = new ArrayList<>();

      for (int index : indexes) {
        characters.add(s.charAt(index));
      }

      Collections.sort(characters);

      for (int i = 0; i < indexes.size(); i++) {
        resultChars[indexes.get(i)] = characters.get(i);
      }
    }

    return String.valueOf(resultChars);
  }

  static class UnionFind {

    private final int[] roots;
    private final int[] weights;

    public UnionFind(int size) {
      roots = new int[size];
      weights = new int[size];
      for (int i = 0; i < size; i++) {
        roots[i] = i;
        weights[i] = 1;
      }
    }

    public void union(int p, int q) {
      int pRoot = find(p);
      int qRoot = find(q);

      if (pRoot == qRoot) {
        return;
      }

      if (weights[pRoot] > weights[qRoot]) {
        roots[qRoot] = pRoot;
        weights[pRoot] += weights[qRoot];
      } else {
        roots[pRoot] = qRoot;
        weights[qRoot] += weights[pRoot];
      }
    }

    public int find(int p) {
      while (p != roots[p]) {
        roots[p] = roots[roots[p]];
        p = roots[p];
      }

      return p;
    }
  }
}
