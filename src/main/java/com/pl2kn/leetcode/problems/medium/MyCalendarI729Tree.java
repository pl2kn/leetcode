package com.pl2kn.leetcode.problems.medium;

import java.util.TreeMap;

public class MyCalendarI729Tree {

  class MyCalendar {

    TreeMap<Integer, Integer> events;

    public MyCalendar() {
      events = new TreeMap<>();
    }

    public boolean book(int start, int end) {
      Integer previous = events.floorKey(start);
      Integer next = events.ceilingKey(start);

      if ((previous == null || events.get(previous) >= start) && (next == null || end <= next)) {
        events.put(start, end);

        return true;
      }

      return false;
    }
  }
}
