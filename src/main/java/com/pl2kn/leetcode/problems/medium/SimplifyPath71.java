package com.pl2kn.leetcode.problems.medium;

import java.util.Stack;

public class SimplifyPath71 {

  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    for (String pathUri : path.split("/")) {
      if (pathUri.equals("") || pathUri.equals(".")) {
        continue;
      }

      if (pathUri.equals("..")) {
        if (!stack.isEmpty()) {
          stack.pop();
        }
      } else {
        stack.push(pathUri);
      }
    }

    if (stack.isEmpty()) {
      return "/";
    }

    StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()) {
      stringBuilder.insert(0, '/' + stack.pop());
    }

    return stringBuilder.toString();
  }
}
