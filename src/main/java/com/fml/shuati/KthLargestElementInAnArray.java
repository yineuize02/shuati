package com.fml.shuati;

import java.util.PriorityQueue;

/** https://leetcode-cn.com/problems/kth-largest-element-in-an-array/ */
public class KthLargestElementInAnArray {
  public static void main(String[] args) {
    //
    System.out.println(findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2));
    System.out.println(findKthLargest(new int[] {3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }

  public static int findKthLargest(int[] nums, int k) {

    PriorityQueue<Integer> queue = new PriorityQueue<>();

    for (int i = 0; i < k; ++i) {
      queue.add(nums[i]);
    }

    for (int i = k; i < nums.length; ++i) {
      if (nums[i] > queue.peek()) {
        queue.poll();
        queue.offer(nums[i]);
      }
    }

    return queue.peek();
  }
}
