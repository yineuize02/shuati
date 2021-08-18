package com.fml.shuati;

import java.util.Arrays;

/** https://leetcode-cn.com/problems/3sum-closest/ */
public class ThreeSumClosest {

  public static void main(String[] args) {
    //
    System.out.println(threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
  }

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);

    int closet = nums[0] + nums[1] + nums[2];
    int diff0 = Math.abs(closet - target);

    for (int i = 0; i < nums.length - 2; ++i) {
      int j = i + 1;
      int k = nums.length - 1;
      while (j < k) {
        var value = nums[i] + nums[j] + nums[k];
        var diff = Math.abs(value - target);
        if (diff <= diff0) {
          closet = value;
          diff0 = diff;
        }

        if (value > target) {
          k--;
        } else {
          j++;
        }
      }
    }

    return closet;
  }
}
