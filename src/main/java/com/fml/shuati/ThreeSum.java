package com.fml.shuati;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 双指针 https://leetcode-cn.com/problems/3sum/ */
public class ThreeSum {

  public static void main(String[] args) {
    //

    System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    System.out.println(threeSum(new int[] {0}));
    System.out.println(threeSum(new int[] {0, 0, 0, 0}));
    System.out.println(threeSum(new int[] {3, 0, -2, -1, 1, 2}));
    System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4}));
    System.out.println(threeSum(new int[] {-2, 0, 0, 2, 2}));
  }

  public static List<List<Integer>> threeSum(int[] nums) {

    Arrays.sort(nums);
    int length = nums.length;
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < length; ++i) {
      if (nums[i] > 0) {
        return result;
      }

      // 跳过重复的
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      int start = i + 1;
      int end = length - 1;
      while (start < end) {
        // 跳过重复的
        if (start > i + 1 && nums[start] == nums[start - 1]) {
          start++;
          continue;
        }
        // 跳过重复的
        if (end < length - 1 && nums[end] == nums[end + 1]) {
          end--;
          continue;
        }

        var val = nums[start] + nums[i] + nums[end];
        if (val == 0) {
          result.add(List.of(nums[start], nums[i], nums[end]));
          start++;
          end--;
          continue;
        }

        if (val < 0) {
          start++;
          continue;
        }

        end--;
      }
    }

    return result;
  }
}
