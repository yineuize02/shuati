package com.fml.shuati.jian_zhi_offer;

import java.util.Arrays;

/** https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/ */
public class ShuZuZhongZhongFuDeShuZiLcof {
  public int findRepeatNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 1; i < nums.length; ++i) {
      if (nums[i] == nums[i - 1]) {
        return nums[i];
      }
    }

    return 0;
  }
}
