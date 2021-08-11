package com.fml.shuati;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode-cn.com/problems/combination-sum-iii/ */
public class CombinationSumIii {

  public static void main(String[] args) {
    //

    System.out.println(combinationSum3(3, 9));
    System.out.println(combinationSum3(9, 45));
  }

  public static List<List<Integer>> combinationSum3(int k, int n) {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    backTrace(result, path, k, n, 1);
    return result;
  }

  public static void backTrace(
      List<List<Integer>> result, List<Integer> path, int k, int n, int start) {

    if (0 == n && path.size() == k) {
      result.add(new ArrayList<>(path));
      return;
    }

    if (path.size() >= k) {
      return;
    }

    for (int i = start; i <= 9; ++i) {

      if (n - i < 0) {
        return;
      }

      if (path.contains(i)) {
        return;
      }
      path.add(i);
      backTrace(result, path, k, n - i, start + 1);
      path.remove(path.size() - 1);
    }
  }
}
