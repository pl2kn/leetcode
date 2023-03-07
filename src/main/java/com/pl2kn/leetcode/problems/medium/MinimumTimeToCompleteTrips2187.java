package com.pl2kn.leetcode.problems.medium;

public class MinimumTimeToCompleteTrips2187 {

  public long minimumTime(int[] time, int totalTrips) {
    long min = Integer.MAX_VALUE;
    for (int tripTime : time) {
      min = Math.min(min, tripTime);
    }

    long left = 1;
    long right = min * totalTrips;
    while (left < right) {
      long mid = left + (right - left) / 2;

      if (isEnoughTime(time, totalTrips, mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  private boolean isEnoughTime(int[] time, int totalTrips, long currentTime) {
    long trips = 0;
    for (int tripTime : time) {
      trips += currentTime / tripTime;
    }
    return trips >= totalTrips;
  }
}
