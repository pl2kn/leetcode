package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.ListNode;
import com.pl2kn.leetcode.problems.common.TreeNode;

public class LinkedListInBinaryTree1367 {

  public boolean isSubPath(ListNode head, TreeNode root) {
    if (head == null) {
      return true;
    }

    if (root == null) {
      return false;
    }

    return dfs(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
  }

  private boolean dfs(ListNode node, TreeNode treeNode) {
    if (node == null) {
      return true;
    }

    if (treeNode == null) {
      return false;
    }

    return node.val == treeNode.val && (dfs(node.next, treeNode.left) || dfs(node.next, treeNode.right));
  }
}
