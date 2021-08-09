package com.fml.shuati;

import java.util.List;

public class ListNodeUtils {
  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public static ListNode createFromList(List<Integer> list) {

    var size = list.size();
    if (size == 0) {
      return null;
    }

    ListNode head = new ListNode();
    ListNode cur = head;
    for (int i = 0; i < size; ++i) {
      cur.val = list.get(i);
      if (i < size - 1) {
        cur.next = new ListNode();
        cur = cur.next;
      }
    }

    return head;
  }

  public static String printList(ListNode head) {

    StringBuilder sb = new StringBuilder();
    while (head != null) {
      sb.append(head.val);
      sb.append(',');
      head = head.next;
    }

    return sb.toString();
  }
}
