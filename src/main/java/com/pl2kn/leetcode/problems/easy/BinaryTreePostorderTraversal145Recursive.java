package com.pl2kn.leetcode.problems.easy;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal145Recursive {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    visit(root, result);
    return result;
  }

  private void visit(TreeNode node, List<Integer> list) {
    if (node == null) {
      return;
    }
    visit(node.left, list);
    visit(node.right, list);
    list.add(node.val);
  }
}
