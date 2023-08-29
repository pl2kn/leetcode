package com.pl2kn.leetcode.problems.medium;

public class MinimumPenaltyForAShop2483 {

  public int bestClosingTime(String customers) {
    int n = customers.length();

    int[] prefixSums = new int[n + 1];
    int[] suffixSums = new int[n + 1];

    for (int i = 1; i < prefixSums.length; i++) {
      prefixSums[i] = prefixSums[i - 1] + (customers.charAt(i - 1) == 'N' ? 1 : 0);
    }

    for (int i = suffixSums.length - 2; i >= 0; i--) {
      suffixSums[i] = suffixSums[i + 1] + (customers.charAt(i) == 'Y' ? 1 : 0);
    }

    int minPenalty = Integer.MAX_VALUE;
    int earliestHour = 0;
    for (int i = 0; i < n + 1; i++) {
      int penalty = prefixSums[i] + suffixSums[i];
      if (penalty < minPenalty) {
        minPenalty = penalty;
        earliestHour = i;
      }
    }

    return earliestHour;
  }
}
