package com.fml.shuati;

/** https://leetcode-cn.com/problems/search-a-2d-matrix-ii/ */
public class SearchA2dMatrixIi {
  public boolean searchMatrix(int[][] matrix, int target) {

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
