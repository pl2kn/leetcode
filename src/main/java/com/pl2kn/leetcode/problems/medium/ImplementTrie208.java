package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import sun.reflect.generics.tree.Tree;

public class ImplementTrie208 {

  class Trie {

    private final TrieNode root;

    public Trie() {
      root = new TrieNode();
    }

    public void insert(String word) {
      TrieNode node = root;
      for (char c : word.toCharArray()) {
        if (!node.containsKey(c)) {
          node.put(c, new TrieNode());
        }
        node = node.get(c);
      }
      node.setEnd();
    }

    public boolean search(String word) {
      TrieNode node = searchPrefix(word);
      return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
      TrieNode node = searchPrefix(prefix);
      return node != null;
    }

    private TrieNode searchPrefix(String prefix) {
      TrieNode node = root;
      for (char c : prefix.toCharArray()) {
        if (node.containsKey(c)) {
          node = node.get(c);
        } else {
          return null;
        }
      }
      return node;
    }

    class TrieNode {

      private static final int R = 26;

      private final TrieNode[] children;
      private boolean isEnd;

      public TrieNode() {
        this.children = new TrieNode[R];
      }

      public boolean containsKey(char c) {
        return children[c - 'a'] != null;
      }

      public TrieNode get(char c) {
        return children[c - 'a'];
      }

      public void put(char c, TrieNode node) {
        children[c - 'a'] = node;
      }

      public void setEnd() {
        isEnd = true;
      }

      public boolean isEnd() {
        return isEnd;
      }
    }
  }
}
