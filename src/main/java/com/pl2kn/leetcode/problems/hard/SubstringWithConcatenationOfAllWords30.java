package com.pl2kn.leetcode.problems.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SubstringWithConcatenationOfAllWords30 {

  public List<Integer> findSubstring(String s, String[] words) {
    Map<String, Integer> wordCounts = new HashMap<>();
    for (String word : words) {
      wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
    }

    int wordCount = words.length;
    int wordLength = words[0].length();
    int stringLength = s.length();

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < wordLength; i++) {
      int left = i;
      int matchCount = 0;
      boolean extraWord = false;
      Map<String, Integer> matchedWordCounts = new HashMap<>();
      for (int right = left; right <= stringLength - wordLength; right += wordLength) {
        String rightWord = s.substring(right, right + wordLength);

        if (!wordCounts.containsKey(rightWord)) {
          matchedWordCounts.clear();
          matchCount = 0;
          extraWord = false;
          left = right + wordLength;
        } else {
          while (right - left == wordCount * wordLength || extraWord) {
            String leftWord = s.substring(left, left + wordLength);
            left += wordLength;
            matchedWordCounts.put(leftWord, matchedWordCounts.get(leftWord) - 1);

            if (Objects.equals(matchedWordCounts.get(leftWord), wordCounts.get(leftWord))) {
              extraWord = false;
            } else if (matchedWordCounts.get(leftWord) < wordCounts.get(leftWord)) {
              matchCount--;
            }
          }

          matchedWordCounts.put(rightWord, matchedWordCounts.getOrDefault(rightWord, 0) + 1);
          if (matchedWordCounts.get(rightWord) <= wordCounts.get(rightWord)) {
            matchCount++;
          } else {
            extraWord = true;
          }

          if (matchCount == wordCount) {
            result.add(left);
          }
        }
      }
    }

    return result;
  }
}
