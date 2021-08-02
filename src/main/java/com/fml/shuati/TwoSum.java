package com.fml.shuati;

import java.util.HashMap;

/** https://leetcode-cn.com/problems/two-sum/ */
public class TwoSum {
  public int[] twoSum(int[] nums, int target) {

    var size = nums.length;
    var map = new HashMap<Integer, Integer>(nums.length);
    for (int i = 0; i < size; ++i) {
      map.put(nums[i], i);
    }

    Integer result0 = 0;
    Integer result1 = null;

    for (int i = 0; i < size; ++i) {
      Integer d = target - nums[i];
      var idx = map.get(d);
      if (idx != null) {
        result0 = i;
        result1 = idx;
        if (!result0.equals(result1)) {
          break;
        }
      }
    }

    int[] re = new int[2];
    re[0] = result0;
    re[1] = result1;
    return re;
  }
}
