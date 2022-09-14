package com.pl2kn.leetcode.problems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class AlienDictionary269 {

  public String alienOrder(String[] words) {
    Map<Character, Integer> inDegree = new HashMap<>();
    Map<Character, List<Character>> adj = new HashMap<>();
    for (String word : words) {
      for (char c : word.toCharArray()) {
        inDegree.put(c, 0);
        adj.put(c, new ArrayList<>());
      }
    }

    for (int i = 0; i < words.length - 1; i++) {
      String previousWord = words[i];
      String currentWord = words[i + 1];

      if (previousWord.length() > currentWord.length() && previousWord.startsWith(currentWord)) {
        return "";
      }

      for (int j = 0; j < Math.min(previousWord.length(), currentWord.length()); j++) {
        char parent = previousWord.charAt(j);
        char child = currentWord.charAt(j);
        if (parent != child) {
          adj.get(parent).add(child);
          inDegree.put(child, inDegree.get(child) + 1);
          break;
        }
      }
    }

    Queue<Character> queue = new LinkedList<>();
    for (Map.Entry<Character, Integer> entry : inDegree.entrySet()) {
      if (entry.getValue() == 0) {
        queue.add(entry.getKey());
      }
    }

    StringBuilder result = new StringBuilder();
    while (!queue.isEmpty()) {
      char c = queue.poll();
      result.append(c);
      for (char child : adj.get(c)) {
        inDegree.put(child, inDegree.get(child) - 1);
        if (inDegree.get(child) == 0) {
          queue.add(child);
        }
      }
    }

    return result.length() == inDegree.size() ? result.toString() : "";
  }
}
