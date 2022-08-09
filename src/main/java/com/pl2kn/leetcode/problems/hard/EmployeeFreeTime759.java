package com.pl2kn.leetcode.problems.hard;

import com.pl2kn.leetcode.problems.common.Interval;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class EmployeeFreeTime759 {

  class EmployeeInterval {

    private Interval interval;

    int employeeIndex;

    int intervalIndex;

    public EmployeeInterval(Interval interval, int employeeIndex, int intervalIndex) {
      this.interval = interval;
      this.employeeIndex = employeeIndex;
      this.intervalIndex = intervalIndex;
    }
  }

  public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
    PriorityQueue<EmployeeInterval> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.interval.start, b.interval.start));

    for (int i = 0; i < schedule.size(); i++) {
      minHeap.add(new EmployeeInterval(schedule.get(i).get(0), i, 0));
    }

    List<Interval> result = new ArrayList<>();

    Interval previousInterval = minHeap.peek().interval;
    while (!minHeap.isEmpty()) {
      EmployeeInterval top = minHeap.poll();
      if (previousInterval.end < top.interval.start) {
        result.add(new Interval(previousInterval.end, top.interval.start));
        previousInterval = top.interval;
      } else if (previousInterval.end < top.interval.end) {
        previousInterval = top.interval;
      }

      List<Interval> employeeSchedule = schedule.get(top.employeeIndex);
      if (top.intervalIndex < employeeSchedule.size() - 1) {
        minHeap.add(new EmployeeInterval(employeeSchedule.get(top.intervalIndex + 1), top.employeeIndex, top.intervalIndex + 1));
      }
    }

    return result;
  }
}
