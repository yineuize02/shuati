package com.fml.shuati.jian_zhi_offer;

/**
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 */
public class DiaoZhengShuZuShunXuShiQiShuWeiYuOuShuQianMianLcof {
  public int[] exchange(int[] nums) {

    int end = nums.length - 1;
    if (end < 0) {
      return nums;
    }

    if (end == 0) {
      return nums;
    }

    int start = 0;

    while (start < end) {
      if (nums[end] % 2 == 0) {
        end--;
        continue;
      }

      if (nums[start] % 2 == 1) {
        start++;
        continue;
      }

      var temp = nums[end];
      nums[end] = nums[start];
      nums[start] = temp;
      start++;
      end--;
    }

    return nums;
  }
}
