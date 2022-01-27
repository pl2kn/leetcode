package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;

public class OddEvenLinkedList328 {

  public ListNode oddEvenList(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    ListNode oddSentinel = new ListNode(0);
    ListNode currentOdd = oddSentinel;
    ListNode evenSentinel = new ListNode(0);
    ListNode currentEven = evenSentinel;
    ListNode current = head;
    int index = 1;
    while (current != null) {
      ListNode next = current.next;
      current.next = null;
      if (index++ % 2 == 0) {
        currentEven.next = current;
        currentEven = current;
      } else {
        currentOdd.next = current;
        currentOdd = current;
      }
      current = next;
    }
    currentOdd.next = evenSentinel.next;
    return oddSentinel.next;
  }
}
