package com.pl2kn.leetcode.problems.medium;


import com.pl2kn.leetcode.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

public class BinaryTreeLevelOrderTraversal102IterativeTest {

  @Test
  public void Simple_Test() {
    TreeNode n3 = new TreeNode(3);
    TreeNode n9 = new TreeNode(9);
    TreeNode n20 = new TreeNode(20);
    TreeNode n15 = new TreeNode(15);
    TreeNode n7 = new TreeNode(7);
    n3.left = n9;
    n3.right = n20;
    n20.left = n15;
    n20.right = n7;
    BinaryTreeLevelOrderTraversal102Iterative solution = new BinaryTreeLevelOrderTraversal102Iterative();
    solution.levelOrder(n3);
  }
}
