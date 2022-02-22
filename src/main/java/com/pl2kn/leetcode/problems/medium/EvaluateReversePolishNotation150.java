package com.pl2kn.leetcode.problems.medium;

import java.util.Stack;

public class EvaluateReversePolishNotation150 {

  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();
    int a;
    int b;
    for (String token : tokens) {
      switch (token) {
        case "+":
          stack.push(stack.pop() + stack.pop());
          break;
        case "-":
          b = stack.pop();
          a = stack.pop();
          stack.push(a - b);
          break;
        case "*":
          stack.push(stack.pop() * stack.pop());
          break;
        case "/":
          b = stack.pop();
          a = stack.pop();
          stack.push(a / b);
          break;
        default:
          stack.push(Integer.parseInt(token));
          break;
      }
    }
    return stack.pop();
  }
}
