package com.fml.shuati;

import java.util.ArrayList;
import java.util.List;

/** https://leetcode-cn.com/problems/combination-sum/ */
public class CombinationSum {

  public static void main(String[] args) {
    //
    System.out.println(combinationSum(new int[] {2, 3, 6, 7}, 7));
    System.out.println(combinationSum(new int[] {2, 3, 5}, 8));
    System.out.println(combinationSum(new int[] {2}, 1));
    System.out.println(combinationSum(new int[] {1}, 1));
    System.out.println(combinationSum(new int[] {1}, 2));
  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    backtrace(result, path, candidates, 0, target);
    return result;
  }

  public static void backtrace(
      List<List<Integer>> result,
      List<Integer> path,
      int[] candidates,
      int startIndex,
      int target) {
    if (target == 0) {
      result.add(new ArrayList<>(path));
      return;
    }

    if (target < 0) {
      return;
    }

    for (int i = startIndex; i < candidates.length; ++i) {
      var val = candidates[i];
      path.add(val);
      backtrace(result, path, candidates, i, target - val);
      path.remove(path.size() - 1);
    }
  }
}
