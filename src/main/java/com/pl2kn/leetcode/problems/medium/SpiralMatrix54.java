package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix54 {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();
    int m = matrix.length;
    int n = matrix[0].length;
    int left = 0;
    int right = n - 1;
    int top = 0;
    int bottom = m - 1;
    int row = 0;
    int col = 0;
    while (result.size() < m * n) {
      while (col <= right && result.size() < m * n) {
        result.add(matrix[top][col++]);
      }
      row = top + 1;
      while (row <= bottom && result.size() < m * n) {
        result.add(matrix[row++][right]);
      }
      col = right - 1;
      while (col >= left && result.size() < m * n) {
        result.add(matrix[bottom][col--]);
      }
      row = bottom - 1;
      while (row > top && result.size() < m * n) {
        result.add(matrix[row--][left]);
      }
      top++;
      left++;
      right--;
      bottom--;
      row = top;
      col = left;
    }
    return result;
  }
}
