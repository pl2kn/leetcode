package com.pl2kn.leetcode.problems.medium;

public class GasStation134 {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int stationCount = gas.length;
    int totalMileage = 0;
    int currentMileage = 0;
    int startStation = 0;

    for (int currentStation = 0; currentStation < stationCount; currentStation++) {
      int stationMileage = gas[currentStation] - cost[currentStation];
      totalMileage += stationMileage;
      currentMileage += stationMileage;
      if (currentMileage < 0) {
        startStation = currentStation + 1;
        currentMileage = 0;
      }
    }

    return totalMileage < 0 ? -1 : startStation;
  }
}
