package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;
import java.util.Random;

public class LinkedListRandomNode382 {

  class Solution {

    private final ListNode head;
    private final Random random;

    public Solution(ListNode h) {
      head = h;
      random = new Random();
    }

    public int getRandom() {
      ListNode result = head;
      ListNode current = head;
      int i = 0;
      while (current != null) {
        if (random.nextInt(i + 1) == i++) {
          result = current;
        }
        current = current.next;
      }
      return result.val;
    }
  }
}
