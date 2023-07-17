package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class AddTwoNumbersII445 {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    l1 = reverse(l1);
    l2 = reverse(l2);

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int value = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
      current.next = new ListNode(value % 10);
      current = current.next;

      carry = value / 10;

      if (l1 != null) {
        l1 = l1.next;
      }

      if (l2 != null) {
        l2 = l2.next;
      }
    }

    current.next = carry > 0 ? new ListNode(carry) : null;

    return reverse(dummy.next);
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
}
