package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class ReverseLinkedList206 {

  public ListNode reverseList(ListNode head) {
    ListNode currentHead = null;
    ListNode current = head;
    while (current != null) {
      ListNode next = current.next;
      current.next = currentHead;
      currentHead = current;
      current = next;
    }
    return currentHead;
  }
}
