package com.pl2kn.leetcode.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TopKFrequentElements347QuickSelectTest {

  @Test
  public void Simple_Test() {
    TopKFrequentElements347QuickSelect solution = new TopKFrequentElements347QuickSelect();
    solution.topKFrequent(new int[]{5, 2, 5, 3, 5, 3, 1, 1, 3}, 2);
  }
}
