package com.pl2kn.leetcode.problems.hard;

import java.util.HashSet;
import java.util.Set;

public class NQueensII52 {

  private int n;
  private int count;
  private final Set<Integer> cols = new HashSet<>();
  private final Set<Integer> diagonals = new HashSet<>();
  private final Set<Integer> antiDiagonals = new HashSet<>();

  public int totalNQueens(int n) {
    this.n = n;
    return backtrack(0);
  }

  private int backtrack(int row) {
    if (row == n) {
      count++;
    }

    for (int col = 0; col < n; col++) {
      int diagonal = row - col;
      int antiDiagonal = row + col;

      if (cols.contains(col) || diagonals.contains(diagonal) || antiDiagonals.contains(antiDiagonal)) {
        continue;
      }

      cols.add(col);
      diagonals.add(diagonal);
      antiDiagonals.add(antiDiagonal);

      backtrack(row + 1);

      cols.remove(col);
      diagonals.remove(diagonal);
      antiDiagonals.remove(antiDiagonal);
    }

    return count;
  }
}
