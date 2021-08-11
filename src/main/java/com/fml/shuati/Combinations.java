package com.fml.shuati;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/** https://leetcode-cn.com/problems/combinations/ */
public class Combinations {

  public static void main(String[] args) {
    //
    System.out.println(combine(4, 2));
  }

  public static List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    backTrace(result, path, 1, n, k);
    return result;
  }

  public static void backTrace(
      List<List<Integer>> result, List<Integer> path, int start, int n, int k) {

    if (path.size() == k) {
      result.add(new ArrayList<>(path));
      return;
    }

    for (int i = start; i <= n; ++i) {
      path.add(i);
      backTrace(result, path, i + 1, n, k);
      path.remove(path.size() - 1);
    }
  }
}
