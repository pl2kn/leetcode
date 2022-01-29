package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class AddTwoNumbers2 {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode sentinel = new ListNode(-1);
    ListNode currentDigit = sentinel;
    int carry = 0;
    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;
      int sum = x + y + carry;
      currentDigit.next = new ListNode(sum % 10);
      currentDigit = currentDigit.next;
      carry = sum / 10;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry > 0) {
      currentDigit.next = new ListNode(carry);
    }
    return sentinel.next;
  }
}
