package com.fml.shuati;

/** 01背包 https://leetcode-cn.com/problems/partition-equal-subset-sum/ */
public class CanPartition {

  public static boolean canPartition(int[] nums) {

    int sum = 0;
    for (var i : nums) {
      sum += i;
    }
    if (sum % 2 == 1) {
      return false;
    }

    int target = sum / 2;
    int[] dp = new int[100001];

    for (int i = 0; i < nums.length; i++) {
      // 每⼀个元素⼀定是不可重复放⼊，所以从⼤到⼩遍历
      for (int j = target; j >= nums[i]; j--) {
        dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
      }
    }
    // 集合中的元素正好可以凑成总和target
    return dp[target] == target;
  }
}
