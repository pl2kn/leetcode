package com.pl2kn.leetcode.problems.hard;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumFrequencyStack895 {

  class FreqStack {

    private int index;

    private final Map<Integer, Integer> frequencies;

    private final PriorityQueue<Element> maxHeap;

    class Element {

      private int val;

      private int frequency;

      private int index;

      public Element(int val, int frequency, int index) {
        this.val = val;
        this.frequency = frequency;
        this.index = index;
      }
    }

    public FreqStack() {
      index = 0;
      frequencies = new HashMap<>();
      maxHeap = new PriorityQueue<>(
          (a, b) -> a.frequency != b.frequency ? b.frequency - a.frequency : b.index - a.index
      );
    }

    public void push(int val) {
      frequencies.put(val, frequencies.getOrDefault(val, 0) + 1);
      maxHeap.add(new Element(val, frequencies.get(val), index++));
    }

    public int pop() {
      int val = maxHeap.poll().val;

      if (frequencies.get(val) > 1) {
        frequencies.put(val, frequencies.get(val) - 1);
      } else {
        frequencies.remove(val);
      }

      return val;
    }
  }
}
