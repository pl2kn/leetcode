package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class IntersectionOfTwoLinkedLists160 {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode pointerA = headA;
    ListNode pointerB = headB;
    while (pointerA != pointerB) {
      pointerA = pointerA == null ? headB : pointerA.next;
      pointerB = pointerB == null ? headA : pointerB.next;
    }
    return pointerA;
  }
}
