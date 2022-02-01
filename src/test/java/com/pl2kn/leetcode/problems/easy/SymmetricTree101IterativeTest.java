package com.pl2kn.leetcode.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

public class SymmetricTree101IterativeTest {

  @Test
  public void Simple_Test() {
    TreeNode n1 = new TreeNode(1);
    TreeNode n2 = new TreeNode(2);
    TreeNode n3 = new TreeNode(2);
    TreeNode n4 = new TreeNode(3);
    TreeNode n5 = new TreeNode(4);
    TreeNode n6 = new TreeNode(4);
    TreeNode n7 = new TreeNode(3);
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.left = n6;
    n3.right = n7;
    SymmetricTree101Iterative solution = new SymmetricTree101Iterative();
    assertTrue(solution.isSymmetric(n1));
  }
}
