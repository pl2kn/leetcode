package com.pl2kn.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString394Stack {

  public String decodeString(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c != ']') {
        stack.push(c);
      } else {
        List<Character> characterList = new ArrayList<>();
        while (stack.peek() != '[') {
          characterList.add(stack.pop());
        }
        stack.pop();
        int k = 0;
        int base = 1;
        while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
          k += (stack.pop() - '0') * base;
          base *= 10;
        }
        while (k > 0) {
          for (int i = characterList.size() - 1; i >= 0; i--) {
            stack.push(characterList.get(i));
          }
          k--;
        }
      }
    }
    char[] result = new char[stack.size()];
    for (int i = result.length - 1; i >= 0; i--) {
      result[i] = stack.pop();
    }
    return new String(result);
  }
}
