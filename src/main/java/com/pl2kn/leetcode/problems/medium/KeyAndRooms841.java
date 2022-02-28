package com.pl2kn.leetcode.problems.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KeyAndRooms841 {

  public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    Queue<List<Integer>> roomQueue = new LinkedList<>();
    Set<Integer> visitedRooms = new HashSet<>();
    roomQueue.add(rooms.get(0));
    visitedRooms.add(0);
    while (!roomQueue.isEmpty()) {
      List<Integer> room = roomQueue.remove();
      for (Integer key : room) {
        if (!visitedRooms.contains(key)) {
          visitedRooms.add(key);
          roomQueue.add(rooms.get(key));
        }
      }
    }
    return visitedRooms.size() == rooms.size();
  }
}
