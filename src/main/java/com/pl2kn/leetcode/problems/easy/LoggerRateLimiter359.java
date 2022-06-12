package com.pl2kn.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class LoggerRateLimiter359 {

  class Logger {

    private final Map<String, Integer> messages;

    public Logger() {
      messages = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
      if (messages.containsKey(message)) {
        if (messages.get(message) <= timestamp) {
          messages.put(message, timestamp + 10);

          return true;
        }

        return false;
      }

      messages.put(message, timestamp + 10);

      return true;
    }
  }
}
