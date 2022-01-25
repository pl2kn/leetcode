package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class LinkedListCycleII142 {

  private ListNode getIntersection(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return slow;
      }
    }
    return null;
  }

  public ListNode detectCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode intersection = getIntersection(head);
    if (intersection == null) {
      return null;
    }
    ListNode p = head;
    ListNode q = intersection;
    while (p != q) {
      p = p.next;
      q = q.next;
    }
    return q;
  }
}
