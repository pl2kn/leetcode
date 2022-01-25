package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class IntersectionOfTwoLinkedLists160Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(0);
    ListNode a2 = new ListNode(0);
    ListNode a3 = new ListNode(0);
    ListNode a4 = new ListNode(0);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    ListNode b1 = new ListNode(0);
    ListNode b2 = new ListNode(0);
    b1.next = b2;
    ListNode c1 = new ListNode(0);
    ListNode c2 = new ListNode(0);
    ListNode c3 = new ListNode(0);
    c1.next = c2;
    c2.next = c3;
    a4.next = c1;
    b2.next = c1;
    IntersectionOfTwoLinkedLists160 solution = new IntersectionOfTwoLinkedLists160();
    assertEquals(c1, solution.getIntersectionNode(a1, b1));
  }
}
