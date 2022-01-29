package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class MergeTwoSortedLists21Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(1);
    ListNode a2 = new ListNode(2);
    ListNode a3 = new ListNode(4);
    a1.next = a2;
    a2.next = a3;
    ListNode b1 = new ListNode(1);
    ListNode b2 = new ListNode(3);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;
    MergeTwoSortedLists21 solution = new MergeTwoSortedLists21();
    assertEquals(a1 , solution.mergeTwoLists(a1, b1));
  }
}
