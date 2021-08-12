package com.fml.shuati;

/** https://leetcode-cn.com/problems/container-with-most-water/ */
public class ContainerWithMostWater {

  public static void main(String[] args) {
    //
    System.out.println(maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    System.out.println(maxArea(new int[] {1, 1}));
  }

  public static int maxArea(int[] height) {

    int max = 0;
    int start = 0;
    int end = height.length - 1;
    while (start < end) {
      int s = Math.min(height[start], height[end]) * (end - start);
      if (s > max) {
        max = s;
      }

      if (height[start] <= height[end]) {
        start++;
        continue;
      }

      if (height[start] > height[end]) {
        end--;
      }
    }

    return max;
  }

  //  public int maxArea(int[] height) {
  //
  //    int max = 0;
  //    for (int i = 0; i < height.length - 1; ++i) {
  //      for (int j = i + 1; j < height.length; ++j) {
  //        int s = Math.min(height[i], height[j]) * (j - i);
  //        max = Math.max(max, s);
  //      }
  //    }
  //
  //    return max;
  //  }
}
