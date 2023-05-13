package com.pl2kn.leetcode.problems.medium;

public class SolvingQuestionsWithBrainpower2140TopDown {

  public long mostPoints(int[][] questions) {
    return mostPoints(questions, 0, new Long[questions.length]);
  }

  private long mostPoints(int[][] questions, int i, Long[] memo) {
    if (i >= questions.length) {
      return 0;
    }

    if (memo[i] != null) {
      return memo[i];
    }

    return memo[i] = Math.max(
        mostPoints(questions, i + 1, memo),
        questions[i][0] + mostPoints(questions, i + questions[i][1] + 1, memo)
    );
  }
}
