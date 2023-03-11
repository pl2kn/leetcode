package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;
import com.pl2kn.leetcode.problems.common.TreeNode;

public class ConvertSortedListToBinarySearchTree109 {

  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) {
      return null;
    }

    if (head.next == null) {
      return new TreeNode(head.val);
    }

    ListNode slow = head;
    ListNode fast = head.next.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    ListNode middle = slow.next;
    slow.next = null;

    TreeNode treeNode = new TreeNode(middle.val);
    treeNode.left = sortedListToBST(head);
    treeNode.right = sortedListToBST(middle.next);

    return treeNode;
  }
}
