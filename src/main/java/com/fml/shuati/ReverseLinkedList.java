package com.fml.shuati;

import com.fml.shuati.ListNodeUtils.ListNode;
import java.util.List;

/** https://leetcode-cn.com/problems/reverse-linked-list/ */
public class ReverseLinkedList {

  public static void main(String[] args) {
    //
    System.out.println(
        ListNodeUtils.printList(reverseList(ListNodeUtils.createFromList(List.of(1, 2)))));
    System.out.println(reverseList(null));
  }

  public static ListNode reverseList(ListNode head) {

    ListNode pre = null;
    ListNode cur = head;
    while (cur != null) {
      var next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }

    return pre;
  }
}
