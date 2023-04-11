package com.pl2kn.leetcode.problems.medium;

import java.util.Stack;

public class RemovingStarsFromAString2390 {

  public String removeStars(String s) {
    Stack<Character> stack = new Stack<>();

    for (char character : s.toCharArray()) {
      if (character == '*') {
        stack.pop();
      } else {
        stack.push(character);
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    while (!stack.isEmpty()) {
      stringBuilder.append(stack.pop());
    }

    return stringBuilder.reverse().toString();
  }
}
