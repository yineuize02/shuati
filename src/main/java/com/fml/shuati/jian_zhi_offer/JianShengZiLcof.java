package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/jian-sheng-zi-lcof/ */
public class JianShengZiLcof {

  public int cuttingRope(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 1;
    if (n <= 2) {
      return dp[n];
    }

    for (int i = 3; i <= n; ++i) {
      for (int j = 2; j < i; j++) {
        dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
      }
    }

    return dp[n];
  }
}
