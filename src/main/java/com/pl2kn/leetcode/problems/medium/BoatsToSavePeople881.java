package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class BoatsToSavePeople881 {

  public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);

    int left = 0;
    int right = people.length - 1;
    int boatCount = 0;
    while (left <= right) {
      if (people[left] + people[right] <= limit) {
        left++;
      }
      right--;
      boatCount++;
    }

    return boatCount;
  }
}
