package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeBasedKeyValueStore981 {
  static class TimeMap {

    private final Map<String, List<Pair>> store;

    public TimeMap() {
      store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
      store.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
      if (!store.containsKey(key)) {
        return "";
      }

      if (store.get(key).get(0).timestamp > timestamp) {
        return "";
      }

      List<Pair> storage = store.get(key);
      int left = 0;
      int right = storage.size();

      while (left < right) {
        int mid = left + (right - left) / 2;
        Pair pair  = storage.get(mid);

        if (pair.timestamp > timestamp) {
          right = mid;
        } else {
          left = mid + 1;
        }
      }

      return storage.get(right - 1).value;
    }

    private static class Pair {

      private final String value;
      private final int timestamp;

      public Pair(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
      }
    }
  }
}
