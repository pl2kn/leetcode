package com.pl2kn.leetcode.problems.medium;

public class MinimumSpeedToArriveOnTime1870 {

  public int minSpeedOnTime(int[] dist, double hour) {
    int left = 1;
    int right = 10_000_000;
    int minSpeed = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (isSpeedEnough(dist, mid, hour)) {
        minSpeed = mid;
        right = mid - 1;
        ;
      } else {
        left = mid + 1;
      }
    }

    return minSpeed;
  }

  private boolean isSpeedEnough(int[] dist, int speed, double hour) {
    double totalTime = 0.0;
    for (int i = 0; i < dist.length; i++) {
      double time = (double) dist[i] / (double) speed;
      totalTime += (i == dist.length - 1 ? time : Math.ceil(time));
    }
    return totalTime <= hour;
  }
}
