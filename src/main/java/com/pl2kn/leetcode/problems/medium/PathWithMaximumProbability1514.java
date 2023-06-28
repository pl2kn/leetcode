package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class PathWithMaximumProbability1514 {

  public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
    Map<Integer, List<WeightedEdge>> adj = new HashMap<>();
    for (int i = 0; i < edges.length; i++) {
      int u = edges[i][0];
      int v = edges[i][1];
      adj.computeIfAbsent(u, k -> new ArrayList<>()).add(new WeightedEdge(u, v, succProb[i]));
      adj.computeIfAbsent(v, k -> new ArrayList<>()).add(new WeightedEdge(v, u, succProb[i]));
    }

    double[] probTo = new double[n];
    probTo[start] = 1.0;

    boolean[] visited = new boolean[n];

    PriorityQueue<WeightedVertex> minHeap = new PriorityQueue<>((a, b) -> -Double.compare(a.prob, b.prob));
    minHeap.add(new WeightedVertex(start, 1.0));

    while (!minHeap.isEmpty()) {
      WeightedVertex weightedVertex = minHeap.poll();
      int vertex = weightedVertex.vertex;
      double prob = weightedVertex.prob;

      if (visited[vertex] || !adj.containsKey(vertex)) {
        continue;
      }

      if (vertex == end) {
        return prob;
      }

      visited[vertex] = true;

      for (WeightedEdge edge : adj.get(vertex)) {
        int neighbor = edge.v;
        double edgeProb = edge.prob;

        if (probTo[neighbor] < probTo[vertex] * edgeProb) {
          probTo[neighbor] = probTo[vertex] * edgeProb;
          minHeap.add(new WeightedVertex(neighbor, probTo[neighbor]));
        }
      }
    }

    return 0D;
  }

  static class WeightedEdge {

    private final int u;
    private final int v;
    private final double prob;

    public WeightedEdge(int u, int v, double prob) {
      this.u = u;
      this.v = v;
      this.prob = prob;
    }
  }

  static class WeightedVertex {

    private final int vertex;
    private final double prob;

    public WeightedVertex(int vertex, double prob) {
      this.vertex = vertex;
      this.prob = prob;
    }
  }
}
