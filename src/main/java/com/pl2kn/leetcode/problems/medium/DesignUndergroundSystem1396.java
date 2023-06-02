package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class DesignUndergroundSystem1396 {

  class UndergroundSystem {

    private final Map<Integer, Customer> customers;
    private final Map<String, Map<String, TripCounter>> times;

    public UndergroundSystem() {
      customers = new HashMap<>();
      times = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
      if (!customers.containsKey(id)) {
        customers.put(id, new Customer(id));
      }
      customers.get(id).checkIn(stationName, t);

      if (!times.containsKey(stationName)) {
        times.put(stationName, new HashMap<>());
      }
    }

    public void checkOut(int id, String stationName, int t) {
      Customer customer = customers.get(id);
      customer.checkOut(stationName, t);

      Map<String, TripCounter> checkInStation = times.get(customer.getCheckInStation());

      if (!checkInStation.containsKey(customer.getCheckOutStation())) {
        checkInStation.put(customer.getCheckInStation(), new TripCounter());
      }

      TripCounter tripCounter = checkInStation.get(customer.getCheckOutStation());
      tripCounter.incTotalTime(customer.getCheckOutTime() - customer.getCheckInTime());
    }

    public double getAverageTime(String startStation, String endStation) {
      return times.get(startStation).get(endStation).getAverage();
    }

    class Customer {

      private final int id;
      private String checkInStation;
      private int checkInTime;
      private String checkOutStation;
      private int checkOutTime;

      public Customer(int id) {
        this.id = id;
      }

      public int getId() {
        return id;
      }

      public void checkIn(String station, int time) {
        checkInStation = station;
        checkInTime = time;
      }

      public void checkOut(String station, int time) {
        checkOutStation = station;
        checkOutTime = time;
      }

      public String getCheckInStation() {
        return checkInStation;
      }

      public int getCheckInTime() {
        return checkInTime;
      }

      public String getCheckOutStation() {
        return checkOutStation;
      }

      public int getCheckOutTime() {
        return checkOutTime;
      }

      public int getTripTime() {
        return checkOutTime - checkInTime;
      }
    }

    class TripCounter {

      private int totalTime;
      private int tripCount;

      public int getTotalTime() {
        return totalTime;
      }

      public int getTripCount() {
        return tripCount;
      }

      public void incTotalTime(int time) {
        totalTime += time;
        tripCount++;
      }

      public double getAverage() {
        return (double) totalTime / tripCount;
      }
    }
  }
}
