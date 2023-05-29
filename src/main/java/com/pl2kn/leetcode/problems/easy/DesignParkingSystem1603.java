package com.pl2kn.leetcode.problems.easy;

public class DesignParkingSystem1603 {

  class ParkingSystem {

    private final int[] slots;

    public ParkingSystem(int big, int medium, int small) {
      slots = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
      return slots[carType - 1]-- > 0;
    }
  }
}
