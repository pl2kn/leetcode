package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class SwappingNodesInALinkedList1721 {

  public ListNode swapNodes(ListNode head, int k) {
    ListNode sentinel = new ListNode(0, head);

    ListNode fast = sentinel;
    for (int i = 1; i <= k; i++) {
      fast = fast.next;
    }
    ListNode first = fast;

    ListNode slow = sentinel;
    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    ListNode second = slow;

    int tmp = first.val;
    first.val = second.val;
    second.val = tmp;

    return sentinel.next;
  }
}
