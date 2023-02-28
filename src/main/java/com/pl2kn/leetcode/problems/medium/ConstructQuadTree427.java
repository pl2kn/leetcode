package com.pl2kn.leetcode.problems.medium;

public class ConstructQuadTree427 {

  public Node construct(int[][] grid) {
    return construct(grid, 0, 0, grid.length);
  }

  private Node construct(int[][] grid, int row, int col, int length) {
    if (isLeaf(grid, row, col, length)) {
      return new Node(grid[row][col] == 1, true);
    }

    Node node = new Node(false, false);
    node.topLeft = construct(grid, row, col, length / 2);
    node.topRight = construct(grid, row, col + length / 2, length / 2);
    node.bottomLeft = construct(grid, row + length / 2, col, length / 2);
    node.bottomRight = construct(grid, row + length / 2, col + length / 2, length / 2);

    return node;
  }

  private boolean isLeaf(int[][] grid, int row, int col, int length) {
    for (int i = row; i < row + length; i++) {
      for (int j = col; j < col + length; j++) {
        if (grid[i][j] != grid[row][col]) {
          return false;
        }
      }
    }

    return true;
  }

  static class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
      this.val = false;
      this.isLeaf = false;
      this.topLeft = null;
      this.topRight = null;
      this.bottomLeft = null;
      this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
      this.val = val;
      this.isLeaf = isLeaf;
      this.topLeft = null;
      this.topRight = null;
      this.bottomLeft = null;
      this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
      this.val = val;
      this.isLeaf = isLeaf;
      this.topLeft = topLeft;
      this.topRight = topRight;
      this.bottomLeft = bottomLeft;
      this.bottomRight = bottomRight;
    }
  };
}
