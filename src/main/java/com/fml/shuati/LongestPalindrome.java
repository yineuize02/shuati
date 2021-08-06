package com.fml.shuati;

/** https://leetcode-cn.com/problems/longest-palindromic-substring/ */
public class LongestPalindrome {

  /** @param args */
  public static void main(String[] args) {
    //

    var tt = new LongestPalindrome();
    System.out.println(tt.longestPalindrome("babad"));
    System.out.println(tt.longestPalindrome("cbbd"));
    System.out.println(tt.longestPalindrome("a"));
    System.out.println(tt.longestPalindrome("ac"));
  }

  public String longestPalindrome(String s) {

    var strLength = s.length();
    boolean[][] arr = new boolean[strLength][strLength];
    for (int i = 0; i < strLength; ++i) {
      arr[i][i] = true;
    }

    var chars = s.toCharArray();

    int maxLen = 1;
    int start = 0;
    for (int len = 2; len <= strLength; ++len) {
      for (int i = 0; i < strLength - len + 1; ++i) {
        int j = i + len - 1;

        if (chars[i] == chars[j]) {
          if (j - i <= 2) {
            arr[i][j] = true;
          } else {
            arr[i][j] = arr[i + 1][j - 1];
          }
        } else {
          arr[i][j] = false;
        }

        if (arr[i][j] && j - i + 1 > maxLen) {
          maxLen = j - i + 1;
          start = i;
        }
      }
    }

    var result = s.substring(start, start + maxLen);

    return result;
  }
}
