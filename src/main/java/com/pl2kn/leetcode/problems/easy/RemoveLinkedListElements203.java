package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class RemoveLinkedListElements203 {

  public ListNode removeElements(ListNode head, int val) {
    ListNode sentinel = new ListNode(0);
    sentinel.next = head;
    ListNode current = head;
    ListNode previous = sentinel;
    while (current != null) {
      if (current.val == val) {
        previous.next = current.next;
      } else {
        previous = previous.next;
      }
      current = current.next;
    }
    return sentinel.next;
  }
}
