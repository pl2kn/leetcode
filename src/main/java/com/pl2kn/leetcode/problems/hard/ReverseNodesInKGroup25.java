package com.pl2kn.leetcode.problems.hard;

import com.pl2kn.leetcode.problems.common.ListNode;

public class ReverseNodesInKGroup25 {

  public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k <= 1) {
      return head;
    }

    ListNode previousSubArrayEnd = null;
    ListNode current = head;

    while (true) {
      ListNode subArrayStart = current;

      int nodeCount = 0;
      while (current != null && nodeCount < k - 1) {
        current = current.next;
        nodeCount++;
      }

      if (current == null) {
        previousSubArrayEnd.next = subArrayStart;
        break;
      }

      ListNode subArrayCurrent = subArrayStart;
      ListNode reversedHead = null;
      for (int i = 0; i < k; i++) {
        ListNode next = subArrayCurrent.next;
        subArrayCurrent.next = reversedHead;
        reversedHead = subArrayCurrent;
        subArrayCurrent = next;
      }

      if (previousSubArrayEnd != null) {
        previousSubArrayEnd.next = reversedHead;
      } else {
        head = reversedHead;
      }

      previousSubArrayEnd = subArrayStart;
      current = subArrayCurrent;
    }

    return head;
  }
}
