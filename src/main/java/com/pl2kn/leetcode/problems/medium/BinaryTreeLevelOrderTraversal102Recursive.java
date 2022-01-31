package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal102Recursive {

  List<List<Integer>> levels = new ArrayList<List<Integer>>();

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return levels;
    }
    visit(root, 0);
    return levels;
  }

  private void visit(TreeNode node, int level) {
    if (levels.size() == level) {
      levels.add(new ArrayList<>());
    }
    levels.get(level).add(node.val);
    if (node.left != null) {
      visit(node.left, level + 1);
    }
    if (node.right != null) {
      visit(node.right, level + 1);
    }
  }
}
