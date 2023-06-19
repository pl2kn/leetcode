package com.pl2kn.leetcode.problems.easy;

public class FindTheHighestAltitude1732 {

  public int largestAltitude(int[] gain) {
    int currentAltitude = 0;
    int highestAltitude = currentAltitude;
    for (int i = 0; i < gain.length; i++) {
      currentAltitude += gain[i];
      highestAltitude = Math.max(highestAltitude, currentAltitude);
    }

    return highestAltitude;
  }
}
