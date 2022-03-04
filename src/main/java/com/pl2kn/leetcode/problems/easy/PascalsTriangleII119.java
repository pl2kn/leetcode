package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII119 {

  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i <= rowIndex; i++) {
      result.add(getRow(rowIndex, i));
    }
    return result;
  }

  private int getRow(int row, int col) {
    if (row == 0 || col == 0 || row == col) {
      return 1;
    }
    return getRow(row - 1, col - 1) + getRow(row - 1, col);
  }
}
