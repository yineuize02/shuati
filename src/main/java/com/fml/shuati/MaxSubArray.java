package com.fml.shuati;

/** 贪心 https://leetcode-cn.com/problems/maximum-subarray/ */
public class MaxSubArray {

  public static void main(String[] args) {
    //
    var tt = new MaxSubArray();
    System.out.println(tt.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  public int maxSubArray(int[] nums) {

    var length = nums.length;
    if (length == 1) {
      return nums[0];
    }

    int maxSum = nums[0];
    int curSum = nums[0];
    for (int i = 1; i < length; ++i) {
      if (curSum < 0) {
        curSum = nums[i];
      } else {
        curSum += nums[i];
      }

      maxSum = Math.max(maxSum, curSum);
    }

    return maxSum;
  }
}
