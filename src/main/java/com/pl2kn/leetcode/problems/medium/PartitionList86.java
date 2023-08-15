package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class PartitionList86 {

  public ListNode partition(ListNode head, int x) {
    ListNode dummyLeft = new ListNode(0);
    ListNode currentLeft = dummyLeft;
    ListNode dummyRight = new ListNode(0);
    ListNode currentRight = dummyRight;

    while (head != null) {
      if (head.val < x) {
        currentLeft.next = head;
        currentLeft = currentLeft.next;
      } else {
        currentRight.next = head;
        currentRight = currentRight.next;
      }

      head = head.next;
    }

    currentRight.next = null;
    currentLeft.next = dummyRight.next;

    return dummyLeft.next;
  }
}
