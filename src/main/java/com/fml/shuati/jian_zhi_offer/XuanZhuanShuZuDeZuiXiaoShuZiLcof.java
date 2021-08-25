package com.fml.shuati.jian_zhi_offer;

/** https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/ */
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof {
  public int minArray(int[] numbers) {
    int min = numbers[0];
    for (int number : numbers) {
      if (min > number) {
        min = number;
      }
    }

    return min;
  }
}
