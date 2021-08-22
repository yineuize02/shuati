package com.fml.shuati.jian_zhi_offer;

import java.util.ArrayDeque;
import java.util.Deque;

/** https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/ */
public class YongLiangGeZhanShiXianDuiLieLcof {

  class CQueue {

    private Deque<Integer> stackTail = new ArrayDeque<>();
    private Deque<Integer> stackHead = new ArrayDeque<>();

    public CQueue() {}

    public void appendTail(int value) {

      stackTail.push(value);
    }

    public int deleteHead() {

      if (stackHead.size() == 0 && stackTail.size() == 0) {
        return -1;
      }

      if (stackHead.size() > 0) {
        return stackHead.poll();
      }

      while (stackTail.size() > 0) {
        stackHead.push(stackTail.poll());
      }

      return stackHead.poll();
    }
  }
  /**
   * Your CQueue object will be instantiated and called as such: CQueue obj = new CQueue();
   * obj.appendTail(value); int param_2 = obj.deleteHead();
   */
}
