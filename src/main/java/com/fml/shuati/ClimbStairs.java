package com.fml.shuati;

/** dp https://leetcode-cn.com/problems/climbing-stairs/ */
public class ClimbStairs {

  public int climbStairs(int n) {

    int[] dp = new int[n + 1];

    dp[0] = 0;
    if (n >= 1) {
      dp[1] = 1;
    }

    if (n >= 2) {
      dp[2] = 2;
    }

    for (int i = 3; i < n + 1; ++i) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }

    return dp[n];
  }
}
