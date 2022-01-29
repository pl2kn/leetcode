package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class MergeTwoSortedLists21 {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode sentinel = new ListNode(0);
    ListNode currentHead = sentinel;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        currentHead.next = list1;
        list1 = list1.next;
      } else {
        currentHead.next = list2;
        list2 = list2.next;
      }
      currentHead = currentHead.next;
    }
    currentHead.next = list1 == null ? list2 : list1;
    return sentinel.next;
  }
}
