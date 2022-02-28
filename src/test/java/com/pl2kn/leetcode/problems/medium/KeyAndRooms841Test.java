package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class KeyAndRooms841Test {

  @Test
  public void Simple_TesT() {
    KeyAndRooms841 solution = new KeyAndRooms841();
    List<List<Integer>> rooms = new ArrayList<>();
    List<Integer> room0 = new ArrayList<>();
    room0.add(1);
    List<Integer> room1 = new ArrayList<>();
    room1.add(2);
    List<Integer> room2 = new ArrayList<>();
    room1.add(3);
    List<Integer> room3 = new ArrayList<>();
    rooms.add(room0);
    rooms.add(room1);
    rooms.add(room2);
    rooms.add(room3);
    assertTrue(solution.canVisitAllRooms(rooms));
  }
}
