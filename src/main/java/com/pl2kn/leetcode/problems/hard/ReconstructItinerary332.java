package com.pl2kn.leetcode.problems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItinerary332 {

  private Map<String, PriorityQueue<String>> flights;
  private List<String> route = new ArrayList<>();

  public List<String> findItinerary(List<List<String>> tickets) {
    flights = new HashMap<>();

    for (List<String> ticket : tickets) {
      flights.putIfAbsent(ticket.get(0), new PriorityQueue<>());
      flights.get(ticket.get(0)).add(ticket.get(1));
    }

    return route;
  }

  private void dfs(String departure) {
    while (flights.containsKey(departure) && !flights.get(departure).isEmpty()) {
      dfs(flights.get(departure).poll());
    }

    route.add(0, departure);
  }
}
