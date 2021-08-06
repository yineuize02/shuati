package com.fml.shuati;

/** https://leetcode-cn.com/problems/unique-paths/ */
public class UniquePaths {

  public static void main(String[] args) {
    //
    var tt = new UniquePaths();
    System.out.println(tt.uniquePaths(3, 7));
    System.out.println(tt.uniquePaths(3, 2));
    System.out.println(tt.uniquePaths(7, 3));
    System.out.println(tt.uniquePaths(3, 3));
  }

  public int uniquePaths(int m, int n) {
    // m行 n列
    int[][] dp = new int[m + 1][n + 1];

    for (int i = 0; i <= m; ++i) {
      for (int j = n; j >= 0; --j) {
        if (i == 0) {
          dp[i][j] = 1;
          continue;
        }

        if (j == n) {
          dp[i][j] = 1;
          continue;
        }

        dp[i][j] = dp[i - 1][j] + dp[i][j + 1];
      }
    }

    return dp[m - 1][1];
  }
}
