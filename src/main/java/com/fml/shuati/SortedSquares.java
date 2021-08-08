package com.fml.shuati;

import java.util.Arrays;

/** 双指针 https://leetcode-cn.com/problems/squares-of-a-sorted-array/ */
public class SortedSquares {
  public static void main(String[] args) {
    //
    System.out.println(Arrays.toString(sortedSquares(new int[] {-2, 0})));

    System.out.println(Arrays.toString(sortedSquares(new int[] {-4, -1, 0, 3, 10})));
    System.out.println(Arrays.toString(sortedSquares(new int[] {-7, -3, 2, 3, 11})));
    System.out.println(Arrays.toString(sortedSquares(new int[] {-7, -3})));
    System.out.println(Arrays.toString(sortedSquares(new int[] {2, 3, 11})));
    System.out.println(Arrays.toString(sortedSquares(new int[] {2})));
    System.out.println(Arrays.toString(sortedSquares(new int[] {-2})));
    System.out.println(
        Arrays.toString(sortedSquares(new int[] {-10000, -9999, -7, -5, 0, 0, 10000})));
  }

  public static int[] sortedSquares(int[] nums) {
    int length = nums.length;

    int[] result = new int[length];

    int start = 0;
    int end = length - 1;
    int lastIdx = length - 1;
    while (start <= end) {
      if (nums[start] * nums[start] < nums[end] * nums[end]) {
        result[lastIdx] = nums[end] * nums[end];
        end--;
      } else {
        result[lastIdx] = nums[start] * nums[start];
        start++;
      }

      lastIdx--;
    }

    return result;
  }
}
