package com.pl2kn.leetcode.problems.medium;

public class MaximizeTheConfusionOfAnExam2024 {

  public int maxConsecutiveAnswers(String answerKey, int k) {
    int tCount = 0;
    int fCount = 0;
    int result = 0;

    for (int left = 0, right = 0; right < answerKey.length(); right++) {
      char rightAnswer = answerKey.charAt(right);

      if (rightAnswer == 'T') {
        tCount++;
      } else {
        fCount++;
      }

      while (Math.min(tCount, fCount) > k) {
        char leftAnswer = answerKey.charAt(left++);
        if (leftAnswer == 'T') {
          tCount--;
        } else {
          fCount--;
        }
      }

      result = Math.max(result, right - left + 1);
    }

    return result;
  }
}
