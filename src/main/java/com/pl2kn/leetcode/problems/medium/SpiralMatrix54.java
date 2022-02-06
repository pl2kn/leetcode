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
    while (result.size() < m * n) {
      for (int j = left; j <= right; j++) {
        result.add(matrix[top][j]);
      }
      for (int i = top + 1; i <= bottom; i++) {
        result.add(matrix[i][right]);
      }
      if (top != bottom) {
        for (int j = right - 1; j >= left; j--) {
          result.add(matrix[bottom][j]);
        }
      }
      if (left != right) {
        for (int i = bottom - 1; i >= top + 1; i--) {
          result.add(matrix[i][left]);
        }
      }
      top++;
      left++;
      right--;
      bottom--;
    }
    return result;
  }
}
