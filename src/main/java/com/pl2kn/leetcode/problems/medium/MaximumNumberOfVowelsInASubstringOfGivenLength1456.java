package com.pl2kn.leetcode.problems.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength1456 {

  public int maxVowels(String s, int k) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    int maxCount = 0;
    int currentCount = 0;
    for (int left = 0, right = 0; right < s.length(); right++) {
      char rightLetter = s.charAt(right);
      if (vowels.contains(rightLetter)) {
        currentCount++;
      }

      maxCount = Math.max(maxCount, currentCount);

      if (right >= k - 1) {
        char leftLetter = s.charAt(left++);
        if (vowels.contains(leftLetter)) {
          currentCount--;
        }
      }
    }

    return maxCount;
  }
}
