package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class RemoveNthNodeFromEndOfList19 {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode sentinel = new ListNode(0);
    sentinel.next = head;
    ListNode pointer = sentinel;
    for (int i = 0; i <= n; i++) {
      pointer = pointer.next;
    }
    ListNode delayedPointer = sentinel;
    while (pointer != null) {
      pointer = pointer.next;
      delayedPointer = delayedPointer.next;
    }
    delayedPointer.next = delayedPointer.next.next;
    return sentinel.next;
  }
}
