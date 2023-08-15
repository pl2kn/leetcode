package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

class PartitionList86Test {

  @Test
  public void Test_Case_1() {
    PartitionList86 solution = new PartitionList86();
    solution.partition(new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(5)))))), 3);
  }
}