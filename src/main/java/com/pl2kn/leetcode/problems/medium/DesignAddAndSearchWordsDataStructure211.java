package com.pl2kn.leetcode.problems.medium;

public class DesignAddAndSearchWordsDataStructure211 {

  static class WordDictionary {

    private Trie trie;

    public WordDictionary() {
      trie = new Trie();
    }

    public void addWord(String word) {
      trie.addWord(word);
    }

    public boolean search(String word) {
      return trie.match(word);
    }

    public class Trie {

      private TrieNode root;

      public Trie() {
        root = new TrieNode();
      }

      public void addWord(String string) {
        TrieNode node = root;
        for (char c : string.toCharArray()) {
          if (!node.containsKey(c)) {
            node.put(c);
          }
          node = node.get(c);
        }
        node.setIsEnd();
      }

      public boolean match(String word) {
        return matchFromNode(root, word);
      }

      public boolean matchFromNode(TrieNode node, String string) {
        for (int i = 0; i < string.length(); i++) {
          char c = string.charAt(i);
          if (c == '.') {
            for (TrieNode child : node.getChildren()) {
              if (child != null && matchFromNode(child, string.substring(i + 1))) {
                return true;
              }
            }
            return false;
          } else {
            if (!node.containsKey(c)) {
              return false;
            }
            node = node.get(c);
          }
        }
        return node != null && node.isEnd();
      }

      public class TrieNode {

        private static final int R = 26;
        private TrieNode[] children;
        private boolean isEnd;

        public TrieNode() {
          children = new TrieNode[R];
        }

        public boolean containsKey(char c) {
          return children[getIndex(c)] != null;
        }

        public TrieNode get(char c) {
          return children[getIndex(c)];
        }

        public void put(char c) {
          children[getIndex(c)] = new TrieNode();
        }

        public boolean isEnd() {
          return isEnd;
        }

        public void setIsEnd() {
          isEnd = true;
        }

        public TrieNode[] getChildren() {
          return children;
        }

        private int getIndex(char c) {
          return c - 'a';
        }
      }
    }
  }

}
