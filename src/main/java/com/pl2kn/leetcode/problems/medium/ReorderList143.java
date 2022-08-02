package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class ReorderList143 {

  public void reorderList(ListNode head) {
    ListNode reversedMiddle = reverse(getMiddle(head));

    while (reversedMiddle.next != null) {
      ListNode next = head.next;
      head.next = reversedMiddle;
      head = next;

      next = reversedMiddle.next;
      reversedMiddle.next = head;
      reversedMiddle = next;
    }
  }

  private ListNode reverse(ListNode head) {
    ListNode newHead = null;

    while (head != null) {
      ListNode next = head.next;
      head.next = newHead;
      newHead = head;
      head = next;
    }

    return newHead;
  }

  private ListNode getMiddle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    return slow;
  }
}
