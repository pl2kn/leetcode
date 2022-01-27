package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class OddEvenLinkedList328Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    ListNode a6 = new ListNode(6);
    ListNode a7 = new ListNode(7);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    a5.next = a6;
    a6.next = a7;
    OddEvenLinkedList328 solution = new OddEvenLinkedList328();
    assertEquals(a1, solution.oddEvenList(a1));
  }

  @Test
  public void Null_Test() {
    OddEvenLinkedList328 solution = new OddEvenLinkedList328();
    assertNull(solution.oddEvenList(null));
  }

  @Test
  public void One_Node_Test() {
    ListNode a1 = new ListNode(1);
    OddEvenLinkedList328 solution = new OddEvenLinkedList328();
    assertEquals(a1, solution.oddEvenList(a1));
  }

  @Test
  public void Two_Nodes_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    a1.next = a2;
    OddEvenLinkedList328 solution = new OddEvenLinkedList328();
    assertEquals(a1, solution.oddEvenList(a1));
  }
}
