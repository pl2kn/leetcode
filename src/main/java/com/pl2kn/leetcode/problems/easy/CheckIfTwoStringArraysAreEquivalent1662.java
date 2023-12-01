package com.pl2kn.leetcode.problems.easy;

public class CheckIfTwoStringArraysAreEquivalent1662 {

  public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    int wordPointer1 = 0;
    int stringPointer1 = 0;
    int wordPointer2 = 0;
    int stringPointer2 = 0;

    while (wordPointer1 < word1.length && wordPointer2 < word2.length) {
      if (word1[wordPointer1].charAt(stringPointer1++) != word2[wordPointer2].charAt(
          stringPointer2++)) {
        return false;
      }

      if (stringPointer1 == word1[wordPointer1].length()) {
        wordPointer1++;
        stringPointer1 = 0;
      }

      if (stringPointer2 == word2[wordPointer2].length()) {
        wordPointer2++;
        stringPointer2 = 0;
      }
    }

    return wordPointer1 == word1.length && wordPointer2 == word2.length;
  }
}
