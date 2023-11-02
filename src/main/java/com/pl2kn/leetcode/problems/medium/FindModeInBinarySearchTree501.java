package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree501 {

  private TreeNode previous;
  private int maxCount;
  private int currentCount;
  private List<Integer> list;

  public int[] findMode(TreeNode root) {
    currentCount = 1;
    maxCount = 1;
    list = new ArrayList<>();

    traverse(root);

    int[] result = new int[list.size()];

    for (int i = 0; i < result.length; i++) {
      result[i] = list.get(i);
    }

    return result;
  }

  private void traverse(TreeNode node) {
    if (node == null) {
      return;
    }

    traverse(node.left);

    if (previous != null) {
      if (previous.val == node.val) {
        currentCount++;
      } else {
        currentCount = 1;
      }
    }

    if (currentCount > maxCount) {
      maxCount = currentCount;
      list.clear();
      list.add(node.val);
    } else if (currentCount == maxCount) {
      list.add(node.val);
    }

    previous = node;

    traverse(node.right);
  }
}
