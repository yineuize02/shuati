package com.fml.shuati;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** https://leetcode-cn.com/problems/generate-parentheses/ */
public class GenerateParentheses {

  public static void main(String[] args) {
    //
    System.out.println(generateParenthesis(3));
  }

  public static List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    List<Character> path = new LinkedList<>();
    backTrace(result, path, 0, 0, n);
    return result;
  }

  public static void backTrace(
      List<String> result, List<Character> path, int open, int close, int n) {
    if (path.size() == n * 2) {
      StringBuilder sb = new StringBuilder(path.size());
      for (var c : path) {
        sb.append(c);
      }

      result.add(sb.toString());
      return;
    }

    if (open < n) {
      path.add('(');
      backTrace(result, path, open + 1, close, n);
      path.remove(path.size() - 1);
    }

    if (close < open) {
      path.add(')');
      backTrace(result, path, open, close + 1, n);
      path.remove(path.size() - 1);
    }
  }
}
