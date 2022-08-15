package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class RotateList61 {

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null) {
      return head;
    }

    int length = 1;
    ListNode lastNode = head;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      length++;
    }

    lastNode.next = head;

    lastNode = head;
    for (int i = 0; i < length - (k % length) - 1; i++) {
      lastNode = lastNode.next;
    }

    head = lastNode.next;
    lastNode.next = null;

    return head;
  }
}
