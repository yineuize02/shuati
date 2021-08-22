package com.fml.shuati.jian_zhi_offer;

import com.fml.shuati.utils.ListNodeUtils.ListNode;
import java.util.ArrayDeque;
import java.util.Deque;

/** https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/ */
public class CongWeiDaoTouDaYinLianBiaoLcof {

  public int[] reversePrint(ListNode head) {
    Deque<Integer> stack = new ArrayDeque<>();
    ListNode cur = head;
    while (cur != null) {
      stack.push(cur.val);
      cur = cur.next;
    }

    int length = stack.size();
    int[] ii = new int[length];
    for (int i = 0; i < length; ++i) {
      ii[i] = stack.poll();
    }
    return ii;
  }
}
