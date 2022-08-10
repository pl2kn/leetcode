package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

public class ConvertSortedArrayToBinarySearchTree108 {

  public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums, 0, nums.length - 1);
  }

  private TreeNode helper(int[] nums, int left, int right) {
    if (left > right) {
      return null;
    }

    int mid = left + (right - left) / 2;

    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums, left, mid - 1);
    node.right = helper(nums, mid + 1, right);

    return node;
  }
}
