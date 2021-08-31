package com.fml.shuati.jian_zhi_offer;

import java.util.Deque;
import java.util.LinkedList;

/** https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/ */
public class BaoHanMinhanShuDeZhanLcof {
  static class MinStack {

    private Deque<Integer> q1 = new LinkedList<>();
    private Deque<Integer> q2 = new LinkedList<>();

    /** initialize your data structure here. */
    public MinStack() {}

    public void push(int x) {
      q1.push(x);
      if (q2.size() == 0 || q2.peek() >= x) {
        q2.push(x);
      }
    }

    public void pop() {
      int x = q1.pop();
      if (q2.size() > 0 && q2.peek().equals(x)) {
        q2.pop();
      }
    }

    public int top() {
      if (q1.size() == 0) {
        return 0;
      }

      return q1.peek();
    }

    public int min() {
      if (q2.size() == 0) {
        return 0;
      }

      return q2.peek();
    }
  }

  /**
   * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack();
   * obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4 = obj.min();
   */
}
