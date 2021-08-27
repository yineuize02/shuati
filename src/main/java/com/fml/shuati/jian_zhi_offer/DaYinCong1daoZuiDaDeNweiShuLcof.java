package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/ */
public class DaYinCong1daoZuiDaDeNweiShuLcof {
  public int[] printNumbers(int n) {

    int target = (int) Math.pow(10, n) - 1;
    int[] result = new int[target];
    for (int i = 0; i < target; ++i) {
      result[i] = i + 1;
    }
    return result;
  }
}
