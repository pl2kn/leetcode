package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class LinkedListCycle141 {

  public boolean hasCycle(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}