package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class MergeTwoSortedLists21 {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode sentinel = new ListNode(0);
    ListNode currentHead = sentinel;
    ListNode current1 = list1;
    ListNode current2 = list2;
    while (current1 != null && current2 != null) {
      if (current1.val < current2.val) {
        currentHead.next = current1;
        currentHead = current1;
        current1 = current1.next;
      } else {
        currentHead.next = current2;
        currentHead = current2;
        current2 = current2.next;
      }
    }
    while (current1 != null) {
      currentHead.next = current1;
      currentHead = current1;
      current1 = current1.next;
    }
    while (current2 != null) {
      currentHead.next = current2;
      currentHead = current2;
      current2 = current2.next;
    }
    return sentinel.next;
  }
}
