package com.fml.shuati;

public class NumTrees {
  public static int numTrees(int n) {
    // dp[3] = dp[2] * dp[0] + dp[1] * dp[1] + dp[0] * dp[2]
    // dp[i] ： 1到i为节点组成的⼆叉搜索树的个数为dp[i]。

    int[] dp = new int[n + 1];
    dp[0] = 1;
    // 递推关系， dp[i] += dp[以j为头结点左⼦树节点数量] * dp[以j为头结
    // 点右⼦树节点数量]
    // j相当于是头结点的元素，从1遍历到i为⽌。
    // 所以递推公式：dp[i] += dp[j - 1] * dp[i - j];
    // ，j-1 为j为头结点左⼦树节点数量，i-j 为以j为头结点右⼦树
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i] += dp[j - 1] * dp[i - j];
      }
    }

    return dp[n];
  }
}
