package com.zyz.base.easy;

import java.util.Stack;

/**
 *
 * @author yz.zhang
 * @since 2026-01-30
 */

public class Function20 {

  public static void main(String[] args) {

    System.out.println(isValid("){"));
  }

  public static boolean isValid(String s) {
    if (s.length() % 2 == 1) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '{') {
        stack.push('}');
      } else if (c == '(') {
        stack.push(')');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty()||c != stack.pop()) {
        return false;
      }

    }

    return stack.isEmpty();
  }
}



