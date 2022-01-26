package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class RemoveLinkedListElements203Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(3);
    ListNode a4 = new ListNode(4);
    ListNode a5 = new ListNode(5);
    ListNode a6 = new ListNode(6);
    ListNode a7 = new ListNode(6);
    a1.next = a2;
    a2.next = a7;
    a7.next = a3;
    a3.next = a4;
    a4.next = a5;
    a5.next = a6;
    RemoveLinkedListElements203 solution = new RemoveLinkedListElements203();
    assertEquals(a1, solution.removeElements(a1, 6));
  }

  @Test
  public void Duplicate_List_Test() {
    ListNode a1 = new ListNode(7);
    ListNode a2 = new ListNode(7);
    ListNode a3 = new ListNode(7);
    ListNode a4 = new ListNode(7);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    RemoveLinkedListElements203 solution = new RemoveLinkedListElements203();
    assertNull(solution.removeElements(a1, 7));
  }
}
