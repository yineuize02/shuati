package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/ */
public class TiHuanKongGeLcof {
  public String replaceSpace(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); ++i) {
      var ch = s.charAt(i);
      if (ch != ' ') {
        sb.append(ch);
      } else {
        sb.append("%20");
      }
    }

    return sb.toString();
  }
}
