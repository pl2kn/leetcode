package com.pl2kn.leetcode.problems.easy;

public class LinkedListCycle141 {

  private static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
      next = null;
    }
  }

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode slowPointer = head;
    ListNode fastPointer = head.next;
    while (fastPointer != null && slowPointer != fastPointer) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next;
      if (fastPointer != null) {
        fastPointer = fastPointer.next;
      }
    }
    return slowPointer == fastPointer;
  }
}
