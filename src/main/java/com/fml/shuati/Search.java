package com.fml.shuati;

public class Search {

  public static void main(String[] args) {
    //
    System.out.println(search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    System.out.println(search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
    System.out.println(search(new int[] {-1}, 2));
    System.out.println(search(new int[] {-1, 0, 3}, 2));
    System.out.println(search(new int[] {-1, 0, 3}, 0));
  }

  public static int search(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {

      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        return mid;
      }

      if (nums[mid] > target) {
        end = mid - 1;
        continue;
      }

      if (nums[mid] < target) {
        start = mid + 1;
      }
    }

    return -1;
  }
}
