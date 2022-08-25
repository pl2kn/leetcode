package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses22 {

  public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();

    backtrack(result, new StringBuilder(), 0, 0, n);

    return result;
  }

  private void backtrack(List<String> result, StringBuilder current, int openCount, int closeCount, int maxCount) {
    if (current.length() == maxCount * 2) {
      result.add(current.toString());

      return;
    }

    if (openCount < maxCount) {
      current.append("(");
      backtrack(result, current, openCount + 1, closeCount, maxCount);
      current.deleteCharAt(current.length() - 1);
    }

    if (closeCount < openCount) {
      current.append(")");
      backtrack(result, current, openCount, closeCount + 1, maxCount);
      current.deleteCharAt(current.length() - 1);
    }
  }
}
