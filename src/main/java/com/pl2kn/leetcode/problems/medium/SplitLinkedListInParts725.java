package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class SplitLinkedListInParts725 {

  public ListNode[] splitListToParts(ListNode head, int k) {
    int n = 0;
    ListNode current = head;
    while (current != null) {
      current = current.next;
      n++;
    }

    ListNode[] result = new ListNode[k];
    current = head;
    for (int i = 0; i < k; i++) {
      result[i] = current;
      int nodeCount = n / k + (i < n % k ? 1 : 0);
      for (int j = 0; j < nodeCount - 1 && current != null; j++) {
        current = current.next;
      }

      if (current != null) {
        ListNode next = current.next;
        current.next = null;
        current = next;
      }
    }

    return result;
  }
}
