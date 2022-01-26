package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveNthNodeFromEndOfList19Test {

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
    RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();
    assertEquals(a1, solution.removeNthFromEnd(a1, 2));
  }

  @Test
  public void Two_Nodes_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    a1.next = a2;
    RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();
    assertEquals(a1, solution.removeNthFromEnd(a1, 1));
  }

  @Test
  public void Two_Nodes_Second_From_The_End_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    a1.next = a2;
    RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();
    assertEquals(a2, solution.removeNthFromEnd(a1, 2));
  }

  @Test
  public void One_Node_Test() {
    ListNode a1 = new ListNode(1);
    RemoveNthNodeFromEndOfList19 solution = new RemoveNthNodeFromEndOfList19();
    assertNull(solution.removeNthFromEnd(a1, 1));
  }
}
