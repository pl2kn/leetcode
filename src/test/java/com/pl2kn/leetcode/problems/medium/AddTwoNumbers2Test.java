package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class AddTwoNumbers2Test {

  @Test
  public void Simple_Test() {
    ListNode a1 = new ListNode(2);
    ListNode a2 = new ListNode(4);
    ListNode a3 = new ListNode(3);
    a1.next = a2;
    a2.next = a3;
    ListNode b1 = new ListNode(5);
    ListNode b2 = new ListNode(6);
    ListNode b3 = new ListNode(4);
    b1.next = b2;
    b2.next = b3;
    AddTwoNumbers2 solution = new AddTwoNumbers2();
    solution.addTwoNumbers(a1, b1);
  }

  @Test
  public void Longer_Number_Test() {
    ListNode a1 = new ListNode(9);
    ListNode a2 = new ListNode(9);
    ListNode a3 = new ListNode(9);
    ListNode a4 = new ListNode(9);
    ListNode a5 = new ListNode(9);
    ListNode a6 = new ListNode(9);
    ListNode a7 = new ListNode(9);
    a1.next = a2;
    a2.next = a3;
    a3.next = a4;
    a4.next = a5;
    a5.next = a6;
    a6.next = a7;
    ListNode b1 = new ListNode(9);
    ListNode b2 = new ListNode(9);
    ListNode b3 = new ListNode(9);
    ListNode b4 = new ListNode(9);
    b1.next = b2;
    b2.next = b3;
    b3.next = b4;
    AddTwoNumbers2 solution = new AddTwoNumbers2();
    solution.addTwoNumbers(a1, b1);
  }
}
