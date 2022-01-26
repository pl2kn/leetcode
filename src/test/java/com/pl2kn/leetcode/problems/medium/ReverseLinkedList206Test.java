package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import com.pl2kn.leetcode.problems.easy.ReverseLinkedList206;
import org.junit.jupiter.api.Test;

public class ReverseLinkedList206Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    ReverseLinkedList206 solution = new ReverseLinkedList206();
    assertEquals(a5, solution.reverseList(a1));
  }
}
