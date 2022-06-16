package com.pl2kn.leetcode.problems.medium;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateSubtrees652 {

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    List<TreeNode> result = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    postorder(root, map, result);

    return result;
  }

  private String postorder(TreeNode node, Map<String, Integer> map, List<TreeNode> result) {
    if (node == null) {
      return "#";
    }

    String hash = node.val + ',' + postorder(node.left, map, result) + ',' + postorder(node.right, map, result);

    map.put(hash, map.getOrDefault(hash, 0) + 1);

    if (map.get(hash) == 2)  {
      result.add(node);
    }

    return hash;
  }
}
