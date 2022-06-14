package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku36 {

  public boolean isValidSudoku(char[][] board) {
    int n = board.length;

    List<Set<Character>> rows = new ArrayList<>();
    List<Set<Character>> columns = new ArrayList<>();
    List<Set<Character>> squares = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      rows.add(i, new HashSet<>());
      columns.add(i, new HashSet<>());
      squares.add(i, new HashSet<>());
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        char cell = board[i][j];

        if (cell == '.') {
          continue;
        }

        if (rows.get(i).contains(cell)) {
          return false;
        }
        rows.get(i).add(cell);

        if (columns.get(j).contains(cell)) {
          return false;
        }
        columns.get(j).add(cell);

        int squareId = j / 3 * 3 + i / 3;
        if (squares.get(squareId).contains(cell)) {
          return false;
        }
        squares.get(squareId).add(cell);
      }
    }

    return true;
  }
}
