package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII253 {

  public int minMeetingRooms(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    PriorityQueue<int[]> allocations = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    allocations.add(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
      if (intervals[i][0] >= allocations.peek()[1]) {
        allocations.remove();
      }
      allocations.add(intervals[i]);
    }
    return allocations.size();
  }
}
