package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class ReverseNodesInEvenLengthGroups2074 {

  public ListNode reverseEvenLengthGroups(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    int groupLength = 0;
    ListNode current = head;
    ListNode previous = null;
    ListNode previousGroupEnd = head;
    while (current != null) {
      groupLength++;
      ListNode groupStart = current;

      int nodeCount = 0;

      while (current != null && nodeCount < groupLength) {
        previous = current;
        current = current.next;
        nodeCount++;
      }

      if (nodeCount % 2 != 0) {
        previousGroupEnd = previous;
        continue;
      }

      ListNode groupCurrent = groupStart;
      ListNode reversedHead = current;
      for (int i = 0; i < nodeCount; i++) {
        ListNode next = groupCurrent.next;
        groupCurrent.next = reversedHead;
        reversedHead = groupCurrent;
        groupCurrent = next;
      }

      previousGroupEnd.next = reversedHead;
      previousGroupEnd = groupStart;
    }

    return head;
  }
}
