package com.pl2kn.leetcode.problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordBreak139 {

  public boolean wordBreak(String s, List<String> wordDict) {
    return wb(s, new HashSet<>(wordDict), new HashMap<>());
  }

  private boolean wb(String s, Set<String> set, Map<String, Boolean> memo) {
    int length = s.length();

    if (length == 0) {
      return true;
    }

    if (memo.containsKey(s)) {
      return memo.get(s);
    }

    for (int i = 1; i <= length; i++) {
      if (set.contains(s.substring(0, i)) && wb(s.substring(i), set, memo)) {
        memo.put(s, true);
        return memo.get(s);
      }
    }

    memo.put(s, false);
    return false;
  }
}
