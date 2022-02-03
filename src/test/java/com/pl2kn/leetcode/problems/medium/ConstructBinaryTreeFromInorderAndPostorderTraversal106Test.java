package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106Test {

  @Test
  public void Simple_Test() {
    int[] inorder = new int[]{9, 3, 15, 20, 7};
    int[] postorder = new int[]{9, 15, 7, 20, 3};
    ConstructBinaryTreeFromInorderAndPostorderTraversal106 solution = new ConstructBinaryTreeFromInorderAndPostorderTraversal106();
    solution.buildTree(inorder, postorder);
  }
}
