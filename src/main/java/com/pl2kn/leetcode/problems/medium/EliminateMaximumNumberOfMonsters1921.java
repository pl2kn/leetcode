package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class EliminateMaximumNumberOfMonsters1921 {

  public int eliminateMaximum(int[] dist, int[] speed) {
    int n = dist.length;

    double[] time = new double[n];
    for (int i = 0; i < n; i++) {
      time[i] = (double) dist[i] / speed[i];
    }

    Arrays.sort(time);

    int currentTime = 0;
    for (double monsterTime : time) {
      if (monsterTime <= currentTime) {
        return currentTime;
      }
      currentTime++;
    }

    return n;
  }
}
