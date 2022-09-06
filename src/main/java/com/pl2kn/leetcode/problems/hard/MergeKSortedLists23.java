package com.pl2kn.leetcode.problems.hard;

import com.pl2kn.leetcode.problems.common.ListNode;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists23 {

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

    for (ListNode root : lists) {
      if (root != null) {
        minHeap.add(root);
      }
    }

    ListNode sentinel = new ListNode(0);
    ListNode current = sentinel;
    while (!minHeap.isEmpty()) {
      ListNode node = minHeap.poll();
      current.next = node;
      current = current.next;

      if (node.next != null) {
        minHeap.add(node.next);
      }
    }

    return sentinel.next;
  }
}
