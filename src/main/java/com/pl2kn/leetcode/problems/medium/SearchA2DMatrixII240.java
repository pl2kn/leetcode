package com.pl2kn.leetcode.problems.medium;

public class SearchA2DMatrixII240 {

  public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0) {
      return false;
    }

    return search(matrix, target, 0, 0, matrix[0].length - 1, matrix.length - 1);

  }

  private boolean search(int[][] matrix, int target, int left, int up, int right, int down) {
    if (left > right || up > down) {
      return false;
    }

    if (target < matrix[up][left] || target > matrix[down][right]) {
      return false;
    }

    int mid = left + (right - left) / 2;
    int row = up;
    while (row <= down && matrix[row][mid] <= target) {
      if (matrix[row][mid] == target) {
        return true;
      }
      row++;
    }

    return search(matrix, target, left, row, mid - 1, down) || search(matrix, target, mid + 1, up, right, row - 1);
  }
}
