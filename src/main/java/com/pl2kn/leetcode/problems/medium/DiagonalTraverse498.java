package com.pl2kn.leetcode.problems.medium;

public class DiagonalTraverse498 {

  public int[] findDiagonalOrder(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    int[] result = new int[m * n];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < m && j < n) {
      result[k++] = mat[i][j];
      if ((j + i) % 2 == 0) {
        if (i != 0 && j < n - 1) {
          j++;
          i--;
        } else {
          if (j < n - 1) {
            j++;
          } else {
            i++;
          }
        }
      } else {
        if (j != 0 && i < m - 1) {
          j--;
          i++;
        } else {
          if (i < m - 1) {
            i++;
          } else {
            j++;
          }
        }
      }
    }
    return result;
  }
}
