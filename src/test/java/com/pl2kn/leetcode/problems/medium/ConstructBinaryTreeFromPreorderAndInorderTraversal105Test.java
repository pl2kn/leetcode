package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105Test {

    @Test
    public void Simple_Test() {
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        ConstructBinaryTreeFromPreorderAndInorderTraversal105 solution = new ConstructBinaryTreeFromPreorderAndInorderTraversal105();
        solution.buildTree(preorder, inorder);
    }
}
