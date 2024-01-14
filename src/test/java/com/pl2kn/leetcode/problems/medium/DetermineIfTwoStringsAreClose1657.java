package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose1657 {

  public boolean closeStrings(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }

    int[] freqs1 = new int[26];
    int[] freqs2 = new int[26];
    for (int i = 0; i < word1.length(); i++) {
      freqs1[word1.charAt(i) - 'a']++;
      freqs2[word2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < 26; i++) {
      if (freqs1[i] > 0 ^ freqs2[i] > 0) {
        return false;
      }
    }

    Arrays.sort(freqs1);
    Arrays.sort(freqs2);

    for (int i = 25; i >= 0; i--) {
      if (freqs1[i] == 0) {
        break;
      }

      if (freqs1[i] != freqs2[i]) {
        return false;
      }
    }

    return true;
  }
}
