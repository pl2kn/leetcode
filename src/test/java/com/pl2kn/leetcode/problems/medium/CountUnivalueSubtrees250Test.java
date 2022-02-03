package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import com.pl2kn.leetcode.problems.common.TreeNode;
import org.junit.jupiter.api.Test;

public class CountUnivalueSubtrees250Test {

  @Test
  public void Simple_Test() {
    TreeNode n1 = new TreeNode(5);
    TreeNode n2 = new TreeNode(1);
    TreeNode n3 = new TreeNode(5);
    TreeNode n4 = new TreeNode(5);
    TreeNode n5 = new TreeNode(5);
    TreeNode n6 = new TreeNode(5);
    n1.left = n2;
    n1.right = n3;
    n2.left = n4;
    n2.right = n5;
    n3.right = n6;
    CountUnivalueSubtrees250 solution = new CountUnivalueSubtrees250();
    assertEquals(4, solution.countUnivalSubtrees(n1));
  }

  @Test
  public void Three_Node_Test() {
    TreeNode n1 = new TreeNode(5);
    TreeNode n2 = new TreeNode(5);
    TreeNode n3 = new TreeNode(1);
    n1.left = n2;
    n1.right = n3;
    CountUnivalueSubtrees250 solution = new CountUnivalueSubtrees250();
    assertEquals(2, solution.countUnivalSubtrees(n1));
  }
}
