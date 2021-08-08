package com.fml.shuati;

/** 数组 https://leetcode-cn.com/problems/remove-element/ */
public class RemoveElement {

  public static void main(String[] args) {
    //
    System.out.println(removeElement(new int[] {3, 2, 2, 3}, 3));
    System.out.println(removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
  }

  public static int removeElement(int[] nums, int val) {

    int lastIdx = nums.length - 1;

    for (int i = nums.length - 1; i >= 0; --i) {

      if (nums[i] == val) {
        if (i != lastIdx && nums[lastIdx] != val) {
          int t = nums[i];
          nums[i] = nums[lastIdx];
          nums[lastIdx] = t;
        }

        lastIdx--;
      }
    }

    var result = lastIdx + 1;

    return result;
  }
}
