package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWithZeroOrOneLosses2225 {

  public List<List<Integer>> findWinners(int[][] matches) {
    Map<Integer, Integer> lostCount = new HashMap<>();
    for (int[] match : matches) {
      lostCount.put(match[0], lostCount.getOrDefault(match[0], 0));
      lostCount.put(match[1], lostCount.getOrDefault(match[1], 0) + 1);
    }

    List<Integer> notLosers = new ArrayList<>();
    List<Integer> oneMatchLosers = new ArrayList<>();

    for (int player : lostCount.keySet()) {
      if (lostCount.get(player) == 1) {
        oneMatchLosers.add(player);
      } else if (lostCount.get(player) == 0) {
        notLosers.add(player);
      }
    }

    List<List<Integer>> result = new ArrayList<>();
    result.add(notLosers);
    result.add(oneMatchLosers);

    Collections.sort(result.get(0));
    Collections.sort(result.get(1));

    return result;
  }
}
