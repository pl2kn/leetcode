package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PathSum112IterativeTest {

  @Test
  public void Simple_Test() {
    TreeNode n1 = new TreeNode(5);
    TreeNode n2 = new TreeNode(4);
    TreeNode n3 = new TreeNode(8);
    TreeNode n4 = new TreeNode(11);
    TreeNode n5 = new TreeNode(13);
    TreeNode n6 = new TreeNode(4);
    TreeNode n7 = new TreeNode(7);
    TreeNode n8 = new TreeNode(2);
    TreeNode n9 = new TreeNode(1);
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n4.left = n7;
    n4.right = n8;
    n3.left = n5;
    n3.right = n6;
    n6.right = n9;
    PathSum112Iterative solution = new PathSum112Iterative();
    assertTrue(solution.hasPathSum(n1, 22));
  }
}
