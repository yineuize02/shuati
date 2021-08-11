package com.fml.shuati;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/ */
public class LetterCombinationsOfAPhoneNumber {

  public static void main(String[] args) {
    //

    System.out.println(letterCombinations("23"));
    System.out.println(letterCombinations(""));

    System.out.println(letterCombinations("2"));
  }

  private static Map<Character, String> map =
      Map.of(
          '0', "", '1', "", '2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs",
          '8', "tuv", '9', "wxyz");

  public static List<String> letterCombinations(String digits) {

    List<String> result = new ArrayList<>();
    if (digits.length() == 0) {
      return result;
    }

    List<Character> path = new ArrayList<>();
    List<Character> digitList = new ArrayList<>();
    var dL = digits.toCharArray();
    for (var c : dL) {
      digitList.add(c);
    }

    backTrace(result, path, digitList, 0);
    return result;
  }

  public static void backTrace(
      List<String> result, List<Character> path, List<Character> digits, int startIndex) {

    if (path.size() == digits.size()) {
      StringBuilder sb = new StringBuilder(path.size());
      for (var i : path) {
        sb.append(i);
      }

      result.add(sb.toString());
      return;
    }

    var chars = map.get(digits.get(startIndex)).toCharArray();

    for (int i = 0; i < chars.length; ++i) {
      var ch = chars[i];
      path.add(ch);
      backTrace(result, path, digits, startIndex + 1);
      path.remove(path.size() - 1);
    }
  }
}
