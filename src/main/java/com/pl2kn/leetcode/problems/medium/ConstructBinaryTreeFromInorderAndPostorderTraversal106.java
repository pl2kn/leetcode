package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {

  private Map<Integer, Integer> inorderIds = new HashMap<>();
  private int[] postorder;
  private int postorderIndex;

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    this.postorder = postorder;
    postorderIndex = postorder.length - 1;
    for (int i = 0; i < inorder.length; i++) {
      inorderIds.put(inorder[i], i);
    }
    return buildNode(0, inorder.length - 1);
  }

  private TreeNode buildNode(int leftInorderIndex, int rightInorderIndex) {
    if (leftInorderIndex > rightInorderIndex) {
      return null;
    }
    int value = postorder[postorderIndex];
    TreeNode node = new TreeNode(value);
    postorderIndex--;
    int inorderIndex = inorderIds.get(value);
    node.right = buildNode(inorderIndex + 1, rightInorderIndex);
    node.left = buildNode(leftInorderIndex, inorderIndex - 1);
    return node;
  }
}
