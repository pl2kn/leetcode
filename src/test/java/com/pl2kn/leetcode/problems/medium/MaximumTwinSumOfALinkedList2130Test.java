package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

class MaximumTwinSumOfALinkedList2130Test {

  @Test
  public void Test_Case_1() {
    MaximumTwinSumOfALinkedList2130 solution = new MaximumTwinSumOfALinkedList2130();
    assertEquals(6, solution.pairSum(new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))))));
  }
}