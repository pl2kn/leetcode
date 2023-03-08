package com.pl2kn.leetcode.problems.medium;

public class KokoEatingBananas875 {

  public int minEatingSpeed(int[] piles, int h) {
    int maxPile = 0;
    for (int pile : piles) {
      maxPile = Math.max(maxPile, pile);
    }

    int left = 1;
    int right = maxPile;
    while (left < right) {
      int mid = left + (right - left) / 2;

      if (canEat(piles, h, mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  private boolean canEat(int[] piles, int h, int k) {
    int currentHours = 0;
    for (int pile : piles) {
      currentHours += (pile + k - 1) / k;
    }
    return currentHours <= h;
  }
}
