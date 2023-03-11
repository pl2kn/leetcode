package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;
import org.junit.jupiter.api.Test;

public class ConvertSortedListToBinarySearchTree109Test {

  @Test
  public void Test_Case_1() {
    ListNode head = new ListNode(-10,
        new ListNode(-3,
            new ListNode(0,
                new ListNode(5,
                    new ListNode(9)
                )
            )
        )
    );
    ConvertSortedListToBinarySearchTree109 solution = new ConvertSortedListToBinarySearchTree109();
    solution.sortedListToBST(head);
  }
}
