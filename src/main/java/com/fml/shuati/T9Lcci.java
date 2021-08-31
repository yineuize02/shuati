package com.fml.shuati;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** https://leetcode-cn.com/problems/t9-lcci/ */
public class T9Lcci {

  private Map<Character, String> numMap =
      Map.of(
          '2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno", '7', "pqrs", '8', "tuv", '9',
          "wxyz");

  public List<String> getValidT9Words(String num, String[] words) {

    List<String> result = new ArrayList<>();
    for (String word : words) {
      String[] letters = word.split("");
      StringBuilder number = new StringBuilder();
      for (String letter : letters) {
        for (var key : numMap.keySet()) {
          if (numMap.get(key).contains(letter)) {
            number.append(key);
            break;
          }
        }
      }

      if (number.toString().equals(num)) {
        result.add(word);
      }
    }

    return result;
  }
}
