package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/ */
public class JuZhenZhongDeLuJingLcof {

  public static void main(String[] args) {
    System.out.println(
        exist(
            new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
            "ABCCED"));

    System.out.println(exist(new char[][] {{'a', 'b'}, {'c', 'd'}}, "abcd"));
    System.out.println(exist(new char[][] {{'a', 'b'}, {'d', 'c'}}, "abcd"));
    System.out.println(exist(new char[][] {{'a', 'b'}, {'c', 'd'}}, "acdb"));
    System.out.println(
        exist(
            new char[][] {{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}},
            "ABCESEEEFS"));

    System.out.println(
        exist(
            new char[][] {{'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}},
            "aaaaaaaaaaaaa"));
  }

  public static boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    var start = word.charAt(0);
    boolean result = false;
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        if (start == board[i][j]) {
          result |= check(board, new int[m][n], n, m, j, i, 0, word);
        }
      }
    }
    return result;
  }

  public static boolean check(
      char[][] board, int[][] path, int sizeN, int sizeM, int n, int m, int index, String word) {

    if (path[m][n] == 1) {
      return false;
    }

    var c = word.charAt(index);
    if (c != board[m][n]) {
      return false;
    }

    if (index == word.length() - 1) {
      return true;
    }

    path[m][n] = 1;

    boolean right = false;
    if (n + 1 < sizeN && index + 1 < word.length()) {
      right = check(board, path, sizeN, sizeM, n + 1, m, index + 1, word);
    }

    boolean left = false;
    if (n - 1 >= 0 && index + 1 < word.length()) {
      left = check(board, path, sizeN, sizeM, n - 1, m, index + 1, word);
    }

    boolean up = false;
    if (m - 1 >= 0 && index + 1 < word.length()) {
      up = check(board, path, sizeN, sizeM, n, m - 1, index + 1, word);
    }

    boolean down = false;
    if (m + 1 < sizeM && index + 1 < word.length()) {
      down = check(board, path, sizeN, sizeM, n, m + 1, index + 1, word);
    }

    path[m][n] = 0;

    return right || left || up || down;
  }
}
