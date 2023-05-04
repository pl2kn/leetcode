package com.pl2kn.leetcode.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate649 {

  public String predictPartyVictory(String senate) {
    Queue<Character> queue = new LinkedList<>();
    int radiantCount = 0;
    int direCount = 0;
    for (char party : senate.toCharArray()) {
      queue.add(party);

      if (party == 'R') {
        radiantCount++;
      }

      if (party == 'D') {
        direCount++;
      }
    }

    int radiantBannedCount = 0;
    int direBannedCount = 0;
    while (radiantCount > 0 && direCount > 0) {
      int queueSize = queue.size();

      for (int i = 0; i < queueSize; i++) {
        char party = queue.remove();
        if (party == 'R') {
          if (radiantBannedCount == 0) {
            queue.add(party);
            direBannedCount++;
          } else {
            radiantBannedCount--;
            radiantCount--;
          }
        }

        if (party == 'D') {
          if (direBannedCount == 0) {
            queue.add(party);
            radiantBannedCount++;
          } else {
            direBannedCount--;
            direCount--;
          }
        }
      }
    }

    return radiantCount > 0 ? "Radiant" : "Dire";
  }
}
