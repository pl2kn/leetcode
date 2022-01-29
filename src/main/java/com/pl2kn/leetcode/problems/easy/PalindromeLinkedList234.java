package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.ListNode;

public class PalindromeLinkedList234 {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode reversedHead = reverse(slow);
    while (reversedHead != null) {
      if (reversedHead.val != head.val) {
        return false;
      }
      reversedHead = reversedHead.next;
      head = head.next;
    }
    return true;
  }

  private ListNode reverse(ListNode head) {
    ListNode current = head;
    ListNode newHead = null;
    while (current != null) {
      ListNode next = current.next;
      current.next = newHead;
      newHead = current;
      current = next;
    }
    return newHead;
  }
}
