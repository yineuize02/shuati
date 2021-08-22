package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/ */
public class ErWeiShuZuZhongDeChaZhaoLcof {

  public static void main(String[] args) {
    //

    System.out.println(
        findNumberIn2DArray(
            new int[][] {
              {1, 4, 7, 11, 15},
              {2, 5, 8, 12, 19},
              {3, 6, 9, 16, 22},
              {10, 13, 14, 17, 24},
              {18, 21, 23, 26, 30}
            },
            5));
    ;
  }

  public static boolean findNumberIn2DArray(int[][] matrix, int target) {

    // [
    //  [1,   4,  7, 11, 15],
    //  [2,   5,  8, 12, 19],
    //  [3,   6,  9, 16, 22],
    //  [10, 13, 14, 17, 24],
    //  [18, 21, 23, 26, 30]
    // ]
    // n * m 的二维数组

    int m = matrix.length;
    if (m == 0) {
      return false;
    }

    int n = matrix[0].length;

    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        if (matrix[i][j] == target) {
          return true;
        }

        if (j < n - 1) {
          if (matrix[i][j + 1] > target) {
            if (i < m - 1) {
              break;
            } else {
              return false;
            }
          }
        }
      }
    }

    return false;
  }
}
