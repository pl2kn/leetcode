package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class ReverseLinkedListII92 {

  public ListNode reverseBetween(ListNode head, int left, int right) {
    if (left == right) {
      return head;
    }

    ListNode current = head;
    ListNode previous = null;
    for (int i = 0; i < left - 1; i++) {
      previous = current;
      current = current.next;
    }

    ListNode firstEnd = previous;
    ListNode secondStart = current;
    ListNode reversedHead = null;

    for (int i = left; i <= right; i++) {
      ListNode next = current.next;
      current.next = reversedHead;
      reversedHead = current;
      current = next;
    }

    if (firstEnd != null) {
      firstEnd.next = reversedHead;
    } else {
      head = reversedHead;
    }

    secondStart.next = current;

    return head;
  }
}
