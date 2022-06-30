package com.pl2kn.leetcode.problems.medium;

public class CheapestFlightsWithinKStops787 {

  public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int[] previous = new int[n];
    int[] current = new int[n];
    for (int i = 0; i < n; i++) {
      previous[i] = Integer.MAX_VALUE;
      current[i] = Integer.MAX_VALUE;
    }
    previous[src] = 0;
    current[src] = 0;

    for (int i = 1; i <= k + 1; i++) {
      for (int[] flight : flights) {
        int from = flight[0];
        int to = flight[1];
        int cost = flight[2];

        if (previous[from] < Integer.MAX_VALUE) {
          current[to] = Math.min(current[to], previous[from] + cost);
        }
      }

      previous = current.clone();
    }

    return current[dst] == Integer.MAX_VALUE ? -1 : current[dst];
  }
}
