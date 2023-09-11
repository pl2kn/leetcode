package com.pl2kn.leetcode.problems.hard;

import com.pl2kn.leetcode.problems.common.TreeNode;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree297 {

  public class Codec {

    private static final String SPLITTER = ",";
    private static final String NULL_NODE = "#";

    public String serialize(TreeNode root) {
      String string = serialize(new StringBuilder(), root).toString();
      System.out.println(string);
      return string;
    }

    private StringBuilder serialize(StringBuilder stringBuilder, TreeNode root) {
      if (root == null) {
        return stringBuilder.append(NULL_NODE).append(SPLITTER);
      }

      stringBuilder.append(root.val).append(SPLITTER);
      serialize(stringBuilder, root.left);
      serialize(stringBuilder, root.right);

      return stringBuilder;
    }

    public TreeNode deserialize(String data) {
      return deserialize(new LinkedList<>(Arrays.asList(data.split(","))));
    }

    private TreeNode deserialize(Queue<String> queue) {
      String value = queue.poll();

      if (value.equals(NULL_NODE)) {
        return null;
      }

      TreeNode node = new TreeNode(Integer.parseInt(value));
      node.left = deserialize(queue);
      node.right = deserialize(queue);

      return node;
    }
  }
}
