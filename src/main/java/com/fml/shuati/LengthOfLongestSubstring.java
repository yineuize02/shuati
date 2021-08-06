package com.fml.shuati;

import java.util.HashSet;

/** 滑动窗口 https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/ */
public class LengthOfLongestSubstring {

  public static void main(String[] args) {
    //

    var tt = new LengthOfLongestSubstring();
    int r = 0;
    r = tt.lengthOfLongestSubstring("abc");
    System.out.println(r);
    r = tt.lengthOfLongestSubstring("dvdf");
    System.out.println(r);
    r = tt.lengthOfLongestSubstring(" ");
    System.out.println(r);

    r = tt.lengthOfLongestSubstring("aabaab!bb");
    System.out.println(r);
  }

  public int lengthOfLongestSubstring(String s) {

    var set = new HashSet<Character>(s.length());
    int maxL = 0;
    int preIndex = 0;
    for (int i = 0; i < s.length(); ++i) {
      var c = s.charAt(i);
      if (set.contains(c)) {
        if (maxL < set.size()) {
          maxL = set.size();
        }

        while (true) {
          if (preIndex >= i) {
            break;
          }

          var preChar = s.charAt(preIndex);
          set.remove(preChar);
          preIndex++;

          if (!set.contains(c)) {
            break;
          }
        }
      }

      set.add(c);
    }

    if (maxL < set.size()) {
      maxL = set.size();
    }

    return maxL;
  }
}
