package com.fml.shuati;

public class ImplementStrstr {

  public static void main(String[] args) {
    //
    System.out.println(strStr("hello", "ll"));
    System.out.println(strStr("aaaaa", "bba"));
    System.out.println(strStr("", ""));
    System.out.println(strStr("abbaa", "bbaa"));
  }

  public static int strStr(String haystack, String needle) {

    if (needle.length() == 0) {
      return 0;
    }

    var hl = haystack.length();
    var nl = needle.length();
    int i = 0;

    while (i < hl) {
      if (haystack.charAt(i) != needle.charAt(0)) {
        i++;
        continue;
      }

      if (i + nl > hl) {
        return -1;
      }

      boolean isFound = true;
      for (int j = 0; j < nl; ++j) {
        if (haystack.charAt(i + j) != needle.charAt(j)) {
          isFound = false;
          i++;
          break;
        }
      }

      if (isFound) {
        return i;
      }
    }

    return -1;
  }
}
