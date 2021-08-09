package com.fml.shuati;

/** https://leetcode-cn.com/problems/minimum-size-subarray-sum/ */
public class MinSubArrayLen {

  public static void main(String[] args) {
    //
    System.out.println(minSubArrayLen(11, new int[] {1, 2, 3, 4, 5}));
    System.out.println(minSubArrayLen(7, new int[] {2, 3, 1, 2, 4, 3}));
    System.out.println(minSubArrayLen(4, new int[] {1, 4, 4}));
    System.out.println(minSubArrayLen(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}));
  }

  public static int minSubArrayLen(int target, int[] nums) {

    int l = nums.length;
    int start = 0;
    int end = 0;
    int result = Integer.MAX_VALUE;
    int sum = 0;

    while (end < l) {
      sum += nums[end];
      while (sum >= target) {
        result = Math.min(result, end - start + 1);
        sum -= nums[start];
        start++;
      }

      end++;
    }

    return result == Integer.MAX_VALUE ? 0 : result;
  }
}
