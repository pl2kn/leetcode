package com.pl2kn.leetcode.problems.hard;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeCoveringElementsFromKLists632 {

  static class Node {

    private final int listIndex;
    private int elementIndex;

    public Node(int listIndex, int elementIndex) {
      this.listIndex = listIndex;
      this.elementIndex = elementIndex;
    }
  }

  public int[] smallestRange(List<List<Integer>> nums) {
    PriorityQueue<Node> minHeap = new PriorityQueue<>(
        Comparator.comparingInt(node -> nums.get(node.listIndex).get(node.elementIndex))
    );

    int currentMax = Integer.MIN_VALUE;
    for (int i = 0; i < nums.size(); i++) {
      minHeap.add(new Node(i, 0));
      currentMax = Math.max(currentMax, nums.get(i).get(0));
    }

    int startRange = 0;
    int endRange = Integer.MAX_VALUE;
    while (minHeap.size() == nums.size()) {
      Node node = minHeap.poll();
      List<Integer> currentList = nums.get(node.listIndex);
      int currentMin = currentList.get(node.elementIndex);
      if (currentMax - currentMin < endRange - startRange) {
        startRange = currentMin;
        endRange = currentMax;
      }

      node.elementIndex++;
      if (node.elementIndex < currentList.size()) {
        minHeap.add(node);
        currentMax = Math.max(currentMax, currentList.get(node.elementIndex));
      }
    }

    return new int[]{startRange, endRange};
  }
}
