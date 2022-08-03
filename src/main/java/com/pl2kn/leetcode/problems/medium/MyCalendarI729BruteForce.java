package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarI729BruteForce {

  class MyCalendar {

    List<int[]> events;

    public MyCalendar() {
      events = new ArrayList<>();
    }

    public boolean book(int start, int end) {
      for (int[] event : events) {
        if (start < event[1] && end > event[0]) {
          return false;
        }
      }

      events.add(new int[]{start, end});

      return true;
    }
  }
}
