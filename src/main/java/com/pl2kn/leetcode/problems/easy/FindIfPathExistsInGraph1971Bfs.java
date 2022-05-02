package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExistsInGraph1971Bfs {

  public boolean validPath(int n, int[][] edges, int source, int destination) {
    List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      adj.get(edge[0]).add(edge[1]);
      adj.get(edge[1]).add(edge[0]);
    }

    Queue<Integer> queue = new LinkedList<>();
    queue.add(source);

    boolean[] visited = new boolean[n];

    while (!queue.isEmpty()) {
      int vertex = queue.remove();

      if (vertex == destination) {
        return true;
      }

      visited[vertex] = true;

      for (int neighbour : adj.get(vertex)) {
        if (!visited[neighbour]) {
          queue.add(neighbour);
        }
      }
    }

    return false;
  }
}
