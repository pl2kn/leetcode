package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class AddTwoNumbers2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sentinel = new ListNode(-1);
    ListNode currentDigit = sentinel;
    int decade = 0;
    while (l1 != null && l2 != null) {
      int value = l1.val + l2.val + decade;
      currentDigit.next = new ListNode(value % 10);
      currentDigit = currentDigit.next;
      decade = value / 10;
      l1 = l1.next;
      l2 = l2.next;
    }
    ListNode extraHead = l1 != null ? l1 : l2;
    while (extraHead != null) {
      int value = extraHead.val + decade;
      currentDigit.next = new ListNode(value % 10);
      currentDigit = currentDigit.next;
      decade = value / 10;
      extraHead = extraHead.next;
    }
    if (decade > 0) {
      currentDigit.next = new ListNode(decade);
    }
    return sentinel.next;
  }
}
