package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelayTime743 {

  public int networkDelayTime(int[][] times, int n, int k) {
    Map<Integer, List<WeightedDirectedEdge>> adj = new HashMap<>();
    for (int[] edge : times) {
      int v = edge[0];
      adj.putIfAbsent(v, new ArrayList<>());
      adj.get(v).add(new WeightedDirectedEdge(v, edge[1], edge[2]));
    }

    PriorityQueue<WeightedVertex> minHeap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
    minHeap.add(new WeightedVertex(k, 0));

    int[] distTo = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      distTo[i] = Integer.MAX_VALUE;
    }
    distTo[k] = 0;

    boolean[] visited = new boolean[n + 1];

    while (!minHeap.isEmpty()) {
      WeightedVertex weightedVertex = minHeap.remove();
      int vertex = weightedVertex.vertex;

      if (visited[vertex] || !adj.containsKey(vertex)) {
        continue;
      }

      visited[vertex] = true;

      for (WeightedDirectedEdge edge : adj.get(vertex)) {
        if (distTo[edge.w] > distTo[edge.v] + edge.weight) {
          distTo[edge.w] = distTo[edge.v] + edge.weight;
          minHeap.add(new WeightedVertex(edge.w, distTo[edge.w]));
        }
      }
    }

    int result = 0;
    for (int dist : distTo) {
      result = Math.max(dist, result);
    }

    return result == Integer.MAX_VALUE ? - 1 : result;
  }

  static class WeightedDirectedEdge {

    private final int v;
    private final int w;
    private final int weight;

    public WeightedDirectedEdge(int v, int w, int weight) {
      this.v = v;
      this.w = w;
      this.weight = weight;
    }
  }

  static class WeightedVertex {

    private final int vertex;
    private final int weight;

    public WeightedVertex(int v, int weight) {
      this.vertex = v;
      this.weight = weight;
    }
  }
}
