package com.fml.shuati;

public class IntegerBreak {

  public static void main(String[] args) {
    //
    System.out.println(integerBreak(2));
    System.out.println(integerBreak(3));
    System.out.println(integerBreak(10));
    System.out.println(integerBreak(5));
    System.out.println(integerBreak(7));
  }

  public static int integerBreak(int n) {
    int[] dp = new int[n + 1];
    dp[2] = 1;
    if (n < 3) {
      return dp[n];
    }

    for (int i = 3; i <= n; ++i) {

      int max = i == n ? 0 : i;
      for (int j = 1; j < i; ++j) {
        // Math.max(j * dp[i - j], j * (i - j)) 在分解和不分解中取最大值
        max = Math.max(max, Math.max(j * dp[i - j], j * (i - j)));
      }

      dp[i] = max;
    }
    return dp[n];
  }
}
