package com.fml.shuati;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/** https://leetcode-cn.com/problems/valid-parentheses/ */
public class ValidParentheses {

  public static void main(String[] args) {
    //
    System.out.println(isValid("()"));
    System.out.println(isValid("([)]"));
    System.out.println(isValid("()[]{}"));
    System.out.println(isValid("(]"));
    System.out.println(isValid("{[]}"));
    System.out.println(isValid("{"));
    System.out.println(isValid("{{"));
    System.out.println(isValid("}{"));
  }

  public static boolean isValid(String s) {

    if (s.length() % 2 == 1) {
      return false;
    }

    Deque<Character> stack = new ArrayDeque<Character>();
    Map<Character, Character> map = Map.of('(', ')', '{', '}', '[', ']');
    for (int i = 0; i < s.length(); ++i) {
      var c = s.charAt(i);
      if (map.containsKey(c)) {
        stack.push(c);
        continue;
      }

      var left = stack.poll();
      if (left == null || map.get(left) == null || map.get(left) != c) {
        return false;
      }
    }

    return stack.size() == 0;
  }
}
