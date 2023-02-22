package com.pl2kn.leetcode.problems.medium;

public class CapacityToShipPackagesWithinDDays1011 {

  public int shipWithinDays(int[] weights, int days) {
    int minCapacity = 0;
    int maxCapacity = 0;
    for (int weight : weights) {
      minCapacity = Math.max(minCapacity, weight);
      maxCapacity += weight;
    }

    int left = minCapacity;
    int right = maxCapacity;
    while (left < right) {
      int mid = left + (right - left) / 2;

      if (fits(weights, mid, days)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  private boolean fits(int[] weights, int capacity, int days) {
    int currentWeight = 0;
    int daysNeeded = 1;
    for (int weight : weights) {
      currentWeight += weight;
      if (currentWeight > capacity) {
        currentWeight = weight;
        daysNeeded++;
      }
    }

    return daysNeeded <= days;
  }
}
