package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {

  private int[] preorder;
  private final Map<Integer, Integer> inorderIndices = new HashMap<>();
  private int preorderIndex;

  public TreeNode buildTree(int[] preorder, int[] inorder) {
    this.preorder = preorder;
    for (int i = 0; i < inorder.length; i++) {
      inorderIndices.put(inorder[i], i);
    }
    preorderIndex = 0;
    return buildNode(0, inorder.length - 1);
  }

  private TreeNode buildNode(int leftInorderIndex, int rightPreorderIndex) {
    if (leftInorderIndex > rightPreorderIndex) {
      return null;
    }
    int nodeValue = preorder[preorderIndex];
    TreeNode node = new TreeNode(nodeValue);
    int inorderIndex = inorderIndices.get(nodeValue);
    preorderIndex++;
    node.left = buildNode(leftInorderIndex, inorderIndex - 1);
    node.right = buildNode(inorderIndex + 1, rightPreorderIndex);
    return node;
  }
}
