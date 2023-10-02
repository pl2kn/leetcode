package com.pl2kn.leetcode.problems.medium;

public class RemoveColoredPiecesIfBothNeighborsAreTheSameColor2038 {

  public boolean winnerOfGame(String colors) {
    int allice = 0;
    int bob = 0;

    for (int i = 1; i < colors.length() - 1; i++) {
      if (colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)) {
        if (colors.charAt(i) == 'A') {
          allice++;
        } else {
          bob++;
        }
      }
    }

    return allice > bob;
  }
}
