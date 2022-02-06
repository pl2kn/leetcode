package com.pl2kn.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle118 {

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    for (int i = 0; i < numRows; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          row.add(1);
        } else {
          row.add(triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1));
        }
      }
      triangle.add(row);
    }
    return triangle;
  }
}
