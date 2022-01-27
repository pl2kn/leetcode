package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class PalindromeLinkedList234Test {

  @Test
  public void Even_Nodes_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(2);
    ListNode a4 = new ListNode(1);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    PalindromeLinkedList234 solution = new PalindromeLinkedList234();
    assertTrue(solution.isPalindrome(a1));
  }

  @Test
  public void Two_Nodes_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    a1.next = a2;
    PalindromeLinkedList234 solution = new PalindromeLinkedList234();
    assertTrue(solution.isPalindrome(a1));
  }

  @Test
  public void Three_Nodes_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(1);
    a1.next = a2;
    a2.next = a3;
    PalindromeLinkedList234 solution = new PalindromeLinkedList234();
    assertTrue(solution.isPalindrome(a1));
  }
}
