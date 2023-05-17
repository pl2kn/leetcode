package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class MaximumTwinSumOfALinkedList2130 {

  public int pairSum(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;

    while (fast != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode reversedHalf = reverse(slow);
    int result = 0;
    while (reversedHalf != null) {
      result = Math.max(result, head.val + reversedHalf.val);
      head = head.next;
      reversedHalf = reversedHalf.next;
    }

    return result;
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
