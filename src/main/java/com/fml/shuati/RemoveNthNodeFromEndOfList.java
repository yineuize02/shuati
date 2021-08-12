package com.fml.shuati;

import com.fml.shuati.utils.ListNodeUtils;
import com.fml.shuati.utils.ListNodeUtils.ListNode;
import java.util.List;

/** https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/ */
public class RemoveNthNodeFromEndOfList {

  public static void main(String[] args) {
    //
    System.out.println(
        ListNodeUtils.printList(removeNthFromEnd(ListNodeUtils.createFromList(List.of(1, 2)), 2)));
    System.out.println(
        ListNodeUtils.printList(
            removeNthFromEnd(ListNodeUtils.createFromList(List.of(1, 2, 3, 4, 5)), 2)));
    System.out.println(
        ListNodeUtils.printList(removeNthFromEnd(ListNodeUtils.createFromList(List.of(1)), 1)));
    System.out.println(
        ListNodeUtils.printList(removeNthFromEnd(ListNodeUtils.createFromList(List.of(1, 2)), 1)));
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {

    var cur = head;
    var dummy = head;
    for (int i = 0; i < n; ++i) {
      dummy = dummy.next;
    }

    if (dummy == null) {
      return head.next;
    }

    while (dummy.next != null) {
      cur = cur.next;
      dummy = dummy.next;
    }

    if (cur.next != null) {
      cur.next = cur.next.next;
    }

    return head;
  }
}
