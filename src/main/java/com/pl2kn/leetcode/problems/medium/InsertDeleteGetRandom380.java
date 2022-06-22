package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom380 {

  class RandomizedSet {

    private final Map<Integer, Integer> map;

    private final List<Integer> list;

    private final Random random;

    public RandomizedSet() {
      map = new HashMap<>();
      list = new ArrayList<>();
      random = new Random();
    }

    public boolean insert(int val) {
      if (map.containsKey(val)) {
        return false;
      }

      map.put(val, list.size());
      list.add(val);

      return true;
    }

    public boolean remove(int val) {
      if (!map.containsKey(val)) {
        return false;
      }

      int last = list.get(list.size() - 1);
      int index = map.get(val);
      list.set(index, last);
      map.put(last, index);
      list.remove(list.size() - 1);
      map.remove(val);

      return true;
    }

    public int getRandom() {
      return list.get(random.nextInt(list.size() - 1));
    }
  }
}
