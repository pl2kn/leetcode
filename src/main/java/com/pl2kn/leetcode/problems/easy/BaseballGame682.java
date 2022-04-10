package com.pl2kn.leetcode.problems.easy;

import java.util.Stack;

public class BaseballGame682 {

  public int calPoints(String[] ops) {
    Stack<Integer> stack = new Stack<>();
    for (String op : ops) {
      switch (op) {
        case "D":
          stack.add(stack.peek() * 2);
          break;
        case "C":
          stack.pop();
          break;
        case "+":
          int top = stack.pop();
          stack.add(top);
          stack.add(stack.peek() + top);
          break;
        default:
          stack.add(Integer.parseInt(op));
          break;
      }
    }
    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;
  }
}
